package variavel;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b; 
		System.out.println("Digite o primeiro numero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = ler.nextInt();
		
		System.out.println("\t Resultado:\n");
		System.out.println("Soma: "+(a+b));
		System.out.printf("%d + %d + %d\n", a, b, (a+b));
		System.out.println("Subtra��o: "+(a-b));
		System.out.println("Divis�o: "+(b/a));
		System.out.println("Multiplica��o: "+(a*b));
		
		
	}

}