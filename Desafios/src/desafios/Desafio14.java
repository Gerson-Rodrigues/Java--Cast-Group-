package desafios;
import java.util.Scanner;
/*SELE��O ANINHADA OU CONCATENADA
 * 17) Ler um valor e escrever se � positivo, negativo ou zero.
 * */
public class Desafio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if (valor > 0) {
			System.out.println("Valor � Positivo");
		}else if(valor == 0){
			System.out.println("Valor � 0 (Positivo)");
		}else {
			System.out.println("Valor � Negativo");
		}
		sc.close();
	}
}
