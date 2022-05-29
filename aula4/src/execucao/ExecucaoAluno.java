package execucao;

import entidade.Aluno;
public class ExecucaoAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a.nome = "Ana";
		a.nota1 = 8;
		a.nota2 = 5;
		
		System.out.println("Média : "+a.calularMedia());
		a.verificarSituacao(a.calularMedia());
	}

}
