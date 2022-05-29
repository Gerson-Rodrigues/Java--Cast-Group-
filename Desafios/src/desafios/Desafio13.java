package desafios;
import java.util.Scanner;
/*16) Fa�a um programa em java para ler: quantidade atual em estoque, quantidade m�xima em estoque e 
 * quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia 
 * ((quantidade m�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for 
 * maior ou igual a quantidade m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever 
 * a mensagem 'Efetuar compra'.
 * */
public class Desafio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a sua quantidade de estoque: ");
		int estoque = sc.nextInt();
		System.out.println("Qual � o m�ximo para o estoque desta pe�a? ");
		int est_max = sc.nextInt();
		System.out.println("E minima? ");
		int est_min = sc.nextInt();
		int media = (est_max + est_min) / 2;
		System.out.println("M�dia Aceit�vel: " + media);
		if (media <= estoque) {
			System.out.println("N�o � necess�rio efetuar compra");
		} else {
			int x = 0;
			while (x < (media - estoque)) {
				x++;
			}
			System.out.printf("Tem que comprar no minimo mais %d para o estoque", x);
		}
		sc.close();
	}
}
