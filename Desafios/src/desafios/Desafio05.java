package desafios;

import java.util.Calendar;
import java.util.Scanner;

/*8) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem 
 * que diga se ela poderá ou não votar este ano (não é necessário considerar o mês 
 * em que a pessoa nasceu).
 * 
 * */
public class Desafio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();// declara um objeto para a classe Calendar
		int anoAtual = cal.get(Calendar.YEAR);// captura o ano atual da máquina
		System.out.printf("****** Estamos no ano de %d *****\n", anoAtual);
		System.out.println("Digite o seu ano de nascimento:");
		int anoNasc = sc.nextInt(); // recebe o ano digitado
		int idade = anoAtual - anoNasc;
		System.out.printf("A sua idade é: %d anos\n", idade);
		if ((idade > 15 && idade < 18) || idade > 65) {
			System.out.println("Pode votar, mas não é obrigatório!");
		} else if (idade > 17 && idade < 65) {
			System.out.println("O voto é obrigatório");
		} else if (idade < 16) {
			System.out.println("Não pode votar, ainda");
		}
		sc.close();
	}
}
