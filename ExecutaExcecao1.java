package br.com.estudos.java;

public class ExecutaExcecao1 {

	public static void main(String[] args) {
		
		try {
			int [] meusNumeros ={1,2,3};
			System.out.println(meusNumeros[10]);
		} catch (Exception e) {
			System.out.println("Algo deu errado.");
		}finally {
			System.out.println("O bloco try catch foi finalizado.");
		}

	}

}
