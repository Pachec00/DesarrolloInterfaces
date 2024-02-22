package service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import modelo.Proyecto;
import modelo.Tarea;
import modelo.Usuario;

public class ServiceTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Usuario user = new Usuario();
		user.setNombre("admin3");
		user.setEmail("admin3@admin.com");
		user.setPass("123");
		
		UsuarioService us = new UsuarioService();
		ProyectoService ps = new ProyectoService();
		TareaService ts = new TareaService();
		
		Proyecto p = new Proyecto();
		Tarea t = new Tarea();
		Proyecto p2 = new Proyecto();
		Tarea t2 = new Tarea();
		List<Proyecto> lista = new ArrayList<>();
		
		p.setTitulo("proyecto1");
		p.setUser(user);
		
		t.setNombre("tarea1");
		t.setProyecto(p);
		
		
		p2.setTitulo("proyecto2");
		p2.setUser(user);
		
		t2.setNombre("tarea2");
		t2.setProyecto(p2);
		
		//ps.insertarProyecto(p2);
		
		
		
		
		lista = ps.consultarProyecto(user);
		
		for(Proyecto t1 : lista) {
			System.out.println(t1.getTitulo());
		}
		
		
	}
}
