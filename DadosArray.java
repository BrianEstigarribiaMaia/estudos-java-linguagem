package br.com.estudos.java.array;

public class DadosArray {

	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void setarDados(int c, int d){
		a = c;
		b = d;
	}
	
	public void mostrarDados(){
		System.out.println("Valor de A = "+a);
		System.out.println("Valor de B = "+b);
	}
}
