package entidade;
/*
 * Classe Carro representa uma enidade.
 * Esse tipo de classe deve seguir um padr�o chamado Javabean
 * dessa forma, n�o deve ser permitido acesso direto aos atributs
 * 
 * ENCAPSULAMENTO - Garantir a integridade dos dados armazenados
 * em um atributo limitado o acessi a ele. Os atributos
 * ser�o privador e os m�todos de acesso p�blico*/
public class Carro {

	/*Modificador de acesso
	 * public - Acesso permitido para qualquer arquivo do mesmo pacote
	 * protected - desde que haja heran�a 
	 * private - dentro da pr�pria classe*/
	
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	
	// getter e setter
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo.toUpperCase().trim();
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco< 20000) {
		this.preco = 20000;
		System.out.println("Valor n�o armazenado! Assumido valor m�nimo");
		}else {
		this.preco = preco;
		}
	}
	// to String
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo +  ", preco=" + preco + "]";
	}
	
	
	
}
