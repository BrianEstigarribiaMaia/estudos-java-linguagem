package exercicios.basico;

/*
 * Calcular numeros negativos de um vetor
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] vetor = {10, -5, 18, -3, -152};
		int contador = contarNegativos(vetor);
		
		System.out.println("A quantidade de elementos negativos é: "+contador);
	}

	private static int contarNegativos(int[] vetor) {
		int contador  = 0;
		
		for(int x: vetor){
			if(x < 0){
				contador++;
			}
		}
		
		return contador;
	}
}
