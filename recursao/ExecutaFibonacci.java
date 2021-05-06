package br.com.estudos.java.recursao;

public class ExecutaFibonacci {

	public static void main(String[] args) {
		int contador = 15;
		Fibonacci fb = new Fibonacci();
		System.out.println(fb.getNumeroUm()+ " "+fb.getNumeroDois());
		fb.mostrarFibonacci(contador - 2);
	}
}
