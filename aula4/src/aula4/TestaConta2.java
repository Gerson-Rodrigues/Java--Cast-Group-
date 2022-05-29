package aula4;

public class TestaConta2 {
	
	public static void main(String[] args) {
		
		Conta2 c2 = new Conta2();
		
		c2.numero = 002;
		c2.nome = "Rodrigues";
		c2.saldo = 500.00;
		c2.limite = 100;
		
		System.out.println("Nº Conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo Atual: "+c2.saldo);
		System.out.println("Limite: "+c2.limite);
		
		int saque = 590;
		boolean resultado = c2.saca(saque);
		if(resultado) {
			System.out.println("Você sacou R$"+saque+
					" e seu saldo atual é de R$"+(c2.saldo+c2.limite));
		}else {
			System.out.println("Saquer não efetuado.");
		}
	}
	
	
}
