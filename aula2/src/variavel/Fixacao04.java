package variavel;

import java.util.Scanner;

/*6)	Fa?a um programa em java que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano 
 * com 365 dias e m?s com 30 dias. 
 * */
public class Fixacao04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite quantos anos tens: ");
		int anos = sc.nextInt();
		
		System.out.println("Agora quantos meses tem: ");
		int meses = sc.nextInt();
		
		System.out.println("Por ultimo quantos dias fecha hoje: ");
		int dias = sc.nextInt();
		
		int total = (anos*365) + (meses* 30) + dias;
		
		System.out.println("Voc? tem "+total +" dias de vida!!!");

	}

}
