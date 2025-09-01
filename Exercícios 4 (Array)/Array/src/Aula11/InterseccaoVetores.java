package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterseccaoVetores {

	public static void main(String[] args) throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorA = new String[10];
		String[] vetorB = new String[10];
		String[] interseccaoEntreVetores = new String[10];
		
		// Entrada de Dados
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.print("Índice-A-[" + i + "]  ");
			vetorA[i] = leitor.readLine();
			
			System.out.print("Índice-B-[" + i + "]  ");
			vetorB[i] = leitor.readLine();
		}
		
		// Processamento
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				
				if (Integer.parseInt(vetorA[i]) == 
						Integer.parseInt(vetorB[j])) {
					
					interseccaoEntreVetores[i] = vetorA[i];
				}
				
			}
		}
		
		// Saída de Dados
		
		for (int i = 0; i < interseccaoEntreVetores.length; i++) {
			
			System.out.println("Íntersecção A-B [" + i + "] " 
			+ interseccaoEntreVetores[i]);
		}
	}

}
