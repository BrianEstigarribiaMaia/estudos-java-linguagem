package br.com.estudos.java.regex;

import java.util.regex.Pattern;

public class ExecutaPadroes {

	public static void main(String[] args) {
		
		System.out.println("Procurar char S na segunda posição da string AS");
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println("Procurar char S na segunda posição da string MK");
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println("Procurar char S na segunda posição da string AMS");
		System.out.println(Pattern.matches(".s", "ams"));
		System.out.println("Procurar char S na terceira posição da string MAS");
		System.out.println(Pattern.matches("..s", "mas"));
		System.out.println("--------------------------------------------------\n");
		System.out.println("Procurar A,M OU N na string ABC");
		System.out.println(Pattern.matches("[amn]", "abc"));
		System.out.println("Procurar A,M OU N na string AMMA");
		System.out.println(Pattern.matches("[amn]", "amma"));
		System.out.println("Procurar A,M OU N na string A");
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println("Procurar M na string M");
		System.out.println(Pattern.matches("[m]", "m"));
		System.out.println("--------------------------------------------------\n");
		System.out.println("Procurar C,D OU M ocorre uma ou nenhuma vez na string DEF");
		System.out.println(Pattern.matches("[cdm]?", "def"));
		System.out.println("Procurar C,D OU M ocorre uma ou mais vezes na string CDM");
		System.out.println(Pattern.matches("[cdm]+", "cdm"));
		System.out.println("Procurar C,D OU M ocorre zero ou muitas vezes na string AAA");
		System.out.println(Pattern.matches("[cdm]*", "aaa"));
	}

}
