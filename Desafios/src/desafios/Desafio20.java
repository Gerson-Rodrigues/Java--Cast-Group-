package desafios;
import java.util.Scanner;
/* 23) Ler dois valores e imprimir uma das tr�s mensagens a seguir:
 * �N�meros iguais�, caso os n�meros sejam iguais
 * �Primeiro � maior�, caso o primeiro seja maior que o segundo; �Segundo maior�, 
 * caso o segundo seja maior que o primeiro.
 * */
public class Desafio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os n�meros s�i iguais.");
		}else if(num1 > num2) {
			System.out.println("O primeiro n�mero � MAIOR");
		}else {
			System.out.println("O segundo n�mero � MAIOR");
		}
		
		sc.close();
	}
}
