package exercicios.basico;

import java.util.Scanner;

/*
 * idade de uma pessoa em dias
 */

public class Ex15 {

	public static void main(String[] args) {
		int anos, meses, dias, idadeEmDias;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os anos");
		anos = ler.nextInt();
		
		System.out.println("Digite os meses");
		meses = ler.nextInt();
		
		System.out.println("Digite os dias ");
		dias = ler.nextInt();
		
		idadeEmDias = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias é: "+idadeEmDias);
		
		ler.close();
	}

}
