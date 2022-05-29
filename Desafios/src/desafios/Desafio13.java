package desafios;
import java.util.Scanner;
/*16) Faça um programa em java para ler: quantidade atual em estoque, quantidade máxima em estoque e 
 * quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média 
 * ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for 
 * maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever 
 * a mensagem 'Efetuar compra'.
 * */
public class Desafio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque a sua quantidade de estoque: ");
		int estoque = sc.nextInt();
		System.out.println("Qual é o máximo para o estoque desta peça? ");
		int est_max = sc.nextInt();
		System.out.println("E minima? ");
		int est_min = sc.nextInt();
		int media = (est_max + est_min) / 2;
		System.out.println("Média Aceitável: " + media);
		if (media <= estoque) {
			System.out.println("Não é necessário efetuar compra");
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
