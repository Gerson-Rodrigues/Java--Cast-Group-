package desafios;
import java.util.Scanner;
/*20) Ler 3 valores (considere que n�o ser�o informados valores iguais) 
 * e escrev�-los em ordem crescente.
 * */
public class Desafio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione tr�s valores para verifica��o");
		System.out.println("Digite o primeiro: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo: ");
		int num2 = sc.nextInt();
		while (num1 == num2) {
			System.out.println("Segundo n�mero igual ao primeiro " + "digite outro, por favor");
			int num = sc.nextInt();
			num2 = num;
		} // fim do 1� loop while
		System.out.println("Digite o terceiro: ");
		int num3 = sc.nextInt();
		while (num3 == num1 || num3 == num2) {
			System.out.println("Esse n�mero tem que ser diferente dos demais \n " + "Digite outro, por favor: ");
			int num = sc.nextInt();
			num3 = num;
		} // fim do 2� loop while
		if (num1 > num2 && num2 > num3) {
			System.out.println("1� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num3, num2, num1);
		}else if (num1 > num2 && num1 < num3) {
			System.out.println("2� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num2, num1, num3);
		}else if (num1 < num2 && num2 < num3) {
			System.out.println("3� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num1, num2, num3);
		}else if (num1 < num2 && num1 > num3) {
			System.out.println("4� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num3, num1, num2);
		}else if (num1 < num3 && num2 > num3) {
			System.out.println("5� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num1, num3, num2);
		}else if (num1 > num3 && num2 < num3) {
			System.out.println("6� IF");
			System.out.println("Em ordem crescente. . . ");
			System.out.printf("%d � menor que %d que � menor que %d", num2, num3, num1);
		}
		
		sc.close();
	}
}
