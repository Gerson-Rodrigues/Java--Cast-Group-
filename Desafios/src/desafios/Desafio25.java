package desafios;
import java.util.Scanner;
/*38) Faça um programa em java para ler um número que é um código de usuário. Caso este 
 * código seja diferente de um código armazenado internamente no programa em java 
 * (igual a 1234) deve ser apresentada a mensagem ‘Usuário inválido!’. Caso o Código 
 * seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta 
 * (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha esteja correta, 
 * deve ser mostrada a mensagem ‘Acesso permitido’.*/
public class Desafio25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código de acesso: ");
		int cod = sc.nextInt();
		int tent = 1;
		if (cod != 1234) {
			System.out.printf("Nº de tentativas %d, máx 5.\n",tent);
			while(cod!= 1234 && tent <5) {
				System.out.println("Tente novamente, outro código: ");
				int c = sc.nextInt();
				cod = c;	
				++tent;
				if (cod != 1234) {
					System.out.printf("Nº de tentativas %d, máx 5.\n",tent);
				}
			}
		}
		
		if(cod !=1234 && tent >5) {
				System.out.println("Código de Usuário, Bloqueado!!!");
				
		}else{
			System.out.println("Código correto");
		}
		sc.close();
	}
}
