package br.com.estudos.triangulo;

/*
 * Triângulo isósceles Definição: Dois de seus lados têm a mesma medida
 */

public class Isoceles extends Triangulo {

	@Override
	public double getArea() {
		return calcularArea();
	}

	@Override
	double calcularArea() {
		double area = 0;

		if (getLadoA() == getLadoB()) {
			area = (getLadoC() * Math.sqrt((getLadoA() * getLadoB()) - ((getLadoC() * getLadoC()) / 4))) / 2;
		} else if (getLadoB() == getLadoC()) {
			area = (getLadoA() * Math.sqrt((getLadoB() * getLadoC()) - ((getLadoA() * getLadoA()) / 4))) / 2;
		} else if (getLadoC() == getLadoA()) {
			area = (getLadoB() * Math.sqrt((getLadoC() * getLadoA()) - ((getLadoB() * getLadoB()) / 4))) / 2;
		}

		return area;
	}
}
