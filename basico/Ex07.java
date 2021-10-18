package exercicios.basico;

/*
 * Imprimir a sequencia de Fibonacci
 */
public class Ex07 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.println(a);
	
			int aux = a;
			a += b;
			b = aux;
		}

	}

}
