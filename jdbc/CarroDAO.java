package br.com.estudos.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO {
	public void incluir(Carro carro){
		String incluir = "insert into carro values ('"+carro.getPlaca()+"', '"
				+carro.getModelo()+ "', " +carro.getPotencia()+ ")";
		
		ConexaoB conexao = new ConexaoB();
		conexao.executaDML(incluir);
	}
	
	public Carro consultarPorPlaca(String placa){
		ConexaoB conexao = new ConexaoB();
		Carro carro = null;
		
		try {
			String consulta = "select * from carro where placa = '" +placa+ "'";
			ResultSet rs = conexao.executarConsulta(consulta);
			
			if(rs.next()){
				carro = new Carro();
				carro.setModelo(rs.getString("MODELO"));
				carro.setPlaca(rs.getString("PLACA"));
				carro.setPotencia(rs.getDouble("POTENCIA"));
			}
		} catch (SQLException e) {
			System.out.println("Não conseguiu consultar os dados." +e);
		}finally {
			conexao.desconectar();
		}
		
		return carro;
	}
	
	public void alterarPorPlaca(Carro carro){
		String update = "update carro set modelo = '"+carro.getModelo() +
				"', potencia = " +carro.getPotencia()+ " where placa = '"+
				carro.getPlaca() + "'";
		
		ConexaoB conexao = new ConexaoB();
		conexao.executaDML(update);
	}
	
	public void excluir(Carro carro){
		String delete = "delete from carro where placa = '" +carro.getPlaca()+ "'";
		
		ConexaoB conexao = new ConexaoB();
		conexao.executaDML(delete);
	}
}
