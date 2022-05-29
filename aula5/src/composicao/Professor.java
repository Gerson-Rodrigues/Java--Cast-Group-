package composicao;

public class Professor {

	private String nome; 
	private String nivelAcademico;
	
	
	//Implícito
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	// "Personalizado"
	public Professor(String nome, String nivelAcademico) {
		super();
		this.nome = nome;
		this.nivelAcademico = nivelAcademico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNivelAcademico() {
		return nivelAcademico;
	}

	public void setNivelAcademico(String nivelAcademico) {
		this.nivelAcademico = nivelAcademico;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", nivelAcademico=" + nivelAcademico + "]";
	}

	
	
	
}
