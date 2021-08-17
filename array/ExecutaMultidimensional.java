package br.com.estudos.java.array;

public class ExecutaMultidimensional {

	public static void main(String[] args) {
		int doisD [] [] ={{1}, {2}, {3}, {5}};
		
		for (int linha = 0; linha < doisD.length; linha++){
			for(int coluna = 0; coluna < doisD[linha].length; coluna++){
				System.out.println("Array ["+linha+"] ["+coluna+"] = "+doisD[linha][coluna]);
			}
		}
		
	}
}
