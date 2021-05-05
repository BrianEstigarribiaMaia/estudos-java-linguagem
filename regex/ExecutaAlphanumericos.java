package br.com.estudos.java.regex;

import java.util.regex.Pattern;

public class ExecutaAlphanumericos {

	public static void main(String[] args) {
		
		System.out.println("Aceitar apenas alphanumericos de 6 caracteres");
		System.out.println("Entrada: Brian6");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Brian6"));
		System.out.println("Entrada: Brian66");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Brian66"));
		System.out.println("Entrada: $Brian");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "$Brian"));

	}
}
