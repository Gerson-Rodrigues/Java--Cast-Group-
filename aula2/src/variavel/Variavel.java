package variavel;

public class Variavel {

		/*$ Tipos de dados Primitivos
		 * boolean
		 * caracter
		 * numero inteiro
		 * numero com ponto flutuante*/ 
	
	
	public static void main(String[] args) {

		int i = 5;		
		System.out.println("O valor da Variável i é: "+ i);
		
		int j = i++;   // atribui para incrementar   atribuir j=5; incrementar i=6
		int k = ++i;
		System.out.println("O valor da Variável j é: "+ j);
		System.out.println("O valor da Variável k é: "+ k);
		System.out.println("");
		
		int x = 5;
		System.out.println("O valor da Variável x é: "+ x);
		int y = ++x; // incrementou a variavel x=6 e após ele atribui y=6
		int z = x++;
		System.out.println("O valor da Variável y é: "+ y);
		System.out.println("O valor da Variável z é: "+ z);
		
		
		int l = 10;
		int m = 5;
		int n = l++ + l;		
		System.out.println("O valor da Variável i é: "+ l);
		System.out.println("O valor da Variável j é: "+ m);
		System.out.println("O valor da Variável k é: "+ n);
		System.out.println("");
		int o = 10;
		int p = 5 ;
		int q = ++p + o;		
		System.out.println("O valor da Variável i é: "+ o);
		System.out.println("O valor da Variável j é: "+ p);
		System.out.println("O valor da Variável k é: "+ q);
		System.out.println("");
		
		
		
		
		
	}

}
