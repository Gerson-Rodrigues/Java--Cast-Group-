package associacao;

public class Condutor {

	private String nome;
	private String cnh;
	private Veiculo veiculo;
	
	/*Rela��o de associa��o Direta
	 * 
	 * Ao declarar um atributo de veiculo na Classe condutor foi criada a 
	 * possibilidade de realizar uma associa��o. A associa��o se caracterriza
	 * pela N A O obrigatoriedade da aplica��o do relacionamento*/
	
	//Construtor Impl�cito

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
				", \nVe�culo " + veiculo + "";
	}
	
	
	
}
