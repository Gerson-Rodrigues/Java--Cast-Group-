package execucao;

import associacao.Condutor;
import associacao.Veiculo;
public class ExecucaoAssociacao {

	public static void main(String[] args) {
		Condutor c1 = new Condutor("Gerson","123.123.12-8");
		Veiculo v1 = new Veiculo("Carro", "Corsa Spirit","GER 1987");
		Condutor c2 = new Condutor("Rodrigues", "8745.658.12-78");
		Veiculo v2 = new Veiculo("Pickup", "Strada", "ROD 2205");
		//System.out.println("Nome: "+ c1.getNome());
		
		//Aplicar a relação de Associação 
		c1.setVeiculo(v1);
		
		c2.setVeiculo(v2);
		
		/*
		System.out.println("Condutor: "+c1.getNome());
		System.out.println("Tipo Veículo: "+c1.getVeiculo().getTipo());
		System.out.println("Modelo: "+c1.getVeiculo().getModelo());
		System.out.println("Placa: "+c1.getVeiculo().getPlaca());
		*/
		
		System.out.println(c1);
		System.out.println(c2);
		/*Associação Unidirecional onde objeto de condutor
		 * tem possibilidade de vínvulo com veículo
		 * 
		 * A --> B
		 * 
		 * A <--> B
		 * 
		 * A <-- B
		 * */
		/*
		Condutor c2 = new Condutor();
		c2.setCnh("123.435.34-4");
		c2.setNome("Rodrigues");
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		
		
	}//fecha o main
}//fecha a classe 
