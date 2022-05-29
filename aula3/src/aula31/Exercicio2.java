package aula31;

import java.util.Scanner;

/*Escreva um programa que permita a leitura das notas de uma turma 
 * de 20 alunos. Calcular a média da turma e contar quantos alunos obtiveram 
 * nota acima desta média calculada. Escrever a média da turma e o resultado da contatgem
 * */
public class Exercicio2 {

	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] alunos = new int[20];
			for (int i = 0; i < alunos.length; i++) {
				System.out.printf("Nota do aluno %d",alunos[i]+1);
				double nota = sc.nextDouble();
				System.out.println("Aluno: "+alunos[i]+" nota: "+nota);
			}
		}		
	}
}
