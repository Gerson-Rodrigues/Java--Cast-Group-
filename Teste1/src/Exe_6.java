import java.util.*;
public class Exe_6 {

	public static void main(String[] args) {
		/* Escrever um algoritmo que l?:
		- a percentagem do IPI a ser acrescido no valor das pe?as 
		- o c?digo da pe?a 1, valor unit?rio da pe?a 1, quantidade de pe?as 1 
		- o c?digo da pe?a 2, valor unit?rio da pe?a 2, quantidade de pe?as 2 
		  O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
		  
		  F?rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
			*/
		
		Scanner formula = new Scanner(System.in);
		
		System.out.println("Digite o valor da IPI");
		double IPI = formula.nextDouble();
		
		System.out.println("Digite o c?digo da pe?a N1 ");
		int cod_peca1 = formula.nextInt();
		System.out.println("Digite o valor unit?rio da pe?a N1 ");
		double valor_peca1 = formula.nextDouble();
		System.out.println("Digite a quantifdade de pe?as N1:");
		int quan_peca1 = formula.nextInt();
	
		System.out.println("Digite o c?digo da pe?a N2 ");
		int cod_peca2 = formula.nextInt();
		System.out.println("Digite o valor unit?rio da pe?a N2 ");
		double valor_peca2 = formula.nextDouble();
		System.out.println("Digite a quantifdade de pe?as N2:");
		int quan_peca2 = formula.nextInt();
	double form;
	form = (valor_peca1*quan_peca1 + valor_peca2*quan_peca2)*(IPI/100+1);
		
		System.out.println("O total compra foi do\n Item1 um do C?d. "+cod_peca1+"\n"
				+ " e do Item 2 do C?d."+cod_peca2+"\n foi de "+ form);
	
	
	
	}

}
