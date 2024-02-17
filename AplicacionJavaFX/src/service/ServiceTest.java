package service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import modelo.Usuario;

public class ServiceTest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		Usuario user = new Usuario();
		user.setNombre("admin3");
		user.setEmail("admin3@admin.com");
		user.setPass("123");
		
		UsuarioService us = new UsuarioService();
		
		
		us.consultarTest("admin@admin.com");
		
	}
}
