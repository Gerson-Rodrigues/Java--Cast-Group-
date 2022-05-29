package associacao;

public class Condutor {

	private String nome;
	private String cnh;
	private Veiculo veiculo;
	
	/*Relação de associação Direta
	 * 
	 * Ao declarar um atributo de veiculo na Classe condutor foi criada a 
	 * possibilidade de realizar uma associação. A associação se caracterriza
	 * pela N A O obrigatoriedade da aplicação do relacionamento*/
	
	//Construtor Implícito

	public Condutor() {
		// TODO Auto-generated constructor stub
	}
	
	public Condutor(String nome, String cnh) {
		super();
		this.nome = nome;
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	//direito do mouse Source ... generate toString()
	@Override
	public String toString() {
		return "Condutor: " + nome + ", \nCNH: " + cnh + 
				", \nVeículo " + veiculo + "";
	}
	
	
	
}
