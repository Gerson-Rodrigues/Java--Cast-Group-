package aula4;

public class TestaConta1 {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.numero = 001;
		c1.nome = "Gerson";
		c1.saldo = 100.00;
		c1.limite = 10;
		
		c2.numero = 002;
		c2.nome = "Rodrigues";
		c2.saldo = 5000.00;
		c2.limite = 1000;
		
		System.out.println("Nº Conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo Atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		c1.sacar(10);
		System.out.println("Saldo Atual: "+c1.saldo);		
		c1.depositar(500);
		System.out.println("Saldo Atual: "+c1.saldo);
		
		
	}
	
	
}
