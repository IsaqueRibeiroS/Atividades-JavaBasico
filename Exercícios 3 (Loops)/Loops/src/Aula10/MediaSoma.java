package Aula10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MediaSoma {
	public static void main (String[] args) throws IOException {
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String numero;
		double soma = 0;
		double media = 0;
		
		// Entrada de Dados
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite um valor: ");
			numero = leitor.readLine();
			soma += Integer.parseInt(numero);
		}
		
		// Processamento
		
		media = (soma / 5);
		
		// Saída de Dados
		
		System.out.println("A soma dos valores ficou " 
		+ soma + " enquanto a média ficou como " + media);
	}
}
