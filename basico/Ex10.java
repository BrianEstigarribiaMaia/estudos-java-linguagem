package exercicios.basico;

import java.util.Scanner;

/*
 * Comprimento e area do circulo
 */

public class Ex10 {

	public static void main(String[] args) {

		double comprimento, raio, area;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		raio = ler.nextDouble();
		
		ler.close();
		
		comprimento = 2 * Math.PI * raio;
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O comprimento do circulo é: "+comprimento);
		System.out.println("A area do circulo é: "+area);
		
	}

}
