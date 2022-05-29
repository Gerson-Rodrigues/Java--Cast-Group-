package desafios;
import java.util.Scanner;
/* 23) Ler dois valores e imprimir uma das três mensagens a seguir:
 * ‘Números iguais’, caso os números sejam iguais
 * ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, 
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
			System.out.println("Os números sãi iguais.");
		}else if(num1 > num2) {
			System.out.println("O primeiro número é MAIOR");
		}else {
			System.out.println("O segundo número é MAIOR");
		}
		
		sc.close();
	}
}
