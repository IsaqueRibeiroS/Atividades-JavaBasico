package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerificadorParImpar {
	public static void main (String[] args)throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorOriginal = new String[10];
		int[] validadorParImpar = new int[10];
		
		// Entrada de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.println("Índice[" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
		// Processamento
			
			if (Integer.parseInt(vetorOriginal[i]) % 2 == 0) {
				
				validadorParImpar[i] = 1;
			}
			else {
				validadorParImpar[i] = 0;
			}
		}
		
		// Saída de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.println("Índice[" + i + "] " 
					+ validadorParImpar[i]);
		}
	}
}
