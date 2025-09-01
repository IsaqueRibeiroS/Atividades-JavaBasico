package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VetorIncomum {
	public static void main (String[] args) throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorA = new String[10];
		String[] vetorB = new String[10];
		String[] vetorIncomum = new String[10];
		int validador = 0;
		
		// Entrada de Dados
		
		for(int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Índice(A) [" + i + "] ");
			vetorA[i] = leitor.readLine();
			
			System.out.print("Índice(B) [" + i + "] ");
			vetorB[i] = leitor.readLine();
		}
		
		// Procesamento 
		
		for (int i = 0; i < vetorA.length; i++) {
			
			validador = 0;
			
			for (int j = 0; j < vetorB.length; j++) {
				
				if (Integer.parseInt(vetorA[i]) == 
						Integer.parseInt(vetorB[j])) {
					
					validador += 1;
				}
				
			}
			if (validador == 0) {		
				vetorIncomum[i] = vetorA[i];
			}
		}
		
		// Saída de Dados
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("Índice[" + i 
					+ "] incomum - " + vetorIncomum[i]);
		}
	}
}
