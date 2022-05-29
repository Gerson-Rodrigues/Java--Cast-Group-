package desafios;
import java.util.Scanner;
/*22) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
 * Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra 
 * EMPATE.
 * */
public class Desafio19 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = sc.next();
		time1 = time1.substring(0,1).toUpperCase().concat(time1.substring(1));
		System.out.println("Digite o nome do segundo time: ");
		String time2 = sc.next();
		time2 = time2.substring(0,1).toUpperCase().concat(time2.substring(1));
		System.out.printf("Quantos gols o %s fez? ",time1.replace("_", " "));
		int gols_time1 = sc.nextInt();
		System.out.printf("Quantos gols o %s fez? ",time2.replace("_", " "));
		int gols_time2 = sc.nextInt();
		if(gols_time1 > gols_time2) {
			System.out.printf("O %s ganhou de %d x %d do %s", time1,gols_time1,gols_time2,time2);
		}else if(gols_time1 < gols_time2) {
			System.out.printf("O %s ganhou de %d x %d do %s", time2,gols_time2,gols_time1,time1);
		}else {
			System.out.println("EMPATE");
		}
		sc.close();
	}
}
