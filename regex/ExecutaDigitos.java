package br.com.estudos.java.regex;

import java.util.regex.Pattern;

public class ExecutaDigitos {

	public static void main(String[] args) {
		
		System.out.println("Aceitar apenas digitos numericos de 0-9 iniciando com 7,8 ou 9");
		System.out.println("POR CLASSES E QUANTIFICADOREES");
		System.out.println("Entrada 9953038949 deve retornar TRUE");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
		System.out.println("Entrada 99530389490 deve retornar FALSE pois tem 11 caracterss");
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
		System.out.println("Entrada 6953038949 deve retornar FALSE pois inicia em 6");
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
		System.out.println("------------------------------------------------------------\n");
		System.out.println("POR METACARACTERES");
		System.out.println("Entrada 8853038949 deve retornar TRUE");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
	}
}
