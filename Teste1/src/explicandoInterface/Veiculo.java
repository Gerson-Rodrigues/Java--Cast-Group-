package explicandoInterface;

public abstract class Veiculo {

	/*Public
	 * visivel por qualquer classe. aberto no sentido
	 * de qualquer classe pode usar este m�todo.
	 * 
	 * Private
	 * o m�todo � visivel apenas pela pr�pria classe 
	 * e � o qualificador mais restritivo
	 * 
	 * Protected
	 * o m�todo � visivel pela pr�pria classe e por
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
