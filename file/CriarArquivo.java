package br.com.estudos.java.file;

import java.io.File;
import java.io.IOException;

public class CriarArquivo {

	public static void main(String[] args) {
		try {
			File arquivo = new File("exemplo.txt");
			if(arquivo.createNewFile()){
				System.out.println("Arquivo criado: "+arquivo.getName());
			}else{
				System.out.println("Arquivo já existe.");
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}

	}

}
