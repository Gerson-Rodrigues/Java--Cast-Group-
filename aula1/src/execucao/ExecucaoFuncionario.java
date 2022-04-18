package execucao;

import entity.Funcionario;
public class ExecucaoFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		
		func1.setNome("Carlos");
		func1.setRg(1999999999);
		func1.setCpf(123351018);
		func1.setSalario(2227.10);
		
		func2.setNome("Julio R.");
		func2.setRg(1238118798);
		func2.setCpf(1454158410);
		func2.setSalario(1457.90);
		
		func3.setNome("Jorge da Borracharia");
		func3.setRg(1277412368);
		func3.setCpf(1114781254);
		func3.setSalario(1804.30);
	
		
		System.out.println("Nome: "+func1.getNome());
		System.out.println("RG: "+func1.getRg());
		System.out.println("Cpf: "+func1.getCpf());
		System.out.println("Salário: "+func1.getSalario());
		System.out.println(". . .");
		System.out.println("Nome: "+func2.getNome());
		System.out.println("RG: "+func2.getRg());
		System.out.println("Cpf: "+func2.getCpf());
		System.out.println("Salário: "+func2.getSalario());
		System.out.println(". . .");
		System.out.println("Nome: "+func3.getNome());
		System.out.println("RG: "+func3.getRg());
		System.out.println("Cpf: "+func3.getCpf());
		System.out.println("Salário: "+func3.getSalario());
		
	}
	
	
}
