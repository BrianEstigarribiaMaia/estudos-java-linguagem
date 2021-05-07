package br.com.estudos.java.math;

import java.text.NumberFormat;

public class ExecutaFormatarNumeros {

	public static void main(String[] args) {
		System.out.println(NumberFormat.getCurrencyInstance().format(123654987.99));

		double numeros[] = {600.54, 8622.66, 1084.895};
		NumberFormat formatar = NumberFormat.getCurrencyInstance();

		for (int indice = 0; indice < numeros.length; indice++) {
			if(indice != 0)
				System.out.print(", ");
			System.out.print(formatar.format(numeros[indice]));
		}
		System.out.println();

	}

}


