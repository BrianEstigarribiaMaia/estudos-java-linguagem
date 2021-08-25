package br.com.estudos.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta {

	public static void main(String[] args) {
		Consulta consultaBD = new Consulta();
		consultaBD.consulta();
	}

	private void consulta() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.conectar();
		
		try {
			String consulta = "select * from pessoa where nome like 'A%'";
			
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(consulta);
			
			while(rs.next()){
				System.out.println(rs.getLong("ID"));
				System.out.println(" - " + rs.getByte("NOME"));
				System.out.println(" - " + rs.getInt("IDADE") + "\n");
			}
		} catch (Exception e) {
			System.out.println("Não conseguiu consultar os dados.");
		}finally {
			conexao.desconectar(conn);
		}
	}
	
}
