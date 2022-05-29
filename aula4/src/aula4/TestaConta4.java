package aula4;

public class TestaConta4 {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.nome = "Rodrigues";
		
		Conta c2 = new Conta();
		c2.nome = "Gerson";
		
		if (c1 == c2) {
			System.out.println("As contas são iguais");
		}else {
			System.out.println("As contas são diferentes");
		}
		System.out.println("Limite de c1 "+c1.nome);
		System.out.println("Limite de c2 "+c2.nome);
		
	}
	
	
}
