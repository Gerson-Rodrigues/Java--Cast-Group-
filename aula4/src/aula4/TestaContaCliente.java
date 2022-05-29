package aula4;

public class TestaContaCliente {

	public static void main(String[] args) {
		ContaTransf2 c1 = new ContaTransf2();
		
		
		Cliente cli1 = new Cliente();
		c1.cliente = cli1;
		c1.cliente.nome = "Gerson";
		c1.cliente.cpf = "454657441-78";
		System.out.println(c1.cliente.nome);
		
		

	}

}
