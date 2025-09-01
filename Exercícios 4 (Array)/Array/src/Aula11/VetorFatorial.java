package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VetorFatorial {
	public static void main (String[] args)throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorOriginal = new String[10];
		int[] vetorFatorial = new int[10];
		
		// Entrada de Dados
		
		for(int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.print("Índice[" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
		// Processamento
		
			for(int j = 0; j < Integer.parseInt(vetorOriginal[i]); j++) {
				
				if (j+1 < 2) {
					vetorFatorial[i] = j+1;
				}
				else {
					vetorFatorial[i] *= j+1;
				}
			}
		}
		
		// Saída de Dados
		
		for(int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.println("Índice[" + i + "] " 
			+ "Fatorial - " + vetorFatorial[i]);
			
		}
	}
}
