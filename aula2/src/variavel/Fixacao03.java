package variavel;

import java.util.Scanner;

/*5) Escreva um programa em java para ler as dimens�es de um ret�ngulo (base e altura), 
 *calcular e escrever a �rea do ret�ngulo. 
 * */
public class Fixacao03 {
	double base, altura;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor de base do retangulo: ");
		double base = sc.nextDouble();
		System.out.println("Escreva um valor para a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		System.out.println("O valor da area �: "+base*altura);
	}

}
