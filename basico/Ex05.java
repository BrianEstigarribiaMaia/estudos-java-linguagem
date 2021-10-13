package exercicios.basico;

import java.util.Scanner;

/*
 * Media ponderada
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double notaA = ler.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double notaB = ler.nextDouble();

		System.out.println("Digite a terceira nota: ");
		double notaC = ler.nextDouble();

		ler.close();

		double media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;
		System.out.println("A média final é "+media);
	}

}
