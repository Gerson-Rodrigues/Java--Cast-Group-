package explicandoInterface;

public abstract class Veiculo {

	/*Public
	 * visivel por qualquer classe. aberto no sentido
	 * de qualquer classe pode usar este método.
	 * 
	 * Private
	 * o método é visivel apenas pela própria classe 
	 * e é o qualificador mais restritivo
	 * 
	 * Protected
	 * o método é visivel pela própria classe e por
	 * suas subclasses e pelas classes do mesmo pacote.*/
	
	public int velocidade=10;
	public boolean status;
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
	}
	
	public void mostraStatus() {
		System.out.println(status);
	}
	
	public abstract void acelerar();
	
}
