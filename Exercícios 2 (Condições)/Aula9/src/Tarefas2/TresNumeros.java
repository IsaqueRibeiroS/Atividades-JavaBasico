package Tarefas2;

import java.util.Scanner;

public class TresNumeros {
	public static void main (String[] args0) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados / Declaração de Variáveis
		
		System.out.println("Digite o 1° número: ");
		int numero1 = leitor.nextInt();
		
		System.out.println("Digite o 2° número: ");
		int numero2 = leitor.nextInt();
		
		System.out.println("Digite o 3° número: ");
		int numero3 = leitor.nextInt();
		
		int maior =numero1;
		int menor = numero1;
		
		leitor.close();
		
		// Processamento
		
		if (maior < numero2) {
			maior = numero2;
		}
		if (maior < numero3) {
			maior = numero3;
		}
		if (menor > numero2) {
			menor = numero2;
		}
		if (menor > numero3) {
			menor = numero3;
		}
		
		// Saída de Dados
		
		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("Os valores digitados são iguais.");
		}
		else {
			System.out.println("O valor maior digitado foi " + maior + ".");
			System.out.println("O valor menor digitado foi " + menor + ".");
		}
		
	}
}
