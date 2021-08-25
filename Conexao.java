package br.com.estudos.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.conectar();
		conexao.desconectar(conn);

	}

	private Connection conectar() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC", "root", "");
			System.out.println("Conectou ao banco de dados.");
		} catch (SQLException e) {
			System.out.println("Erro: "+e);
		}catch (ClassNotFoundException e) {
			System.out.println("Erro: "+e);
		}
		return conn;
	}

	private void desconectar(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()){
				conn.close();
				System.out.println("Desconectou do banco de dados.");
			}
		} catch (SQLException e) {
			System.out.println("Não conseguiu desconectar do banco de dados " +e);
		}
		
	}

}
