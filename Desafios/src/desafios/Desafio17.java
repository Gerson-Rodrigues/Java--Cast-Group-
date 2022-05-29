package desafios;
import java.util.Scanner;
/*20) Ler 3 valores (considere que não serão informados valores iguais) 
 * e escrevê-los em ordem crescente.
 * */
public class Desafio17 {
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
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num3, num2, num1);
		}else if (num1 > num2 && num1 < num3) {
			System.out.println("2º IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num2, num1, num3);
		}else if (num1 < num2 && num2 < num3) {
			System.out.println("3º IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num1, num2, num3);
		}else if (num1 < num2 && num1 > num3) {
			System.out.println("4º IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num3, num1, num2);
		}else if (num1 < num3 && num2 > num3) {
			System.out.println("5º IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num1, num3, num2);
		}else if (num1 > num3 && num2 < num3) {
			System.out.println("6º IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d é menor que %d que é menor que %d", num2, num3, num1);
		}
		
		sc.close();
	}
}
