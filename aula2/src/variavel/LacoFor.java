package variavel;

import java.util.Scanner;

public class LacoFor {
	
	public static void main(String[] args) {
		
		/* for(declara��o_inicial; express�o_l�gica; salto){
			instru��o 1
			instru��o 2
		
			}*/
		Scanner ler = new Scanner(System.in);
		System.out.println("At� quanto que contar o 'i'? ");
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
