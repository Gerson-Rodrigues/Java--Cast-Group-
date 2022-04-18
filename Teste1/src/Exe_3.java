import java.util.Scanner;
public class Exe_3 {

	public static void main(String[] args) {
		// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
		// expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses 
		// e 15 dias = 1170 dias.)
		Scanner x = new Scanner(System.in);
		
		
		System.out.println("Digite quantos anos tens: ");
		int anos = x.nextInt();
		
		System.out.println("Agora quantos meses tem: ");
		int meses = x.nextInt();
		
		System.out.println("Por ultimo quantos dias fecha hoje: ");
		int dias = x.nextInt();
		
		int total = (anos*365) + (meses* 30) + dias;
		
		System.out.println("Você tem "+total +" dias de vida!!!");
		
		
	}

}
