package service;

import java.security.NoSuchAlgorithmException;

import org.bson.conversions.Bson;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;

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
		Bson filter = Filters.eq("nombre", nombre);
		FindIterable<Usuario> result = c.find(filter);
		return result.first();
	}
	
	public void updateUsuarioPass(String email, String pass) throws NoSuchAlgorithmException {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		Bson filter = Filters.eq("email", email);
		pass = encriptarPass(pass);
		Bson updates = Updates.addToSet("pass", pass);
		UpdateResult result = c.updateOne(filter, updates);
		System.out.println("Documento actualizado : " + result.getModifiedCount());
	}
	
	public Usuario consultarEmail(String email) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		Bson filter = Filters.eq("email", email);
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
