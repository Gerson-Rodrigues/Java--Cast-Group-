package desafios;
import java.util.Scanner;
/*21) Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se 
 * formam ou n�o um tri�ngulo. OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor 
 * que a soma dos outros 2 lados.
 */
public class Desafio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado um do tri�gulo");
		int ld1 = sc.nextInt();
		System.out.println("Digite o lado dois do tri�gulo");
		int ld2 = sc.nextInt();
		System.out.println("Digite o lado tr�s do tri�gulo");
		int ld3 = sc.nextInt();
		if ((ld1 +ld2) > ld3 && (ld1 + ld3)> ld2 && (ld2 + ld3)> ld1) {
			System.out.println("Habemos Tri�gulo!!");
		}else {
			System.out.println("No habemos nadie!!");
		}
		sc.close();
	}
}
