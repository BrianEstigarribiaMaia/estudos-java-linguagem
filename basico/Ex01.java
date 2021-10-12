package exercicios.basico;

import java.util.Random;

/*
 * Matriz transposta : receber uma matriz e devolver 
 * a matriz transposta
 */
public class Ex01 {

	static int [][] criarMatriz(int N, int M){
		int [][] matriz = new int [N][M];
		
		Random gerador = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(100);
			}
		}
		return matriz;
	}
	
	static int [][] transposta(int [][] matriz){
		int [][] matrizTransposta = new int [matriz[0].length][matriz.length];
		
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[0].length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
			}
		}
		
		return matrizTransposta;
	}
	
	static void imprimirMatriz(int [][]matriz){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] +"\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int [][] matriz = criarMatriz(3, 4);
		System.out.println("Matriz Original");
		imprimirMatriz(matriz);
		System.out.println("\n Matriz Transposta");
		int [][] transposta = transposta(matriz);
		imprimirMatriz(transposta);
	}
}
