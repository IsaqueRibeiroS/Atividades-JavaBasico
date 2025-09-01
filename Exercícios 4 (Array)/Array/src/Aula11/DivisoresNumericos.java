package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisoresNumericos {
	public static void main (String[] args) throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorOriginal = new String[10];
		String[] divisoresDoVetor = new String[10];
		
		// Entrada de Dados
		
		for(int i = 0; i < vetorOriginal.length; i++ ) {
			
			System.out.print("Índice [" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
			divisoresDoVetor[i] = "[";
		}
		
		// Processamento 
		
		for (int i = 0; i < vetorOriginal.length; i++ ) {
			
			for (int j = 0; j < Integer.parseInt(vetorOriginal[i]); j++) {
				
				if (Integer.parseInt(vetorOriginal[i]) % (j+1) == 0) {
					divisoresDoVetor[i] += j+1 + ";";	
				}
			}
			divisoresDoVetor[i] += "]";
		}
		
		// Saída de Dados
		
		for(int i = 0; i < vetorOriginal.length; i++ ) {
			
			System.out.println("Índice [" + i + "] --> "
					+ vetorOriginal[i] );
			System.out.println("Divisores: " + divisoresDoVetor[i] );
		}
 	}
}
