package desafios;
import java.util.Scanner;
/*38) Fa�a um programa em java para ler um n�mero que � um c�digo de usu�rio. Caso este 
 * c�digo seja diferente de um c�digo armazenado internamente no programa em java 
 * (igual a 1234) deve ser apresentada a mensagem �Usu�rio inv�lido!�. Caso o C�digo 
 * seja correto, deve ser lido outro valor que � a senha. Se esta senha estiver incorreta 
 * (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a senha esteja correta, 
 * deve ser mostrada a mensagem �Acesso permitido�.*/
public class Desafio25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo de acesso: ");
		int cod = sc.nextInt();
		int tent = 1;
		if (cod != 1234) {
			System.out.printf("N� de tentativas %d, m�x 5.\n",tent);
			while(cod!= 1234 && tent <5) {
				System.out.println("Tente novamente, outro c�digo: ");
				int c = sc.nextInt();
				cod = c;	
				++tent;
				if (cod != 1234) {
					System.out.printf("N� de tentativas %d, m�x 5.\n",tent);
				}
			}
		}
		
		if(cod !=1234 && tent >5) {
				System.out.println("C�digo de Usu�rio, Bloqueado!!!");
				
		}else{
			System.out.println("C�digo correto");
		}
		sc.close();
	}
}
