package composicao;

public class Turma {

	private String freqSemanal;
	private String horario;
	private Professor professor;
	
	public Turma(String nomeProf) {
		professor = new Professor();
		professor.setNome(nomeProf);
		
	}

	public String getFreqSemanal() {
		return freqSemanal;
	}

	public void setFreqSemanal(String freqSemanal) {
		this.freqSemanal = freqSemanal;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Turma [freqSemanal=" + freqSemanal + ", horario=" + horario + ", professor=" + professor + "]";
	}
	
	/*Relação Composição *
	 * Ao declarar um atributo de Professor na Classe, e definer a instância
	 * de objeto no construtor, foi criada uma composição. A composião 
	 * se caracteriza pela obrigatoriedade da aplicação do relacionamento*/
	
	
	
	
}
