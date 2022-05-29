package desafios;

import java.util.Scanner;

/*37) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * 						Até 5Kg             |        Acima de 5Kg	|
 * Morango 		|   R$2.50 por Kg			|	R$2.20 por Kg		|
 * Maçã			|   R$1.80 por Kg			|   R$1.50 por Kg		|
 * 
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
Escreva um programa em java para ler a quantidade (em Kg) de morangos e a 
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 * */
public class Desafio24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double macas, morangos, preco_maca, preco_morango;
		System.out.println("\\\\\\ TENDA DAS FRUTAS /////" + "\nMaçã  R$1,80/Kg ou acima de 5Kg fica R$1,50/Kg"
				+ "\nMorango R$2,50/Kg ou acima de 5Kg fica R$2,20/Kg");
		System.out.println("Digite a quantidade de Maçãs em Kg");
		macas = sc.nextDouble();
		System.out.println("Digite a quantidade de Morangos em Kg");
		morangos = sc.nextDouble();
		if (macas > 5) {
			preco_maca = macas * 1.5;
			System.out.printf("Total das Maçãs: R$%.2f\n", preco_maca);
		} else {
			preco_maca = macas * 1.8;
			System.out.printf("Total das Maçãs: R$%.2f\n", preco_maca);
		}
		if (morangos > 5) {
			preco_morango = morangos * 2.2;
			System.out.printf("Total das Maçãs: R$%.2f\n", preco_morango);
		} else {
			preco_morango = morangos * 2.5;
			System.out.printf("Total das Maçãs: R$%.2f\n", preco_morango);
		}

		double totalCompra = preco_maca + preco_morango;
		System.out.printf("Total: R$%.2f\n", totalCompra);
		if ((macas + morangos) > 8.0 || totalCompra > 25.0) {
			double descFinal = totalCompra - (totalCompra * 0.1);
			System.out.printf("Recebeu mais 10/ de desconto para suas compras \nficando em R$%.2f", descFinal);
		} else {
			System.out.printf("Suas compras ficaram em R$%.2f", totalCompra);
		}
		sc.close();
	}
}
