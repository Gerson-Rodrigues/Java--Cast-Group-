package sobrecarga;

public class Calculos {

	public Integer somar (int num1, int num2) {
		
		Integer soma = 0;
		soma = num1 + num2;
		return soma;
		
	}
	
	public Integer somar (int num1, int num2, int num3) {
		
		Integer soma = 0;
		soma = num1 + num2 + num3;
		return soma;
		
	}
	
	public Double somar(Double num1, Double num2) {
		
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Calculos c = new Calculos();
		
		System.out.println("Soma: "+c.somar(1, 20));
		System.out.println("Soma: "+c.somar(1, 20, 7));
		
	}
	
}
