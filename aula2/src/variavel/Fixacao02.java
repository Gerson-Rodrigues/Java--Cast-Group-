package variavel;

import java.util.Scanner;

/*4) Escreva um programa em java para ler um valor (do teclado) e 
 * escrever (na tela) o seu antecessor. */
public class Fixacao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = sc.nextInt();
		
		System.out.printf("O valor final: %d",--num);
		
	}

}
