package variavel;

import java.util.Scanner;

/*8)	Escreva um programa em java para ler o sal?rio mensal atual de 
 * um funcion?rio e o percentual de reajuste. Calcular e escrever o valor do novo sal?rio. 
 * */
public class Fixacao06 {

	public static void main(String[] args) {
		
		Scanner cont = new Scanner(System.in);
		
		double novo_sal;
		
		System.out.print("digite seu sal?rio atual: R$\n");
		double sal_atual = cont.nextDouble();
		System.out.print("Digite o percentual de reajuste: ");
		double reajuste = cont.nextDouble();
		
		novo_sal = sal_atual+(sal_atual*(reajuste/100));
		
		System.out.printf("Seu sal?rio atual ser? de: R$ %.2f", novo_sal);
		
	}

}
