package variavel;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	
	public static void main(String[] args) {
		
		String nome = " ";
		
		nome = JOptionPane.showInputDialog("Inseri o seu nome: "+nome);
		
		String msg = "Ol? "+nome.toUpperCase()+"!!";
		JOptionPane.showMessageDialog(null , msg);
		
		
	}
}
