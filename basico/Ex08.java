package exercicios.basico;

import java.util.Scanner;

/*
 * Triangulos 
 */

public class Ex08 {

	public static void main(String[] args) {
		
		double a, b, c, aux, a2, bc;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		
		ler.close();
		if(b > a){
			aux = a;
			a = b;
			b = aux;
		}
		
		if(c > a){
			aux = a;
			a = c;
			c = aux;
		}
		
		a2 = Math.pow(a, 2);
		bc = Math.pow(b, 2) + Math.pow(c, 2);
		
		if(a >= b + c){
			System.out.println("Não forma Triangulo");
		}else{
			// pode formar algum triangulo
			if(a2 > bc){
				System.out.println("Triangulo obtusangulo");
			}else if(a2 < bc){
				System.out.println("Triangulo acutangulo");
			}
			
			else{
				System.out.println("Triangulo Retangulo");
			}
			
			//verificar arestas
			if(a == b && b == c){
				System.out.println("Triangulo equilatero");
			}else if(a == b || a == c || b == c){
				System.out.println("Triangulo isoceles");
			}
		}
	}

}
