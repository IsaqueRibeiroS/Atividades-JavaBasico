package Tarefas2;

import java.util.Scanner;

public class Decrescente {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite o 1° Valor: ");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite o 2° Valor: ");
		int valor2 = leitor.nextInt();
		
		System.out.println("Digite o 3° Valor: ");
		int valor3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		int menor = valor1;
		int maior = valor1;
		int meio = valor1;
		
		if (menor > valor2) {
			menor = valor2;
		}
		if (menor > valor3) {
			menor = valor3;
		}
		
		if (maior < valor2) {
			maior = valor2;
		}
		if (maior < valor3) {
			maior = valor3;
		}
		
		if (meio == maior || meio == menor ) {
			meio = valor2;
			if (meio == maior || meio == menor ) {
				meio = valor3;
			}
		}
		
		// Saída de Dados
		
		System.out.println("Os valores em ordem decrescente representados: [ " + maior + " , " + meio + " , "  + menor + " ]");
	}
}
