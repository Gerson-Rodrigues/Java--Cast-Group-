package desafios;
import java.util.Scanner;
/*13) Para o enunciado a seguir foi elaborado um programa em java em Português 
 * Estruturado que contém erros, identifique os erros no programa em java apresentado abaixo:
Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, 
calcule e mostre seu peso ideal, utilizando as seguintes fórmulas:

- para sexo masculino: peso ideal = (72.7 * altura) - 58
- para sexo feminino: peso ideal = (62.1 * altura) - 44.7

inicio 

ler nome 
ler sexo 

	se sexo = M então 
		peso_ideal (72.7 * altura) - 58
	senão 
		peso_ideal (62.1 * altura) – 44.7
	fim_se
	escrever peso_ideal

fim*/
public class Desafio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = " ";
		String sexo = "M";
		double altura, peso_ideal;
		System.out.println("=============== Teste do peso ideal ===========");
		System.out.println("");
		System.out.println("Digite seu nome: ");
		nome = sc.next().toUpperCase();		
		System.out.printf("Bem Vindo: %s ao Sistema de Consulta de Peso!!",nome);
		System.out.println("Qual sua altura? ");
		altura = sc.nextDouble();
		System.out.println("Qual é o seu sexo? M ou F");
		sexo = sc.next().toLowerCase();
		if (sexo == "m") {
			peso_ideal = (72.7 * altura) - 58;
			System.out.printf("O peso ideal para você é: %.2fKg",peso_ideal);
		}else {
			peso_ideal = (62.1 * altura) - 44.7;
			System.out.printf("O peso ideal para você é: %.2fKg",peso_ideal);
		}
		sc.close();
	}
}
