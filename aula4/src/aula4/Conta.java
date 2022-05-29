package aula4;

public class Conta {
	//atributo
	int numero;
	String nome;
	double saldo, limite;
	 
	void sacar(double valor) {
		  double saldoAlterado = saldo - valor;
		  saldo = saldoAlterado;
	}
	
	void depositar(double valor) {
		  this.saldo += valor;
		  // saldo = saldo + valor;
	}
	
	
}
