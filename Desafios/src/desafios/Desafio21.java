package desafios;

import java.util.Scanner;

/*24) Seja o seguinte programa em java:
in�cio 
ler x 
ler y 
z (x*y) + 5 
	se z <= 0 ent�o 
		resposta �A�
		sen�o se z <= 100 ent�o 
			resposta �B�
			sen�o  
				resposta �C� 
			fim_se 
		fim_se
	escrever z, resposta
fim
Fa�a um teste de mesa e complete o quadro a seguir para os seguintes valores:
 * */
public class Desafio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int xi =0; xi < 5; xi++) {
			System.out.println("Digite dois numeros: X e Y respectivamente!!!!");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = (x * y) + 5;
			if (z <= 0) {
				System.out.printf("Resposta %d -> 'A' \n", z);
			} else if (z <= 100) {
				System.out.printf("Resposta %d -> 'B' \n", z);
			} else {
				System.out.printf("Resposta %d -> 'C' \n", z);
			}			
		} 
		sc.close();
	}
}
