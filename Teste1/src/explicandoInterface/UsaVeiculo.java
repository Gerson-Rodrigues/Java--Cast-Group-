package explicandoInterface;

public class UsaVeiculo {
	public static void main(String[] args) {
	
	//esta linha gera erro
	//Veiculo veiculo = new Veiculo();
	
	Automovel automovel = new Automovel();
	automovel.ligar();
	automovel.acelerar();
	System.out.println(automovel.velocidade);
	automovel.acelerar();
	System.out.println(automovel.velocidade);
	automovel.acelerar();
	System.out.println(automovel.velocidade);
	
	System.out.println("===================================");
	Aviao aviao = new Aviao();
	aviao.ligar();
	aviao.acelerar();
	System.out.println(aviao.velocidade);
	aviao.acelerar();
	System.out.println(aviao.velocidade);
	aviao.desligar();
	
	}
}
