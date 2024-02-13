package service;

import java.util.ArrayList;
import java.util.List;

import modelo.Persona;

public class PersonasService {

	public List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 40; i++) {

			Persona p = new Persona();
			p.setNombre("María de las Nieves");
			p.setDni("3242432X");
			p.setEdad(23);
			personas.add(p);
		}
		return personas;
	}
}
