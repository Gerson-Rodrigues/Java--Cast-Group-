package desafios;

import java.util.Scanner;

/*5) Ler um valor e escrever se � positivo ou negativo 
 * (considere o valor zero como positivo).
 * 
 * */
public class Desafio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero para verifica��o: ");
		double N = sc.nextDouble();

		if (N < 0) {
			System.out.println("Valor digitado � negativo....");
		} else {
			System.out.println("Valor digitado � positivo!!!");
		}

		sc.close();
	}
}
