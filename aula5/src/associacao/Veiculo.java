package associacao;

public class Veiculo {

	private String tipo;
	private String modelo;
	private String placa;
	
	//Construtores... Padrão e o "Personalizado"
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	public Veiculo(String tipo, String modelo, String placa) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + ", \nModelo: " 
					+ modelo + ", \nPlaca: " + placa + " \n";
	}
	
	
	
	
}
