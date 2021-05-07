package br.com.estudos.java.strings;

public class ExecutaString {

	public static void main(String[] args) {
		char helloArray[] = {'H','E','L','L','O','.'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		System.out.println("Tamanho da String é "+helloString.length());
		System.out.println("Concatenando ... "+helloString+ " Word!");
		System.out.println("Caixa baixa "+helloString.toLowerCase());
	}

}
