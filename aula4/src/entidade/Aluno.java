package entidade;

public class Aluno {
	
	public String nome;
	public int idade;
	public double nota1, nota2;
	
	//AS funcionalidades de uma classe
	//s�o definidasd atrav�s de m�todo
	
	public double calularMedia() {
		double media = 0;
		media = (this.nota1 + this.nota2)/2;
		return media;
	}
	 public void verificarSituacao(double media){
			if (media >= 7.0) {
				System.out.println("Aluno "+nome+" aprovado!!!");
			}else if(media > 6.0 && media < 7.0) {
				System.out.println("Aluno "+nome+" em recupera��o!!");
			}else {
				System.out.println("Aluno "+nome+" reprovado!");
			}
	 }
	
}
