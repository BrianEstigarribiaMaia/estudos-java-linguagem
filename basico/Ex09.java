package exercicios.basico;

import java.util.Arrays;
import java.util.Random;

/*
 * Selection sort
 */

public class Ex09 {
	
	public static void main(String[] args) {
		
		int [] vetor = gerarVetor(10);
		
		selectionSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}

	private static void selectionSort(int[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
			int menor = i;
			
			for (int j = i + 1; j < vetor.length; j++) {
				if(vetor[j] < vetor[menor]){
					menor = j;
				}
			}
			trocar(vetor, i, menor);
		}
		
	}

	private static void trocar(int[] vetor, int i, int menor) {
		int aux = vetor[i];
		vetor[i] = vetor[menor];
		vetor[menor] = aux;
		
	}

	public static int[] gerarVetor(int num) {
		int [] v = new int[num];
		
		Random gerador = new Random();
		
		for (int i = 0; i < num; i++) {
			v[i] = gerador.nextInt(100);
		}
		
		return v;
	}
	
}
