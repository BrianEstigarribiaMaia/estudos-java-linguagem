package br.com.estudos.java.jdbc;

import java.util.Scanner;

public class TesteCarro {
	public static void main(String[] args) {
		CarroDAO carroDAO = new CarroDAO();
		char opcao;

		do {
			Carro carro = null;
			opcao = menu();

			switch (opcao) {
			case 'I':
				carro = coletarDados();
				carroDAO.incluir(carro);
				break;
			case 'E':
				String placaExcluir = consultarPlaca();
				carro = carroDAO.consultarPorPlaca(placaExcluir);
				carroDAO.excluir(carro);
				break;
			case 'A':
				carro = coletarDados();
				carroDAO.alterarPorPlaca(carro);
				break;
			case 'C':
				String placaConsultar = consultarPlaca();
				carro = carroDAO.consultarPorPlaca(placaConsultar);
				break;
			}
			mostrarDadosCarro(carro);
		} while (opcao != 'S');
	}

	public static void mostrarDadosCarro(Carro carro) {
		if(carro != null){
			System.out.println("\n############### DADOS DO CARRO #################");
			System.out.println("PLACA: " + carro.getPlaca());
			System.out.println("MODELO: " + carro.getModelo());
			System.out.println("POTENCIA DO MOTOR: " + carro.getPotencia());
			System.out.println("############### DADOS DO CARRO #################\n");
		}
	}

	public static String consultarPlaca() {
		Scanner ler = new Scanner(System.in);
		String placaDoCarro;
		
		System.out.println("Digite a placa do carro: ");
		placaDoCarro = ler.next();
		
		return placaDoCarro;
	}

	public static Carro coletarDados() {
		Scanner ler = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.print("Digite a placa do carro: ");
	    carro.setPlaca(ler.nextLine());
	    System.out.print("Digite o modelo do carro: ");
	    carro.setModelo(ler.nextLine());
	    System.out.print("Digite a potencia do carro: ");
	    carro.setPotencia(ler.nextDouble());
	    
		return carro;
	}

	public static char menu() {
		Scanner ler = new Scanner(System.in);
		char opcao;

		System.out.println("Escolha a sua opcao: ");
		System.out.println("\t(I)ncluir");
		System.out.println("\t(E)xcluir");
		System.out.println("\t(A)lterar");
		System.out.println("\t(C)onsultar");
		System.out.println("\t(S)air");
		System.out.print("\nOpcao: ");

		opcao = ler.nextLine().toUpperCase().charAt(0);
		
		return opcao;
	}
}
