package aula4;

public class Conta2 {
	//atributo
	int numero;
	String nome;
	double saldo, limite;
	 
	boolean saca(double valor) {
		if ((this.saldo + this.limite)< valor) {
			return false;
		}else {
			//this.saldo = saldo - valor;
			this.saldo -= valor;
			return true;
		}
	}	
	void depositar(double valor) {
		this.saldo += valor;
		// saldo = saldo + valor;
	}
	
	
}
