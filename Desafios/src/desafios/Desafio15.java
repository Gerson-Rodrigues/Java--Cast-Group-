package desafios;
import java.util.Scanner;
/*18) Ler 3 valores (considere que n�o ser�o informados valores iguais) 
 * e escrever o maior deles.
 * */
public class Desafio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione dois valores para verifica��o");
		System.out.println("Digite o primeiro: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo: ");
		int num2 = sc.nextInt();
		while(num2 == num1) {
			System.out.println("Segundo n�mero igual ao primeiro "
					+ "digite outro, por favor");
			int num = sc.nextInt();
			num2 = num;
		}
		System.out.printf("1� n�mero � :%d  e o 2� n�mero � :%d \n", num1, num2);
		if(num1> num2) {
			System.out.printf("O N� %d � maior",num1);
		}else {
			System.out.printf("O N� %d � maior",num2);
		}
		sc.close();
	}

	
}
