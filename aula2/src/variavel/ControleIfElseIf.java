package variavel;

public class ControleIfElseIf {

	
	public static void main(String[] args) {
		//entrada
		int nota =92;
		//processamento + saída
		if (nota >= 90) {
			System.out.println("Excelente!!!");
		}else if(nota <90 && nota >=80){
			System.out.println("Bom Trabalho");
		}else if (nota <80 && nota >= 60){
			System.out.println("Tranquilo!!!");
		}else {
			System.out.println("Desculpe, não deu...");
		}
	}
}
