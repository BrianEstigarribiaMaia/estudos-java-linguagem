package exercicios.basico;

/*
 * encontrar e devolver a primeira ocorrencia do maior valor de um vetor
 */
public class Ex03 {

	public static void main(String[] args) {
		int [] vetor = {5, 10, 8, 3, 155, 23, 72};
		
		int maiorElemento = buscarMaiorElemento(vetor);

		System.out.println("A posição do maior elemento é : "+maiorElemento);
	}

	private static int buscarMaiorElemento(int[] vetor) {
		int maior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] > vetor[maior]){
				maior = i;
			}
		}
		
		return maior;
	}

}
