package entity;

public class Gerente extends Funcionario{

	int senha;
	
	double getBonus() {
		return this.salario * 0.15;
	}
	
	public boolean verifica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Autorizado!!!");
			return true;
		}else{
			System.out.println("Acesso Não Autorizado!!!");
			return true;
		}
			
	}
	
}
