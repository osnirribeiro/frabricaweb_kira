package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entidate.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDao;

public class TesteUsuarioDao {

	public static void main(String[] args) {

		delete();
		
	}
	
	public static void cadastrar(){
		Usuario usuarios = new Usuario();
		usuarios.setLogin("kira");
		usuarios.setNome("osnir");
		usuarios.setSenha("123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.cadastrar(usuarios);
		System.out.println("inserted with sucefull");
	}
	
	
	public static void alterar(){
		Usuario usuarios = new Usuario();
		usuarios.setLogin("ola");
		usuarios.setNome("FUI");
		usuarios.setSenha("895");
		usuarios.setId(3);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.alterar(usuarios);
		System.out.println("alter with sucefull");
	}
	
	public static void delete(){
		Usuario usuarios = new Usuario();
		usuarios.setId(1);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.delete(usuarios);
		System.out.println("user deleted with sucefull");
	}
}
