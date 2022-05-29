package entity;

public class TestaPoli2 {

	public static void main(String[] args) {
		
		ControleBonus controle = new ControleBonus();
		
		Funcionario f = new Funcionario();
				
		f.setSalario(1000);
		controle.setTotalBonus(f);
		System.out.println("Bonus: "+controle.getTotalBonus());
		
		System.out.println("=====================================");
		/*
		Gerente g = new Gerente();
		g.setSalario(1000);
		controle.setTotalBonus(g);
		System.out.println("Bonus: "+controle.getTotalBonus());
		*/
		System.out.println("=====================================");
		
		Funcionario f1 = new Gerente();
		f1.setSalario(1000);
		controle.setTotalBonus(f1);
		System.out.println("Bonus: "+controle.getTotalBonus());
		
		/*
		Gerente g1 = new Funcionario();
		f1.setSalario(1000);
		controle.setTotalBonus(f1);
		System.out.println("Obj Gerente"+controle.getTotalBonus());
		*/
	}
	
}
