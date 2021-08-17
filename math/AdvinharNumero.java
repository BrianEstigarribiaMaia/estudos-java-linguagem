package br.com.estudos.java.jogo;

import java.util.Scanner;

public class AdvinharNumero {

	public static void main(String[] args) {
		int tentativa = 0;
		int numeroDigitadoPeloJogador = 0;
		int numeroCorreto = (int)(Math.random() * 99 + 1);
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("-----JOGO DA ADVINHAÇÃO-----");
		System.out.println("Voce tem 5 chances de acertar o numero correto. Boa Sorte!");

		do {
			System.out.println("Digite um numero entre 1 e 100:");
			numeroDigitadoPeloJogador = ler.nextInt();
			
			if (numeroDigitadoPeloJogador == numeroCorreto) {
				System.out.println("Parabéns voce acertou o número!");
				break;
			} else if(numeroDigitadoPeloJogador < numeroCorreto){
				System.out.println("O numero digitado é menor que o correto");
			} else if (numeroDigitadoPeloJogador > numeroCorreto) {
				System.out.println("O numero digitado é maior que o correto");
			}
			
			tentativa++;
			
			if (tentativa == 5) {
				System.out.println("Voce excedeu as 5 tentativas!");
				break;
			}
			
		} while (numeroDigitadoPeloJogador != numeroCorreto);
		ler.close();
	}
}
