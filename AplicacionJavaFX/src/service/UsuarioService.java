package service;

import java.security.NoSuchAlgorithmException;

import javax.management.ObjectName;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
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

	public String consultarUsuario(String email) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		
		
		Bson filter = Filters.eq("email", new ObjectId(email));
		FindIterable<Usuario> result = c.find(filter);
		
		
		return result.first().toString();
		
		
	}
	
//	public Boolean consultarEmail(String email) {
//		MongoDatabase db = MongoSession.getDatabase();
//		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
//	}

	// Encriptar pass

	public String encriptarPass(String pass) throws NoSuchAlgorithmException {
		SHA2Hash e = new SHA2Hash();

		byte[] sha = e.getSHA(pass);

		String output = e.toHexString(sha);

		return output;

	}
	
	public void consultarTest(String email) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Usuario> c = db.getCollection("usuario", Usuario.class);
		
		Document searchQuery = new Document();
		searchQuery.put("name", "John");
		FindIterable<Usuario> cursor = c.find(searchQuery);
		
		try (final MongoCursor<Usuario> cursorIterator = cursor.cursor()) {
		    while (cursorIterator.hasNext()) {
		        System.out.println(cursorIterator.next());
		    }
		}
	}

}
