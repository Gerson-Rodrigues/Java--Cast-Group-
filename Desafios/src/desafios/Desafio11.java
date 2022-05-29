package desafios;

import java.util.Scanner;

/*14) Ler o sal�rio fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. 
 * Sabendo-se que ele recebe uma comiss�o de 3% sobre o total das vendas at� R$ 1.500,00 
 * mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu sal�rio total.
 * */
public class Desafio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String porcento = "%";
		double sal_fixo, tot_vendas, sal_total;
		System.out.println("Digite o seu sal�rio fixo: ");
		sal_fixo = sc.nextDouble();
		System.out.println("Agora nos conte qual foi o total de vendas: ");
		tot_vendas = sc.nextDouble();
		if (tot_vendas < 1500) {
			sal_total = sal_fixo + (tot_vendas * 1.03);
			System.out.printf("Sal�rio Final com aumento de 3%d porcento %.2f", porcento, sal_total);
		} else {
			sal_total = sal_fixo + (tot_vendas * 1.05);
			System.out.printf("Sal�rio Final com aumento de 5 porcento %.2f", sal_total);
		}
		sc.close();
	}
}