package br.com.estudos.java.file;

import java.io.File;

public class InfoArquivo {

	public static void main(String[] args) {
		File arquivo = new File("exemplo.txt");
		if(arquivo.exists()){
			System.out.println("Nome do arquivo    : " +arquivo.getName());
			System.out.println("Caminho absoluto   : " +arquivo.getAbsolutePath());
			System.out.println("Tamanho do arquivo : " +arquivo.length());
		}

	}

}
