package exercicios.basico;

import java.util.Scanner;

/*
 * Calculo de IMC
 */
public class Ex04 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = ler.nextDouble();
		
		System.out.println("Digite o altura: ");
		double altura = ler.nextDouble();
		
		ler.close();
		double calculoImc = peso / (altura * altura);
		
		System.out.println("Seu IMC é " + calculoImc);
	}
}
