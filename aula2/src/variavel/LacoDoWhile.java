package variavel;

public class LacoDoWhile {
	
	public static void main(String[] args) {
		//testa executa
		
		int x = 0; // inicialização fora
		do {
			System.out.println("o valor de x é "+x);
			x++;
		}while(x<10);
				
		/*System.out.println("valor de x: "+x);
		System.out.println("fim da condição, após cessar a condição do While.");*/
		System.out.println("o valor de x : "+x);
		System.out.println("após não ter satisfeito a condição.");
	}

}
