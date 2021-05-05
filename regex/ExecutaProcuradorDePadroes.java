package br.com.estudos.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecutaProcuradorDePadroes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		while(true){
			System.out.println("Entre com o padrão a ser procurado: ");
			Pattern padrao = Pattern.compile(ler.nextLine());
			System.out.println("Entre com uma frase: ");
			Matcher combinar = padrao.matcher(ler.nextLine());
			
			boolean encontrar = false;
			while(combinar.find()){
				System.out.println("Padrão encontrado "+combinar.group()+ " inicialdo no indice "+
			combinar.start() + " e finalizando no indice " + combinar.end());
				encontrar = true;
			}
			if(!encontrar){
				System.out.println("Padrão não encontrado!");
			}
		}
	    
	}
}
