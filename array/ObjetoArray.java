package br.com.estudos.java.array;

public class ObjetoArray {

	public static void main(String[] args) {
		DadosArray dados[] = new DadosArray[2]; 
		
		dados[0] = new DadosArray();
		dados[1] = new DadosArray();
		dados[0].setarDados(1, 2);
		dados[1].setarDados(3, 4);
		
		System.out.println("Elemento 0 do array");
		dados[0].mostrarDados();
		System.out.println("Elemento 1 do array");
		dados[1].mostrarDados();
		
	}
}
