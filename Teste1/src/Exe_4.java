import java.util.Scanner;
public class Exe_4 {

	public static void main(String[] args) {
		// Um usu�rio deseja um algoritmo onde possa escolher que tipo de m�dia 
		// deseja calcular a partir de 3 notas. Fa�a um algoritmo que leia as notas,
		// a op��o escolhida pelo usu�rio e calcule a m�dia.
		// 1 -aritm�tica 
		// 2 -ponderada (pesos: 3,3,4)
		
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("Digite a Nota 1: ");
		int nota1 = num.nextInt();
		
		System.out.println("Digite a nota 2: ");
		int nota2 = num.nextInt();
		
		System.out.println("Digite a nota 3:");
		int nota3 = num.nextInt();
		
		/*do {
		System.out.println("====================================================\n"
				+ "Tens preferencia por qual forma calcular a m�dia?\n"
				+ "============================================================");
		System.out.println("Op��o 1 Aritm�tica");
		System.out.println("Op��o 2 Ponderada (Pesos: 3, 3, 4 respectivamente)");
		int opcao = num.nextInt();
		
		}while (opcao != 1 || opcao != 2);*/
		int media;
		 
		System.out.println("====================================================\n"
				+ "Tens preferencia por qual forma calcular a m�dia?\n"
				+ "============================================================");
		System.out.println("Op��o 1 Aritm�tica");
		System.out.println("Op��o 2 Ponderada (Pesos: 3, 3, 4 respectivamente)");
		int opcao = num.nextInt();
		
		switch (opcao) {
			case 1: 
				media = (nota1 + nota2 + nota3)/3;
				System.out.println("A m�dia ficou " + media);
				break;
			case 2:
				media = ((nota1*3)+(nota2*3)+(nota3*4)/3);
				System.out.println("A m�dia ficou " +media);
				break;
			default:
				System.out.println("Op��o inv�lida!!!!\n Digite uma op�ao v�lida.");
		}
		
	}

}
