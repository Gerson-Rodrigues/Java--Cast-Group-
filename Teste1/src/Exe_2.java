import java.util.Scanner;
public class Exe_2 {

	public static void main(String[] args) {
		// Crie um algoritmo que receba 3 n?meros e informe qual o maior entre eles.
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int N1 = num.nextInt ();
		
		System.out.println("Digite o segundo numero: ");
		int N2 = num.nextInt ();
		
		System.out.println("Digite o terceiro numero: ");
		int N3 = num.nextInt ();
		
		if (N1 > N2 && N1 > N3) {
			System.out.println("O NUMERO "+ N1+ " ? O MAIOR");
		}else if (N1 < N2 && N2 > N3) {
			System.out.println("O NUMERO "+ N2+ " ? O MAIOR");
		}else if (N3 > N2 && N1 < N3) {
			System.out.println("O NUMERO "+ N3+ " ? O MAIOR");
		}
		
	}

}
