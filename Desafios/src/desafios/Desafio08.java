package desafios;

import java.util.Scanner;

/*11) Ler a hora de início e a hora de fim de um jogo de Xadrez 
 * (considere apenas horas inteiras, sem os minutos) e calcule a 
 * duração do jogo em horas, sabendo-se que o tempo máximo de duração 
 * do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar 
 * no dia seguinte.
 * */
public class Desafio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite hora de inicio de uma partida de Xadrez:");
		int inicio = sc.nextInt();
		System.out.println("coloque a hora final. ");
		int fim = sc.nextInt();
		if (inicio > fim) {
			fim += 24;
			int tot = fim - inicio;
			System.out.printf("Inicio %d e Fim %d. \nTotal de %d horas", inicio, fim - 24, tot);
		} else {
			int tot = fim - inicio;
			System.out.printf("Inicio %d e Fim %d. \nTotal de %d horas", inicio, fim - 24, tot);

		}
		sc.close();
	}
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * 
	 * int horaInicio; int horaFinal;
	 * 
	 * System.out.println("digite a hora que começou o jogo!"); horaInicio =
	 * sc.nextInt(); System.out.
	 * println("digite a hora que terminou o jogo num intervalo menor que 24 horas!"
	 * ); horaFinal = sc.nextInt();
	 * 
	 * // se a hora final for maior que a hora de inicio a partida so pode ter
	 * terminado no mesmo dia ai so fazer subtração simples if (horaFinal >
	 * horaInicio) { System.out.println("A partida durou: " + (horaFinal -
	 * horaInicio) + " horas");
	 * 
	 * // caso contrario a partida foi ate o dia seguinte e basta somar as horas do
	 * dia 1 mais as horas do dia 2 } else { System.out.println("A partida durou: "
	 * + ((24 - horaInicio) + horaFinal) + " horas");
	 * 
	 * } }
	 */

}
