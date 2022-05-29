package desafios;

import java.util.Scanner;

/*9) Ler dois valores (considere que não serão lidos valores iguais) 
 * e escrever o maior deles.
 * */
public class Desafio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("digite outro numero: ");
		int num2 = sc.nextInt();
		if (num2 == num1) {
			do {
				System.out.println("digite numeros diferentes");
				System.out.println("digite um numero: ");
				int num3 = sc.nextInt();
				System.out.println("digite outro numero: ");
				int num4 = sc.nextInt();
				num2 = num4;
				num1 = num3;
			} while (num1 == num2);
		}
		if (num1 < num2) {
			System.out.printf("O numero %d é maior que o %d", num2, num1);
		} else {
			System.out.printf("O numero %d é maior que o %d", num1, num2);
		}
		sc.close();
	}

}
