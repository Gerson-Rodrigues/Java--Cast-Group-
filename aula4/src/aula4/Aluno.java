package aula4;

public class Aluno {
	
	String nome;
	int idade;
	double nota1, nota2, media;
	
	void media() {
		media = (nota1 + nota2)/2;
	}
	
	void verificador(){
		if (media > 7.0) {
			System.out.println("Aluno aprovado!!!");
		}else if(media > 6.0 && media < 7.0) {
			System.out.println("Aluno em recuperação!!");
		}else {
			System.out.println("Aluno reprovado!");
		}
	}
}
