package exercicios.basico;

import java.util.Scanner;

/*
 * Inversão de Strings 
 */
public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");
		String entrada = ler.next();
		
		String saida = "";
		
		for(int i = entrada.length() - 1; i >= 0; i--){
			saida += entrada.charAt(i);
		}
		
		System.out.println(saida);
		ler.close();
	}
}
