package br.com.estudos.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Manipulacao {

	public static void main(String[] args) {
		Manipulacao manipulacao = new Manipulacao();
		manipulacao.inserir();
		manipulacao.atualizar();

	}

	public void inserir() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.conectar();

		try {
			String adicionar = "insert into pessoa (NOME, IDADE) values ('Brian', 25)";
			Statement stm = conn.createStatement();
			stm.execute(adicionar);
			System.out.println("Adicionou a pessoa no BD.");
		} catch (Exception e) {
			System.out.println("Não conseguiu Inseir uma pessoa no BD.");
		}finally {
			conexao.desconectar(conn);
		}
	}

	public void atualizar() {
		Conexao conexao = new Conexao();
		Connection conn = conexao.conectar();

		try {
			String atualizar = "update pessoa set nome = 'Juca' where nome = 'Brian'";
			Statement stm = conn.createStatement();
			stm.executeUpdate(atualizar);
			System.out.println("Atualizou o nome da pessoa no BD.");

		} catch (Exception e) {
			System.out.println("Não conseguiu atualizar uma pessoa no BD.");
		}finally {
			conexao.desconectar(conn);
		}
	}
}
