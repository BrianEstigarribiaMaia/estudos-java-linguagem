package br.com.estudos.java.recursao;

public class Fatorial {

	public int calcularfatorial(int numero){
		if(numero == 1){
			return 1;
		}else{
			return (numero * calcularfatorial(numero - 1));
		}
	}
}
