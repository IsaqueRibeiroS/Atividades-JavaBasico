package Tarefas2;

import java.util.Scanner;

public class AnoBissexto {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Declaração de Variáveis
		
		int ano = 0;
		
		// Entrada de Dados
		
		System.out.println("[ Bissexto ]");
		System.out.println();
		
		System.out.println("Digite o ano escolhido: ");
		ano = leitor.nextInt();
		
		leitor.close();
		
		// Saída de Dados 
	
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
			System.out.println("O ano digitado é  bissexto.");
		}
		else {
			System.out.println("O ano digitado não é considerado um ano bissexto.");
		}
	}
}
