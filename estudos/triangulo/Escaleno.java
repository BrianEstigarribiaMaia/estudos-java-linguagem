package br.com.estudos.triangulo;

/*
 * Triângulo escaleno Definição: Os três lados possuem medidas diferentes
 */

public class Escaleno extends Triangulo {

	@Override
	public double getArea() {
		return calcularArea();
	}

	@Override
	double calcularArea() {
		double area = 0;
		double semiperimetro = (getLadoA() + getLadoB() + getLadoC()) / 2;

		area = Math.sqrt(semiperimetro * (semiperimetro - getLadoA()) * (semiperimetro - getLadoB())
				* (semiperimetro - getLadoC()));

		return area;
	}
}
