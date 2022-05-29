package desafios;

import java.util.Scanner;

/*5) Ler um valor e escrever se é positivo ou negativo 
 * (considere o valor zero como positivo).
 * 
 * */
public class Desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para verificação: ");
		double N = sc.nextDouble();

		if (N < 0) {
			System.out.println("Valor digitado é negativo....");
		} else {
			System.out.println("Valor digitado é positivo!!!");
		}

		sc.close();
	}
}
