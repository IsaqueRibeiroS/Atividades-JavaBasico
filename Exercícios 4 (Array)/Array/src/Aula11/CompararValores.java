package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompararValores {
	public static void main (String[] args) throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorA = new String[5];
		String[] vetorB = new String[5];
		int[] compararVetores = new int[5];
		
	
		// Entrada de Dados
		
		for (int i = 0; i < vetorA.length; i ++) {
			
			System.out.print("Índice -A- [" + i + "] ");
			vetorA[i] = leitor.readLine();
			
			System.out.print("Índice -B- [" + i + "] ");
			vetorB[i] = leitor.readLine();
			
		// Processamento
			
			if (Integer.parseInt(vetorA[i]) > 
			Integer.parseInt(vetorB[i]) ) {
				
				compararVetores[i] = 1;
			}
			
			if (Integer.parseInt(vetorA[i]) < 
			Integer.parseInt(vetorB[i]) ) {
				
				compararVetores[i] = -1;
			}
			
			if (Integer.parseInt(vetorA[i]) ==
					Integer.parseInt(vetorB[i]) ) {
				
				compararVetores[i] = 0;
			}
		}
		
		// Saída de Dados
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Índice -Validador- [" + i + "] "
					+ compararVetores[i]);
		}
	}
}
