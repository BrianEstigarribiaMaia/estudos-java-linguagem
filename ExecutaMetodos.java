package br.com.estudos.java.math;

public class ExecutaMetodos {

	public static void main(String[] args) {
		double numero1 = 27;
		double numero2 = 5;
		double numero3 = 129.8;
		
		System.out.println("Maior valor entre 27 e 5 é : "+Math.max(numero1, numero2));
		System.out.println("A raiz quadrada de 27 é : "+Math.sqrt(numero1));
		System.out.println("A potencia de 5 elevado a 27 é : "+Math.pow(numero2, numero1));
		System.out.println("Arredondar o numero 129.8 = "+Math.round(numero3));
		System.out.println("Arredondar para baixo:  "+Math.floor(numero3));
	}
}
