package entity;

public class Funcionario {

	protected String name;
	protected String cpf;
	protected String departamento;
	protected String dataAdmissao;
	protected String status;
	protected double salario;
	
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double getBonus() {
		return this.salario * 0.05;
	}
		
	public String getNome() {
		return this.name;
	}
	
	public void setNome(String nome) {
		this.name = nome;
	}
}
