package desafios;
import java.util.Scanner;
/*SELEÇÃO ANINHADA OU CONCATENADA
 * 17) Ler um valor e escrever se é positivo, negativo ou zero.
 * */
public class Desafio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if (valor > 0) {
			System.out.println("Valor é Positivo");
		}else if(valor == 0){
			System.out.println("Valor é 0 (Positivo)");
		}else {
			System.out.println("Valor é Negativo");
		}
		sc.close();
	}
}
