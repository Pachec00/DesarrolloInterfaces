package service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import modelo.Proyecto;
import modelo.Tarea;
import modelo.Usuario;

public class ServiceTest {

	/**
	 * @param args
	 * @throws NoSuchAlgorithmException
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		Usuario user = new Usuario();
		user.setNombre("admin3");
		user.setEmail("admin3@admin.com");
		user.setPass("123");

		UsuarioService us = new UsuarioService();
		ProyectoService ps = new ProyectoService();
		Proyecto p = new Proyecto();
		Tarea t = new Tarea();
		Tarea t1 = new Tarea();
		Tarea t2 = new Tarea();
		List<Tarea> listaT = new ArrayList<>();
		t.setNombre("tareaP4");
		t1.setNombre("tareaP4.4");
		listaT.add(t);
		listaT.add(t1);
		
		p.setTitulo("proyecto4");
		p.setListaTareas(listaT);
		p.setUserEmail("admin3@admin.com");
		
		ps.insertarProyecto(p);
		
		
	}
}
