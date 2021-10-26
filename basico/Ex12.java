package exercicios.basico;

import java.util.Arrays;

/*
 * concatenar dois arrays 
 */

public class Ex12 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = {4,5};
		int c[] = concatenar(a,b);
					
		System.out.println(Arrays.toString(c));
	}

	private static int[] concatenar(int[] a, int[] b) {
		int c[] = new int [a.length + b.length];
		
		int  k = 0;
		
		for (int i = 0; i < a.length; i++) {
			c[k++] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[k++] = b[i];
		}
		
		return c;
	}

}
