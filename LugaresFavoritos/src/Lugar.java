import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Lugar {
	
	private String nome;
	private List<Integer> avaliacoes = new ArrayList<Integer>();
	
		
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}


	public Lugar(String stringQualquer) {
		this.nome = stringQualquer.toUpperCase();
		
	}


	public void mostraNoMapa() throws IOException, URISyntaxException {
		String nomeUrl = this.nome.replace(" ", "%20");
		Desktop.getDesktop().browse(new URI("www.google.com/maps/search/?api=1&query="+nomeUrl));
		
	}

	public void addAvaliacao(int avaliacao) throws Exception {
		if(avaliacao < 1 || avaliacao > 5) {
			throw new Exception("Avalia??o deve ter de 1 a 5 Estrelas");
		}
		avaliacoes.add(avaliacao);
	}


	public int totalDeAvaliacoes() {
		return this.avaliacoes.size();
	}


	public Double avaliacaoMedia() {
		return somaDasAvaliacoes()/totalDeAvaliacoes();
		
	}


	private Double somaDasAvaliacoes() {

		Double soma = 0d;
		for (Integer avaliacao : avaliacoes) {
			soma += avaliacao;
		}
		return soma;
	}


	
	
	public String avaliacaoStatus() {
		Double media = avaliacaoMedia();
		if (media < 3) {
			return "Ruim";
		}else if(media >= 3 && media <= 4){
			return "Razo?vel";
		}else if (media > 4) {
			return "Muito Bom";
		}else {
		return "Status n?o Implementado!";
		}
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+"\n"+
				"Total de Avalia??es: "+totalDeAvaliacoes() +"\n"
				+"Media: "+avaliacaoMedia()+"\n"
				+"Status: "+avaliacaoStatus();
	}

}