package Aula10;

public class ValorImpar {
	public static void main (String[] args){
		
		// Declaração de Variáveis
		
		int divisao = 0;
		
		// Processamento 
		
		System.out.println("Valores ímpares [1:50]");
		
		for (int i = 1; i <= 50; i++) {
			
			divisao = (i % 2);
			
		// Saída de Dados
			
			if (divisao > 0) {
			System.out.println(i);
			}
		}
	}
}