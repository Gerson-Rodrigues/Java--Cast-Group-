import java.util.Scanner;
public class Exe_1 {

	public static void main(String[] args) {
		//Crie um algoritmo que leia um número diferente de zero e diga se este número é positivo ou negativo.
		
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int N = num.nextInt ();
		
		
			if (N > 0) {
				System.out.println("Numero Positivo");
			}else if (N < 0) {
				System.out.println("Numero Negativo");
			}else {
				System.out.println("numero igual a zero");
		 }
			num.close();
	}

}
