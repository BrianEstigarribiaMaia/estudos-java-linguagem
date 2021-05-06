package br.com.estudos.java.array;

public class ExecutaReferencia {

	public static void passarPorReferencia(String fruta[]){
		fruta[0] = "Mudou";
	}
	
	public static void main(String[] args) {
		String frutaArray[] = {"Maçã", "Laranja"};
		System.out.println("Antes da Função: "+frutaArray[0]);
		
		passarPorReferencia(frutaArray);
		System.out.println("Depos da função: "+frutaArray[0]);
		
	}

}
