package variavel;

import java.util.Scanner;

/*7)	Escreva um programa em java para ler o n�mero total de eleitores 
 * de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. Calcular e 
 * escrever o percentual que cada um representa em rela��o ao total de eleitores. 
 * */
public class Fixacao05 {

	public static void main(String[] args) {
		Scanner voto = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de votos brancos: ");
		int branco = voto.nextInt();
		
		System.out.println("Digite o numero de votos nulos: ");
		int nulo = voto.nextInt();
		
		System.out.println("Digite os numero de votos validos: ");
		int valido = voto.nextInt();
		
		
		int total = (valido+nulo+branco);
		System.out.println("total "+ total);
		
		double perc_branco = branco*100/total;
		
		double perc_nulo = nulo*100/total;
		
		double perc_valido = valido*100/total;
		
		System.out.printf(" Brancos: %.2f \n Nulos: %.2f \n V�lidos: %.2f",perc_branco, perc_nulo, perc_valido);
		
		
		
		
	}

}
