import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {

		String nomeDoLugar = tela("Qual o nome do Lugar?");
		Lugar lugar1 = new Lugar(nomeDoLugar);
		
		
		while(true){
			try {
			String avaliacaoString = tela("Qual a Avalia??o?");
			Integer avaliacao = Integer.parseInt(avaliacaoString);
			lugar1.addAvaliacao(avaliacao);
			}catch (NumberFormatException e) {
				break;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e);
				break;
			}
		}
			
		//tela(lugar1.toString());
		telaMensagem(lugar1);
		
		lugar1.mostraNoMapa();
		/*//objetoLugar.mostraNoMapa();
		
		objetoLugar.addAvaliacao(5);
		objetoLugar.addAvaliacao(4);
		objetoLugar.addAvaliacao(3);
		objetoLugar.addAvaliacao(5);
		objetoLugar.addAvaliacao(4);
		
		int total = objetoLugar.totalDeAvaliacoes();
		System.out.println("Total: "+total);
		
		Double media = objetoLugar.avaliacaoMedia();
		System.out.println("M?dia: "+media);
		
		String status = objetoLugar.avaliacaoStatus();
		System.out.println("Status: "+status);
		*/
		//System.out.println(lugar1);
		
	}

	private static void telaMensagem(Lugar lugar1) {
		JOptionPane.showConfirmDialog(null, lugar1);
	}

	private static String tela(String stringDisplay) {
		return JOptionPane.showInputDialog(stringDisplay);
	}
}