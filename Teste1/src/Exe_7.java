import java.util.Scanner;
public class Exe_7 {

	public static void main(String[] args) {
		/*Crie um algoritmo que recebe 2 n�meros e multiplica o 
		  num1 pelo num2 atrav�s de somas repetidas. 
		  (ex: 2 e 3 = 2 + 2 + 2)
		  */ 

		
		Scanner multi = new Scanner(System.in); 
			System.out.println("Digite o primeiro numero para a conta ");
			int num1 = multi.nextInt();
			
			System.out.println("Digite o segundo numero para a conta");
			int num2 = multi.nextInt();
				
			int cont = 2;
				System.out.print(num1 +" * "+num2 +" -> "+num1);
			do {
				System.out.print(" + "+num1);
				
				cont = cont + 1;
				
			}while (cont <= num2);
			
				System.out.println(" = "+(num1*num2));
		
		
	}

}
