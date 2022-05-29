package aula31;

public class SimmplesArray3 {
	public static void main(String[] args) {
		int[] idade = new int [100];
		
		
		
		
		
		//array inteiro de 512 x 128 elementos
		int [][] twod = new int[512][128];
		
		for (int i=0; i<twod.length; i++) {
			for(int j=0; j<twod.length; j++) {
				System.out.println("Posição "+ i +" - "+ idade[i]);
			}
		}
	}
}