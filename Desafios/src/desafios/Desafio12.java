package desafios;
import java.util.Scanner;
/*15) Fa�a um programa em java para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, 
 * calcular e escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). Tamb�m testar se saldo 
 * atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem 
 * 'Saldo Negativo'.
 * */
public class Desafio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String conta_cliente;
		double saldo, saldo_atual, debito, credito;
		System.out.println("Digite os dados da Conta Corrente: ");
		conta_cliente = sc.next();
		System.out.println("Digite seu saldo: ");
		saldo = sc.nextDouble();
		System.out.println("Digite o D�bito: ");
		debito = sc.nextDouble();
		System.out.println("Digite agora seu Cr�dito: ");
		credito = sc.nextDouble();
		saldo_atual = saldo - debito + credito;
		System.out.printf("A Conta de N� %s ", conta_cliente);
		System.out.println("tem o saldo de: "+saldo_atual);
		if(saldo_atual>0) {
			System.out.println("Seu saldo est� Positivo");
		}else {
			System.out.println("Seu saldo est� Negativo");
		}
		sc.close();
	}
}
