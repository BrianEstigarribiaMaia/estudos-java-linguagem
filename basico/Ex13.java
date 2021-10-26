package exercicios.basico;

import java.util.Scanner;

/*
 * Converter Número Binário para Decimal
 */

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o binario: ");
		String binario = ler.next();
		int potencia = 0;
		int soma = 0;
		
		for (int i = binario.length() - 1; i >= 0 ; i--) {
			soma += Math.pow(2, potencia) * Character.getNumericValue(binario.charAt(i));
			potencia++;
		}
		
		System.out.println(soma);
		ler.close();
	}

}
