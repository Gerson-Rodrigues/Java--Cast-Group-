package variavel;
/* 1) Escreva em Java que armazene o valor 10 em uma vari�vel  A e o valor 20 em uma vari�vel B. 
 * A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com que 
 * o valor que est� em A passe para B e vice-versa. Ao final, escrever os valores que ficaram 
 * armazenados na vari�veis. 
 * */
public class Fixacao01 {

	public static void main(String[] args) {
		
		int A = 10 , B = 20, c;
		
		System.out.printf("Os valores originais s�o %d em A e %d em B \n",A,B);
		c = A;
		A = B;
		B = c;
		System.out.printf("\nAo final fica A valendo %d e B valendo %d", A, B);
		
	}

}
