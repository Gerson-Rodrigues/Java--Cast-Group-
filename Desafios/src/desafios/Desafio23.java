package desafios;

import java.util.Scanner;

/*36) Escreva um programa em java que leia as idades de 2 homens e de 
 * 2 mulheres (considere que as idades dos homens serão sempre diferentes 
 * entre si, bem como as das mulheres). Calcule e escreva a soma das 
 * idades do homem mais velho com a mulher mais nova, e o produto das idades 
 * do homem mais novo com a mulher mais velha.
 * */
public class Desafio23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hNovo, hVelho, mNova, mVelha, casal1, casal2;
		System.out.println("Digita a idade de um Homem:");
		int a = sc.nextInt();
		System.out.println("Digita outra idade de um Homem:");
		int b = sc.nextInt();
		System.out.println("Digita a idade de uma Mulher:");
		int c = sc.nextInt();
		System.out.println("Digita outra idade de um Mulher:");
		int d = sc.nextInt();
		// teste idade dos homens
		if (a < b) {
			hNovo = a;
			hVelho = b;
		} else {
			hVelho = a;
			hNovo = b;
		}
		if (c < d) {
			mNova = c;
			mVelha = d;
		} else {
			mNova = d;
			mVelha = c;
		}
		System.out.printf(
				"Homem mais Novo: %d anos, Homem mais Velho: %d anos\n"
						+ "Mulher mais Nova: %d anos, Mulher mais velha: %d anos" + "\n",
				hNovo, hVelho, mNova, mVelha);
		casal1 = hNovo + mVelha;
		casal2 = hVelho + mNova;
		System.out.println("------------------------------");
		System.out.printf("A soma do casal Homem Novo + Mulher Velha deu: %d anos"
				+ "\n E a somado casal Homem Velho + Mulher Nova deu: %d anos", casal1, casal2);
		sc.close();
	}
}
