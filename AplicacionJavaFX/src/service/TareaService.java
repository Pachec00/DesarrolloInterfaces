package service;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;

import modelo.Tarea;
import modelo.Usuario;

public class TareaService {

	public String insertarTarea(Tarea tarea) {
		MongoDatabase db = MongoSession.getDatabase();
		MongoCollection<Tarea> c = db.getCollection("tarea", Tarea.class);
		InsertOneResult result = c.insertOne(tarea);
		return result.getInsertedId().toString();
	}
}
