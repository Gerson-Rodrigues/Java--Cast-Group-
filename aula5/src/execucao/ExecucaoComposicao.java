package execucao;

import composicao.Professor;
import composicao.Turma;

public class ExecucaoComposicao {
	
	public static void main(String[] args) {
		
		Professor p1 = new Professor("Juan", "Mestrado");
		
		Professor p2 = new Professor();
		
		p2.setNome("Simone");
		p2.setNivelAcademico("Pós-Graduada");
		
		System.out.println(p1);
		System.out.println("teste: "+p2.getNome()+p2.getNivelAcademico());
		
		Turma t = new Turma("Juan");
		
		t.setFreqSemanal("Seg. à Sex.");
		t.setHorario("09hs às 15hs");
		t.getProfessor().setNivelAcademico("Mestrado");
		
		System.out.println(t);
		
		
		System.out.println("Turma:"+t.getFreqSemanal()+" - "+
				t.getHorario());
		System.out.println("Professor:"+t.getProfessor().getNome()+"-"+
						t.getProfessor().getNivelAcademico());
		
		
	}
}
