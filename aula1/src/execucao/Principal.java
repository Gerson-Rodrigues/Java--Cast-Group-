//Pacote em que a classe est? contida
package execucao;

import entity.Aluno;

/*sempre que uma classe utilizar uma classe de outro pacote, 
 * esta deve ser importada*/

//import  entidade.Aluno; //reconhece as outras classes 

public class Principal {
	
	//Uma classe de execuca??o requer um m?todo de 
	public static void main(String[] args) {
		// criar objeto  de classe aluno
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		
		//atribuinda valores a estes objetos
		a1.nome = "Jessica";
		a1.idade = 25;
		a1.nota1 = 7.5;
		a1.nota2 = 10.0;
		
		a2.nome = "Guilherme";
		a2.idade = 23;
		a2.nota1 = 6.5;
		a2.nota2 = 8.0;
		
		//imprimi os primeiros dados
		System.out.println("Nome: "+ a1.nome);
		System.out.println("Idade "+ a1.idade);
		System.out.println("nota1: "+a1.nota1);
		System.out.println("nota2: "+a1.nota2);
		System.out.println("");
		System.out.println("Nome: "+ a2.nome);
		System.out.println("Idade "+ a2.idade);
		System.out.println("nota1: "+a2.nota1);
		System.out.println("nota2: "+a2.nota2);
		
		
	}

}
