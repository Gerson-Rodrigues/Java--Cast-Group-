package desafios;

import java.util.Scanner;

/*12) A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que 
 * trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular 
 * com um acr�scimo de 50%. Escreva um programa em java que leia o n�mero de horas trabalhadas 
 * em um m�s, o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser 
 * acrescido das horas extras, caso tenham sido trabalhadas (considere que o m�s possua 4 
 * semanas exatas).
 * */
public class Desafio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora_fixa = 160;
		System.out.println("digite a quantidade de horas trabalhadas: ");
		int hora_trabalhada = sc.nextInt();
		System.out.println("O valor da hora e trabalho: ");
		double salario_hora = sc.nextDouble();
		double hora_total = 0;
		if (hora_trabalhada > hora_fixa) {
			int horas_extra = hora_trabalhada - hora_fixa;
			double sal_mes = hora_fixa * salario_hora;
			hora_total = sal_mes + (horas_extra * (salario_hora * 1.5));
			System.out.printf("Total do sal�rio no m�s + as Horas Extras: %.2f", hora_total);
		} else {
			hora_total = hora_trabalhada * salario_hora;
			System.out.printf("%.2f", hora_total);
		}
		sc.close();
	}
}
