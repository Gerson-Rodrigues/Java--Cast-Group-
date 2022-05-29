package desafios;

import java.util.Scanner;

/*7) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética 
 * simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a 
 * média calculada.
 * */
public class Desafio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular a Nota de um aluno");
		System.out.println("Digite a 1ª nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Agora a 2ª nota: ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;
		if (media < 6) {
			System.out.printf("O aluno foi reprovado com nota %.2f", media);
		} else {
			System.out.printf("O aluno foi aprovado com nota %.2f", media);
		}
		sc.close();
	}
}
