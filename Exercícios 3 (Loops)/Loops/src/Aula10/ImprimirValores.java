package Aula10;

public class ImprimirValores {
	public static void main (String[] args) {
		
		// Declaração de variáveis
		
		int valor = 0;
		
		// Saída de Dados
		
		while(valor <= 19) {
			
			valor += 1;
			System.out.println(valor);
		}
		
		System.out.println("");
		valor = 0;
		
		while(valor <= 19) {
			
			valor += 1;
			System.out.print(" " + valor);
		}
	}
}
