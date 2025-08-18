package Aula10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntervaloValores {
	public static void main (String[] args) throws IOException {
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String numero1;
		String numero2;
		int maior = 0;
		int menor = 0;
		int intervalo = 0;
		int soma = 0;
		
		// Entrada de Dados
		
		System.out.println("Digite o 1° número: ");
		numero1 = leitor.readLine();
		
		System.out.println("Digite o 2° número: ");
		numero2 = leitor.readLine();
		
		// Processamento
		
		if (Integer.parseInt(numero2) < Integer.parseInt(numero1)) {
			maior = Integer.parseInt(numero1);
			menor = Integer.parseInt(numero2);
			
		}
		else {
			maior = Integer.parseInt(numero2);
			menor = Integer.parseInt(numero1);
		}
		
		// Saída de Dados
		
		System.out.println("Os valores que estão entre " 
		+ menor + " e " + maior + " são:");
		intervalo = menor;
		
		for (int i = menor + 1; i < maior; i++) {
			intervalo = i;
			soma += intervalo;
			System.out.print(intervalo + " ");
		}
		
		System.out.println("");
		
		System.out.println("A soma desse intervalo é " 
		+ soma + "."); 
	}
}
