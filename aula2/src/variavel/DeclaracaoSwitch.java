package variavel;

public class DeclaracaoSwitch {

	public static void main(String[] args) {
		int nota = 92;
		switch (nota) {
		case 100:
			System.out.println("Excelente!!!");
			break;
		case 90:
			System.out.println("Bom trabalho!!!!");
			break;
		case 80:
			System.out.println("Continue assim!!!");
			break;
		default:
			System.out.println("Desculpe não deu....");
			break;
		}
	
	}

}
