package br.com.estudos.triangulo.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.estudos.triangulo.Equilatero;
import br.com.estudos.triangulo.Escaleno;
import br.com.estudos.triangulo.Isoceles;
import br.com.estudos.triangulo.Triangulo;

public class TesteTriangulo {
	private static Scanner teclado;
	static int totalDeTriangulos = 0;

	public static void main(String[] args) {

		List<Equilatero> listEquilatero = new ArrayList<>();
		List<Isoceles> listIsosceles = new ArrayList<>();
		List<Escaleno> listEscalenos = new ArrayList<>();

		int ladoA = 0;
		int ladoB = 0;
		int ladoC = 0;

		boolean valida = true;

		while (valida) {
			System.out.println("--------------------------------");
			System.out.println("Adicionar os lados do triangulo");
			System.out.println("--------------------------------");

			teclado = new Scanner(System.in);
			boolean v = true;

			while (v) {

				System.out.println("Digite o primeiro lado:");
				ladoA = teclado.nextInt();

				if (ladoA == 0) {
					v = false;
					valida = false;
					break;
				}

				System.out.println("Digite o segundo lado:");
				ladoB = teclado.nextInt();
				System.out.println("Digite o treceiro lado:");
				ladoC = teclado.nextInt();

				v = !verificarExistenciaDeTriangulo(ladoA, ladoB, ladoC);
				if (v == true) {
					System.out
							.println("Nao existe triangulo com esse valores, tente novamente");
				}
			}

			if (ladoA != 0) {
				Triangulo triangulo = criarTriangulo(ladoA, ladoB, ladoC);
				triangulo.setLadoA(ladoA);
				triangulo.setLadoB(ladoB);
				triangulo.setLadoC(ladoC);

				// adicionar a uma lista especifica
				if (triangulo instanceof Equilatero) {
					listEquilatero.add((Equilatero) triangulo);
					totalDeTriangulos++;
				} else if (triangulo instanceof Escaleno) {
					listEscalenos.add((Escaleno) triangulo);
					totalDeTriangulos++;
				} else {
					listIsosceles.add((Isoceles) triangulo);
					totalDeTriangulos++;
				}
			}

		}

		System.out.println("Total de triangulos: " + totalDeTriangulos);
		System.out.println("Total de triangulos equilateros: "
				+ listEquilatero.size());
		System.out.println("Total de triangulos escaleno: "
				+ listEscalenos.size());
		System.out.println("Total de triangulos isosceles: "
				+ listIsosceles.size());
		

		if (listEquilatero.size() > 0) {
			// Percorre a lista e imprimir a area de cada triangulo equilatero
			for (Equilatero equilatero : listEquilatero) {

				System.out
						.printf("Área do Triangulo Equilatero na posição da lista %d : %.2fm²\n",
								listEquilatero.indexOf(equilatero),
								equilatero.getArea());
			}
		} else {
			System.out
					.println("Não existe triangulos equilateros para exibir a área.");
		}

	}

	private static boolean verificarExistenciaDeTriangulo(int ladoA, int ladoB,
			int ladoC) {

		if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC)
				&& ladoC < (ladoA + ladoB)) {
			// Tem a garantia que os valores formam um triângulo
			return true;
		}
		return false;
	}

	private static Triangulo criarTriangulo(int ladoA, int ladoB, int ladoC) {

		String opcao = verificarTipoTriangulo(ladoA, ladoB, ladoC);

		switch (opcao) {
		case "equilatero":
			return new Equilatero();
		case "isosceles":
			return new Isoceles();
		case "escaleno":
			return new Escaleno();
		default:
			break;
		}

		return null;

	}

	private static String verificarTipoTriangulo(int ladoA, int ladoB, int ladoC) {

		if (ladoA == ladoB && ladoB == ladoC) {
			return "equilatero";
		} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			return "isosceles";
		} else {
			return "escaleno";
		}
	}
}
