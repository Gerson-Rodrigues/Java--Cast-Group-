package desafios;

import java.util.Scanner;

/*4) Ler um valor e escrever a mensagem � MAIOR QUE 10! se o 
 * valor lido for maior que 10, caso contr�rio escrever N�O � MAIOR QUE 10!
 * */
public class Desafio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um valor para ser verificado: ");
		int num = sc.nextInt();

		if (num > 10) {
			System.out.printf("O n�mero %d � maior que DEZ!!!", num);
		} else if (num == 10) {
			System.out.printf("O n�mero %d � igual!!", num);
		} else {
			System.out.printf("O n�mero %d � inferior � DEZ!", num);
		}

		sc.close();
	}
}