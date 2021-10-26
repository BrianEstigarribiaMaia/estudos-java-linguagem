package exercicios.basico;

import java.util.Scanner;

/*
 * metro para quilômetro e milímetro em Java
 */

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metro, quilometro, milimetro;
		
		System.out.println("Digite quantos metros deseja converter: ");
		metro = ler.nextDouble();
		
		quilometro = metro / 1000;
		milimetro  = metro * 1000;
		
		System.out.println("Metro : "+metro);
		System.out.println("Quilometro: "+quilometro);
		System.out.println("Milimetro: "+milimetro);
	}
	
}
