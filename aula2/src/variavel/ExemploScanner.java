package variavel;

import java.util.Scanner;

public class ExemploScanner {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		System.out.println("Ol? "+nome+"!!" );
		
	}
}
