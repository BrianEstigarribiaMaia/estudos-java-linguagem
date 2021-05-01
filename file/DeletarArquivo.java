package br.com.estudos.java.file;

import java.io.File;

public class DeletarArquivo {

	public static void main(String[] args) {
		File arquivo = new File("exemplo.txt");
		if(arquivo.delete()){
			System.out.println("Arquivo deletado "+ arquivo.getName());
		}else{
			System.out.println("Falha ao deletar o arquivo.");
		}

	}
}
