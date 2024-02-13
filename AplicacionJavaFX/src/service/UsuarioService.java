package service;

import java.security.NoSuchAlgorithmException;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.TextSearchOptions;
import com.mongodb.client.result.InsertOneResult;

import modelo.Usuario;

public class UsuarioService {

	public String insertarUsuario(Usuario user) throws NoSuchAlgorithmException {
		String pass = user.getPass();
		pass = encriptarPass(pass);
		user.setPass(pass);
		
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		InsertOneResult result = c.insertOne(user);
		return result.getInsertedId().toString();
	}

	public Usuario consultarUsuario(String nombre) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		//Bson filter = Filters.eq("nombre", new ObjectId(nombre));
		TextSearchOptions options = new TextSearchOptions().caseSensitive(true);
		Bson filter = Filters.text(nombre, options);
		FindIterable<Usuario> result = c.find(filter);
		return result.first();
	}

	// Encriptar pass

	public String encriptarPass(String pass) throws NoSuchAlgorithmException {
		SHA2Hash e = new SHA2Hash();

		byte[] sha = e.getSHA(pass);

		String output = e.toHexString(sha);

		return output;

	}

}
