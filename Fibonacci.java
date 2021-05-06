package br.com.estudos.java.recursao;

public class Fibonacci {

	private int numeroUm = 0, numeroDois = 1,numeroTres = 0;

	public void mostrarFibonacci(int contador){
		if(contador > 0){
			numeroTres = numeroUm + numeroDois;
			numeroUm = numeroDois;
			numeroDois = numeroTres;
			
			System.out.println(" "+numeroTres);
			mostrarFibonacci(contador -1);
		}
	}
	
	public int getNumeroUm() {
		return numeroUm;
	}

	public void setNumeroUm(int numeroUm) {
		this.numeroUm = numeroUm;
	}

	public int getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroDois(int numeroDois) {
		this.numeroDois = numeroDois;
	}

	public int getNumeroTres() {
		return numeroTres;
	}

	public void setNumeroTres(int numeroTres) {
		this.numeroTres = numeroTres;
	}
}
