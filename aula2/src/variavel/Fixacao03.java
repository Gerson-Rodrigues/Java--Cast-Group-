package variavel;

import java.util.Scanner;

/*5) Escreva um programa em java para ler as dimensões de um retângulo (base e altura), 
 *calcular e escrever a área do retângulo. 
 * */
public class Fixacao03 {
	double base, altura;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor de base do retangulo: ");
		double base = sc.nextDouble();
		System.out.println("Escreva um valor para a altura do retangulo: ");
		double altura = sc.nextDouble();
		
		System.out.println("O valor da area é: "+base*altura);
	}

}
