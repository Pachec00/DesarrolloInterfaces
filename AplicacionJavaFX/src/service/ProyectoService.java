package service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

import modelo.Proyecto;
import modelo.Usuario;

public class ProyectoService {

	//Consultar proyecto desde el comboBox
	public List<Proyecto> consultarProyecto(Usuario user) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Proyecto> c = db.getCollection("proyecto", Proyecto.class);
		Document filtro = new Document("user", user);
		FindIterable<Proyecto> result = c.find(filtro);
		MongoCursor<Proyecto> cursor = result.cursor();
		List<Proyecto> lista = new ArrayList<>();
		while(cursor.hasNext()) {
			lista.add(cursor.next());
		}
		
		return lista;
	}
	
	public String insertarProyecto(Proyecto proyecto) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Proyecto> c = db.getCollection("proyecto", Proyecto.class);
		InsertOneResult result = c.insertOne(proyecto);
		return result.getInsertedId().toString();
	}
}
