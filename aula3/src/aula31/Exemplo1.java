package aula31;

public class Exemplo1 {

	
	public static void main(String[] args) {
		
		int indice = 10;
		String[] lista = new String[indice];
		
		lista[0] = "Lógica";
		lista[1] = "html";
		lista[2] = "Banco de Dados";
		lista[3] = "Php";
		lista[4] = "Java";
		lista[5] = "JavaWeb";
		
		
		String [] nomes= {"Wallace","Edem","Daniel","Robson","Thiago","Gerson",
				"Gabriel","Armstrong", "Jaqueline"};
		
		for(String x : nomes) {
			System.out.println(x);
		}
		
		
		
		/*for(int i =0; i<lista.length; i++) {
			System.out.println("Posição "+i+" - "+lista[i]);
		}*/
		
	}
}
