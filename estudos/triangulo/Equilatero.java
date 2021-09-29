package br.com.estudos.triangulo;
/*
 * Triangulo equilatero : todos os lados possuem a mesma medida
 */
public class Equilatero extends Triangulo{

	public double getArea() {
		return calcularArea();
	}
	
	@Override
	double calcularArea() {
		double area = (((getLadoA() * getLadoA()) * Math.sqrt(3))) / 4;
		return area;
	}
	
}
