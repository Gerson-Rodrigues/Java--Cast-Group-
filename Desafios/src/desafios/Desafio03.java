package desafios;

import java.util.Scanner;

/*6) As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, 
 * e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que 
 * leia o n�mero de ma��s compradas, calcule e escreva o custo total da compra.
 * 
 * */
public class Desafio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas ma��s vais comprar? ");
		double macas = sc.nextInt();
		if (macas < 12) {
			macas = macas * 1.30;
		} else {
			macas = macas * 1;
		}
		System.out.printf("O valor total pago pelas ma��s foi de: R$%.2f", macas);
		sc.close();
	}
}
