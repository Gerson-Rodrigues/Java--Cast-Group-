package execucao;

import entity.Carro;

public class ExecucaoCarro {
	// main control + control = barra de espa�o
	public static void main(String[] args) {
		// inst�ncia  o objeto
		// classe variavvel = new Classe
		
		Carro c1 = new Carro();
		
		// atribuir valor ao objeto 
		c1.setModelo("Ford Mustang");
		c1.setAno(2022);
		c1.setCor("Amarelo");
		c1.setPreco(700000);
		
		// Obter os valores do Objeto
		System.out.println("Modelo: "+c1.getModelo());
		System.out.println("Ano: "+c1.getAno());
		System.out.println("Cor: "+c1.getCor());
		System.out.println("Pre�o: "+c1.getPreco());
		
	}
}
