package variavel;

import java.util.Scanner;

/*11)	Escreva um programa em java para ler uma temperatura em graus Fahrenheit, calcular e 
 * escrever o valor correspondente em graus Celsius (baseado na f�rmula abaixo): 
 	C 	 	F - 32  
 	---------- 	= 	-----------  
 	5 	 	9 	 
  Observa��o: Para testar se a sua resposta est� correta saiba que  100oC  =  212F
 * */
public class Fixacao09 {

	public static void main(String[] args) {
		double c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus F�");
		double grausF = sc.nextDouble();
		
		c = ((grausF - 32) * 5) / 9;
		
		System.out.printf("A temperatura � %.1f C�",c);
		

	}

}
