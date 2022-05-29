package aula31;

public class Exemplo03 {
	/*Crie um vetor A com 15 elementos inteiros.
	 * Construir no vetor B de mesmo tamanho, sendo que cada elemento B
	 * deverá ser a raiz quadrada do respectivo elemento de A 
	 * Ex:
	 *  b[i] = sqrt(a[i])*/
	public static void main(String[] args) {
		int[] vetorA = new int[15];
		double[] vetorB = new double[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (i+3) * 2;
		}
		/*for(int i = 0; i< vetorA.length; i++) {
		System.out.println("Teste "+vetorA[i]);
		}*/
		
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
			System.out.printf("Raíz de %d deu %.2f \n",vetorA[i], vetorB[i]);
		}
	}
}