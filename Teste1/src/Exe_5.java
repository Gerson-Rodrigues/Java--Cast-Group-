import java.util.Scanner;
public class Exe_5 {

	public static void main(String[] args) {
		// Escrever um algoritmo que l� um valor inteiro, calcula o  
		// fatorial desse n�mero e mostra o resultado.
		
		Scanner fat = new Scanner(System.in);
		
		System.out.println("Calcule o fatorial de um n�mero");
		System.out.println("digite o numero a seer calculado: ");
		int N = fat.nextInt();
		int fato = N;
		while (N > 1) {
			fato = fato*(N-1);
			N--;
		}
		System.out.println("o resultado do fatorial deu " + fato);
		
	}

}
