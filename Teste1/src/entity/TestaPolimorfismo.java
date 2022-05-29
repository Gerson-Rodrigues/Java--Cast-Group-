package entity;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario f = new Funcionario();
		f.setSalario(1000);
		controle.setTotalSalarios(f);
		System.out.println(controle.getTotalSalarios());
		
		
		
		Gerente g = new Gerente();
		g.setSalario(10000);
		controle.setTotalSalarios(g);
		System.out.println(controle.getTotalSalarios());
		
	}
}
