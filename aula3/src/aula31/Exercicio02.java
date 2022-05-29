package aula31;
public class Exercicio02 {
	/*Desenvolva um programaqe crie um vetor vetor01
	 * com 10 elementos inteiros preenchidos dinamicamente 
	 * Construir o vetor02 com o mesmo tipo e tamanho
	 * e com os "mesmos" elementos do veetor 01, ou seja,
	 * vetor01[i] = vetor02[i]*/
	public static void main(String[] args) {
		//Criação do vetor		
		int[] vetor01 = new int[10];
		int[] vetor02 = new int[10];		
		// preenchimento do vetor dinamicamente
		for (int i = 0; i < vetor01.length; i++) {
			vetor01[i] = i * 2;
		}
		
	// Preenchendo o vetor02 com os elementos do vetor01 	
		for (int i = 0; i < vetor02.length; i++) {
			vetor02[i] = vetor01[i]*10;
		}
		
		
	// saída dos dados
		for(int i = 0; i< vetor01.length; i++) {
			System.out.println("Posição :i "+i+" - "+vetor01[i]);
		}
		for (int vet : vetor02) {
			System.out.println("Posição :i - "+vet);
		}
	}
	
}
