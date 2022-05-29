package variavel;

import java.util.Scanner;

/*10)	Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, 
 * mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
 * Escrever um programa em java que leia o número de carros por ele vendidos, o valor total de suas vendas, 
 * o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor. 
 * */
public class Fixacao08 {

	public static void main(String[] args) {
		double sal=0, ncar=0, co=0, vtvenda=0, sal_tot=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário: R$");
		double sal = sc.nextDouble();
		System.out.println("Quantidade de carros vendido? ");
		double ncar = sc.nextDouble();
		System.out.println("Qual sua comissão: R$");
		double co  = sc.nextDouble();
		
		
	}

}
