package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OrdemCrescente {
	public static void main (String[] args) throws IOException {
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorOriginal = new String[10];
		int[] vetorOrdenado = new int[10];
		
		// Entrada de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			
			System.out.print("Índice[" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
			vetorOrdenado[i] = Integer.parseInt(vetorOriginal[i]);
		}
		
		// Conversão para Ordem Crescente
		
		Arrays.sort(vetorOrdenado);
		
		// Saída de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			System.out.println("(Vetor Ordenado) Índice[" + i + "] " 
			+ vetorOrdenado[i]);
		}
	}
}
