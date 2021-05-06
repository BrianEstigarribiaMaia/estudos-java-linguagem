package br.com.estudos.java.array;

public class ExecutaExemplo {

	public static void main(String[] args) {
		int array[] = new int[7];
		
		for(int indice = 0; indice < 7; indice++){
			array[indice] = indice+1;
			System.out.println("Array ["+indice+"] ="+array[indice]);
			
		}
	}
}
