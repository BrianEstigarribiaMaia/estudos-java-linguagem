package exercicios.basico;

import java.util.Arrays;

/*
 * Deslocar elementos de um vetor a direita
 */

public class Ex16 {

	public static void main(String[] args) {
		int [] vetor = {1,2,3,4,5,6,7};
		
		deslocar(vetor, 3);
		
		System.out.println(Arrays.toString(vetor));

	}

	private static void deslocar(int[] vetor, int posicoes) {
		int n = vetor.length;
		
		inverter(vetor, 0, n-1-posicoes);
		inverter(vetor, n-posicoes, n-1);
		inverter(vetor, 0, n-1);
	}

	private static void inverter(int[] vetor, int i, int j) {
		while (i < j) {
			trocar(vetor, i, j);
			i++;
			j--;
		}
		
	}

	private static void trocar(int[] vetor, int i, int j) {
		int aux  = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
		
	}

}
