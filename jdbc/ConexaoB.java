package br.com.estudos.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoB {
	private Connection conn = null;
	private Statement stm = null;
	private ResultSet rs = null;

	public Connection conectar() {
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

	public ResultSet executarConsulta(String consulta){
		conn = conectar();
		
		try {
			stm = conn.createStatement();
			rs = stm.executeQuery(consulta);
		} catch (SQLException e) {
			System.out.println("Não conseguiu executar a consulta. " +e);
		}finally {
			desconectar();
		}
		
		return rs;
	}
	
	public boolean executaDML(String dml){
		boolean ok = false;
		
		conn = conectar();
		
		try {
			stm = conn.createStatement();
			stm.execute(dml);
			ok = true;
		} catch (SQLException e) {
			System.out.println("Não conseguiu executar o DML. " +e);
		}finally {
			desconectar();
		}
		
		return ok;
	}
	
	public void fecharConnection(Connection conn){
		try {
			if(conn != null && !conn.isClosed()){
				conn.close();
				System.out.println("Desconectou do banco de dados");
			}
		} catch (SQLException e) {
			System.out.println("Não conseguiu desconectar do BD. "+e);
		}
	}
	
	public void fecharStatement(Statement stm){
		try {
			if(stm != null && !stm.isClosed()){
				stm.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro ao fechar o procedimento de consulta. "+e);
		}
	}
	
	public void fecharResultSet(ResultSet resultado){
		try {
			if(resultado != null && !resultado.isClosed()){
				resultado.close();
			}
		} catch (SQLException e) {
			System.out.println("Erro ao fechar resultado da consulta. "+e);
		}
	}
	
	public void desconectar() {
		fecharResultSet(this.rs);
		fecharStatement(this.stm);
		fecharConnection(this.conn);
	}

}
