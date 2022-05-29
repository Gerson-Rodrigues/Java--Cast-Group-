import java.util.Scanner;
public class QuestaBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int pista, voltas, abastece, consumo_combus, tot_voltas;
		double tot_pista, voltas_por_abast, total_gasolina;
		System.out.println("Bem vindo ao GP da F1 - Rodrigues");
		System.out.println("Vamos calcular quantas rebastecidas deveremos utilizar para concuir a corrida");
		System.out.println("");
		System.out.println("Qual o comprimento da pista? Em M");
		pista = sc.nextInt();
		System.out.println("Total de Voltas será? ");
		voltas = sc.nextInt();
		System.out.println("Quantidade de reabastecimentos desejados: ");
		abastece = sc.nextInt();
		System.out.println("Qual o consumo do carro? Em Km/L");
		consumo_combus = sc.nextInt();
		
		tot_pista = ((pista * voltas)/1000);
		voltas_por_abast = tot_pista / abastece;
		tot_voltas = (int) (voltas_por_abast / consumo_combus);
		System.out.printf("Numero gasto de litros até o primeiro abastecimento será de: %d",tot_voltas);
		System.out.printf("\nO número de Km por abastecimento será de %.2f",voltas_por_abast);
		total_gasolina = tot_pista / consumo_combus;
		System.out.printf("\nTotal de Km percorridos: %.2f", tot_pista);
		System.out.printf("\nTotal de gasolina gasto na corrida é de : %.2f", total_gasolina);
		sc.close();
	}

}
