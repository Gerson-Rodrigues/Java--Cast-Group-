package desafios;

import java.util.Scanner;

/*19) Ler 3 valores (considere que não serão informados valores iguais) 
 * e escrever a soma dos 2 maiores.
 * */
public class Desafio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione três valores para verificação");
		System.out.println("Digite o primeiro: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo: ");
		int num2 = sc.nextInt();
		while (num1 == num2) {
			System.out.println("Segundo número igual ao primeiro " + "digite outro, por favor");
			int num = sc.nextInt();
			num2 = num;
		} // fim do 1º loop while
		System.out.println("Digite o terceiro: ");
		int num3 = sc.nextInt();
		while (num3 == num1 || num3 == num2) {
			System.out.println("Esse número tem que ser diferente dos demais \n " + "Digite outro, por favor: ");
			int num = sc.nextInt();
			num3 = num;
		} // fim do 2º loop while
		if (num1 > num2 && num2 > num3) {
			System.out.println("1º IF");
			System.out.printf("A soma dos %d e do %d deu %d", num1, num2, (num1 + num2));
		} else if (num1 > num2 && num1 < num3) {
			System.out.println("2º IF");
			System.out.printf("A soma dos %d e do %d deu %d", num1, num3, (num1 + num3));
		} else if (num1 < num2 && num2 < num3) {
			System.out.println("3º IF");
			System.out.printf("A soma do %d e do %d deu %d", num2, num3, (num2 + num3));
		}

		sc.close();
	}
}
