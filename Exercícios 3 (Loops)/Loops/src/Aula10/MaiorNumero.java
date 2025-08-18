package Aula10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaiorNumero {
	public static void main (String[] args) throws IOException {
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String numero;
		int maior = 0;
		
		// Entrada de Dados
		
		for (int i = 0; i < 5 ; i++) {
			System.out.print("Digite um número: ");
			numero = leitor.readLine();
			
		// Processamento
			
			if (Integer.parseInt(numero) > maior) {
				maior = Integer.parseInt(numero);
			}
		}
		
		// Saída de Dados
		
		System.out.println("O maior valor digitado foi " 
		+ maior + ".");
	}
}
