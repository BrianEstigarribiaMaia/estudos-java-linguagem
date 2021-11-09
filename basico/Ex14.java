package exercicios.basico;

import java.util.Arrays;

/*
 *  interseção de arrays / vetores
 */

public class Ex14 {

	public static void main(String[] args) {
		int [] vetorA = {7,2,5,8,4};
		int [] vetorB = {4,2,9,5};
		int [] vetorC = intersecao(vetorA, vetorB);
		
		System.out.println(Arrays.toString(vetorC));
	}

	private static int[] intersecao(int[] vetorA, int[] vetorB) {
		int [] aux = new int [vetorA.length + vetorB.length];
		int k = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					aux[k++] = vetorA[i];
				}
			}
		}
		
		int [] c = new int [k];
		
		for (int i = 0; i < k; i++) {
			c[i] = aux[i];
		}
		
		return c;
	}

}
