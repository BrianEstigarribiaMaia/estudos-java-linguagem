package br.com.estudos.java.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {
		try {
			File arquivo = new File("exemplo.txt");
			Scanner ler = new Scanner(arquivo);
			while(ler.hasNextLine()){
				String conteudo = ler.nextLine();
				System.out.println(conteudo);
			}
			ler.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
