package desafios;
import java.util.Scanner;
/*15) Faça um programa em java para ler: número da conta do cliente, saldo, débito e crédito. Após, 
 * calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo 
 * atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 
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
		System.out.println("Digite o Débito: ");
		debito = sc.nextDouble();
		System.out.println("Digite agora seu Crédito: ");
		credito = sc.nextDouble();
		saldo_atual = saldo - debito + credito;
		System.out.printf("A Conta de Nº %s ", conta_cliente);
		System.out.println("tem o saldo de: "+saldo_atual);
		if(saldo_atual>0) {
			System.out.println("Seu saldo está Positivo");
		}else {
			System.out.println("Seu saldo está Negativo");
		}
		sc.close();
	}
}
