package variavel;

import java.util.Scanner;

/*9)	O custo de um carro novo ao consumidor ? a soma do custo de f?brica com a 
 * porcentagem do distribuidor e dos impostos (aplicados ao custo de f?brica). Supondo que o 
 * percentual do distribuidor seja de 28% e os impostos de 45%, escrever um programa em java 
 * para ler o custo de f?brica de um carro, calcular e escrever o custo final ao consumidor.
 */
public class Fixacao07 {

	public static void main(String[] args) {
		
		Scanner calc = new Scanner(System.in);
		System.out.print("Qual o valor de custo da fabrica? R$");
		double preco_fabrica = calc.nextDouble();
		
		double distribuidor = preco_fabrica+(preco_fabrica*0.28);
		//System.out.printf("R$%.2f",distribuidor);
		
		System.out.printf("O pre?o de revenda do distribuidor ? de: R$%.2f \n", distribuidor);
		
		double imp = distribuidor+(distribuidor*0.45);
		System.out.printf("Valor final ao cosumidor ? de: R$%.2f",imp);
		
		
	}

}
