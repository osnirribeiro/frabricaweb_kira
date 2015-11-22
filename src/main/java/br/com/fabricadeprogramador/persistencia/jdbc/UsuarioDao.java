package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entidate.Usuario;

public class UsuarioDao {

	private Connection con = ConnectionFactory.getConnection();
	
	public void cadastrar( Usuario usuarios){
		
		String sql =  "insert into usuario (nome ,login,senha) values (?,?,?)";
		try (PreparedStatement preparador =  con.prepareCall(sql)){
				preparador.setString(1, usuarios.getNome());
				preparador.setString(2, usuarios.getLogin());
				preparador.setString(3, usuarios.getSenha());
				
				preparador.execute();
				//preparador.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterar( Usuario usuarios){
		
		String sql =  "update usuario set nome = ?, login= ? , senha = ? where id = ?";
		try (PreparedStatement preparador =  con.prepareCall(sql)){
				preparador.setString(1, usuarios.getNome());
				preparador.setString(2, usuarios.getLogin());
				preparador.setString(3, usuarios.getSenha());
				preparador.setInt(4, usuarios.getId());
				
				preparador.execute();
				//preparador.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete( Usuario usuarios){
		
		String sql =  "delete from usuario where id = ?";
		try (PreparedStatement preparador =  con.prepareCall(sql)){
				preparador.setInt(1, usuarios.getId());
				
				preparador.execute();
				//preparador.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
