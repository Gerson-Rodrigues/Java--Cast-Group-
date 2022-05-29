package desafios;
import java.util.Scanner;
/*21) Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se 
 * formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor 
 * que a soma dos outros 2 lados.
 */
public class Desafio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado um do triâgulo");
		int ld1 = sc.nextInt();
		System.out.println("Digite o lado dois do triâgulo");
		int ld2 = sc.nextInt();
		System.out.println("Digite o lado três do triâgulo");
		int ld3 = sc.nextInt();
		if ((ld1 +ld2) > ld3 && (ld1 + ld3)> ld2 && (ld2 + ld3)> ld1) {
			System.out.println("Habemos Triâgulo!!");
		}else {
			System.out.println("No habemos nadie!!");
		}
		sc.close();
	}
}
