package variavel;

import java.util.Scanner;

/*12)	Fa�a um programa em java que leia tr�s notas de um aluno, calcule e escreva a 
 * m�dia final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5. 
 * F�rmula para o c�lculo da m�dia final �: 
 	 	 	n1 * 2 + n2 * 3 + n3 * 5 	  	mediafinal 	= -----------------------------------  10
 * */
public class Fixacao10 {

	public static void main(String[] args) {
		double media;
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1: ");
		int nota1 = num.nextInt();
		
		System.out.println("Digite a nota 2: ");
		int nota2 = num.nextInt();
		
		System.out.println("Digite a nota 3:");
		int nota3 = num.nextInt();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5)/3);
		System.out.printf("A m�dia ficou %.2f",media);

	}

}
