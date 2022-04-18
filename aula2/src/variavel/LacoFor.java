package variavel;

import java.util.Scanner;

public class LacoFor {
	
	public static void main(String[] args) {
		
		/* for(declaração_inicial; expressão_lógica; salto){
			instrução 1
			instrução 2
		
			}*/
		Scanner ler = new Scanner(System.in);
		System.out.println("Até quanto que contar o 'i'? ");
		int o = ler.nextInt();
		System.out.println("Apartir de qual numero? ");
		int a = ler.nextInt();
		System.out.println("Pulando de quanto? ");
		int b = ler.nextInt();
		
		for(int i = a; i <= o; i+=b) {
			System.out.println("Imprime: "+i);
		}
		
		
		
	}

}
