package entity;

public class TestaHeranca {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setSalario(1000);
		double salFuncionario = f1.getSalario();
		System.out.println("O sal�rio do funcionario f1 �: "+ salFuncionario);
		System.out.println("O bonus do funcionario f1 � : "+f1.getBonus());
		
		Gerente g1 = new Gerente();
		g1.setSalario(10000);
		System.out.println("O slario da gerente � : "+g1.getSalario());
		System.out.println("O bonus dp Gerente g1 �: "+g1.getBonus());
		
		Gerente g2 = new Gerente();
		Funcionario f2 = g2;
		f2.setSalario(15000);
		System.out.println("O slario da gerente � : "+f2.getSalario());
		System.out.println("O bonus dp Gerente g1 �: "+f2.getBonus());
		
	}
}
