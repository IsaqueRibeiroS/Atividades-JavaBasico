package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrdemDecrescente {
	
	public static void main (String[] args) throws IOException{
		
		// Declaração  de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		String[] vetorOriginal = new String[10];
		int[] vetorCrescente = new int[10];
		int[] vetorDecrescente = new int[10]; 
		int contador = 0;
		
		// Entrada de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.print("Índice[" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
		// Processamento
			
			vetorCrescente[i] = Integer.parseInt(vetorOriginal[i]);
		}
		
		Arrays.sort(vetorCrescente);
		
		for (int i = vetorDecrescente.length - 1; i >= 0; i--) {
			
			vetorDecrescente[contador] = vetorCrescente[i];
			contador += 1;
			}
		
		// Saída de Dados
		
		for (int i = 0; i < vetorDecrescente.length; i++) {
			System.out.println("(Ordem decrescente) Índice[" 
		+ i + "] " + vetorDecrescente[i]);
		}
		
	}
}
