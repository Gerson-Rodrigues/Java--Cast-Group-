package variavel;

public class Variavel {

		/*$ Tipos de dados Primitivos
		 * boolean
		 * caracter
		 * numero inteiro
		 * numero com ponto flutuante*/ 
	
	
	public static void main(String[] args) {

		int i = 5;		
		System.out.println("O valor da Vari�vel i �: "+ i);
		
		int j = i++;   // atribui para incrementar   atribuir j=5; incrementar i=6
		int k = ++i;
		System.out.println("O valor da Vari�vel j �: "+ j);
		System.out.println("O valor da Vari�vel k �: "+ k);
		System.out.println("");
		
		int x = 5;
		System.out.println("O valor da Vari�vel x �: "+ x);
		int y = ++x; // incrementou a variavel x=6 e ap�s ele atribui y=6
		int z = x++;
		System.out.println("O valor da Vari�vel y �: "+ y);
		System.out.println("O valor da Vari�vel z �: "+ z);
		
		
		int l = 10;
		int m = 5;
		int n = l++ + l;		
		System.out.println("O valor da Vari�vel i �: "+ l);
		System.out.println("O valor da Vari�vel j �: "+ m);
		System.out.println("O valor da Vari�vel k �: "+ n);
		System.out.println("");
		int o = 10;
		int p = 5 ;
		int q = ++p + o;		
		System.out.println("O valor da Vari�vel i �: "+ o);
		System.out.println("O valor da Vari�vel j �: "+ p);
		System.out.println("O valor da Vari�vel k �: "+ q);
		System.out.println("");
		
		
		
		
		
	}

}
