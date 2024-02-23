package service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertOneResult;

import modelo.Proyecto;
import modelo.Tarea;

public class ProyectoService {

	
	public List<Proyecto> consultarProyecto(String email) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Proyecto> c = db.getCollection("proyecto", Proyecto.class);
		Document filtro = new Document("userEmail", email);
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
	
	public List<Tarea> consultarTarea(String id){
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Tarea> c = db.getCollection("proyecto", Tarea.class);
		Bson filter = Filters.eq("_id", new ObjectId(id));
		FindIterable<Tarea> result = c.find(filter);
		MongoCursor<Tarea> cursor = result.cursor();
		List<Tarea> lista = new ArrayList<>();
		while(cursor.hasNext()) {
			lista.add(cursor.next());
		}
		
		return lista;
	}
	
	public List<Proyecto> consultarProyectoNombre(String email, String titulo) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Proyecto> c = db.getCollection("proyecto", Proyecto.class);
		Document filtro = new Document("userEmail", email);
		FindIterable<Proyecto> result = c.find(filtro);
		MongoCursor<Proyecto> cursor = result.cursor();
		List<Proyecto> lista = new ArrayList<>();
		while(cursor.hasNext()) {
			Proyecto proyecto = cursor.next();
			if(proyecto.getTitulo().equals(titulo)) {
				lista.add(cursor.next());
			}
		}
		
		return lista;
	}
}
