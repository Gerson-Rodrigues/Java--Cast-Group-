package entity;
/*classe carro representa uma entidade.
 * Esse tipo de classe deve seguir um padr?o JAVABEAN
 * Dessa forma, n?o deve ser permitidi o acesso 
 * direto aos atributos. 
 * 
 * ENCAPSULAMENTO - Garantir a integridade dos dados armazenados em um atributo  
 * limitando o acesso a ele, os atributos ser?o privados*/

public class Carro {
	// atributo
	private String modelo;
	private int ano;
	private String cor;
	private double preco;
	
	// m?todos
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
		this.preco = preco;
	}
	
	// entrada SET
	
	// saida GET

}
