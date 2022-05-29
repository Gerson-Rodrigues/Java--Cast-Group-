package desafios;

import java.util.Scanner;

/*6) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
 * e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que 
 * leia o número de maçãs compradas, calcule e escreva o custo total da compra.
 * 
 * */
public class Desafio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas maçãs vais comprar? ");
		double macas = sc.nextInt();
		if (macas < 12) {
			macas = macas * 1.30;
		} else {
			macas = macas * 1;
		}
		System.out.printf("O valor total pago pelas maçãs foi de: R$%.2f", macas);
		sc.close();
	}
}
