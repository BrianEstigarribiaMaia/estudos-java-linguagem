package br.com.estudos.java.file;

import java.io.File;

public class DeletarPasta {

	public static void main(String[] args) {
		File pasta = new File("C:\\Users\\Hiro_Kitsune\\Downloads\\deletar");
		if(pasta.delete()){
			System.out.println("Pasta deletada " +pasta.getName());
		}else{
			System.out.println("Falha ao deletar a pasta.");
		}
	}
}
