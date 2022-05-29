package desafios;

import java.util.Scanner;

/*35) Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
 * �lcool -
 * at� 20 litros, desconto de 3% por litro
 * acima de 20 litros, desconto de 5% por litro
 * 
 * Gasolina -
 * at� 20 litros, desconto de 4% por litro
 * acima de 20 litros, desconto de 6% por litro
 * 
 * Escreva um programa em java que leia o n�mero de litros vendidos e o tipo de combust�vel 
 * (codificado da seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago 
 * pelo cliente sabendo-se que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do 
 * �lcool � R$ 2,90.
 * */
public class Desafio22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tipo;
		System.out.println("Quanto litros de combustivel foi vendido? ");
		double combus = sc.nextDouble();
		System.out.println("Qual tipo foi abastecido: \n" + "A - �lcool ou G - Gasolina");
		tipo = sc.next().toUpperCase();
		System.out.println(tipo);
		
		double pagar = 0, alc = 2.9, gas = 3.3;
		switch (tipo) {
		case "A":
			System.out.println("Combust�vel escolhido foi �lcool!");
			if (combus <= 20) {
				pagar = (alc - (alc * 0.03)) * combus;
				System.out.println("3% de desconto");
			} else {
				pagar = (alc - (alc * 0.05)) * combus;
				System.out.println("5% de deconto");
			}
			System.out.printf("Total � pagar � R$%.2f", pagar);
			break;
		case "G":
			System.out.println("Combust�vel escolhido foi Gasolina!");
			if (combus <= 20) {
				pagar = (gas - (gas * 0.04)) * combus;
				System.out.println("4% de deconto");
			} else {
				pagar = (gas - (gas * 0.06)) * combus;
				System.out.println("6% de deconto");
			}
			System.out.printf("Total � pagar � R$%.2f", pagar);
			break;
		default:
			System.out.println("Tipo de Combustivel desconhecido!");
		}
		sc.close();
	}
}
