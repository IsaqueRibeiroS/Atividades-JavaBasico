package Tarefas2;

import java.util.Scanner;

public class MaiorMenor {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite o 1° valor: ");
		double num1 = leitor.nextDouble();
		
		System.out.println("Digite o 2° valor: ");
		double num2 = leitor.nextDouble();
		
		double maior = num1;
		
		leitor.close();
		
		// Saída de Dados
		
		if (maior > num2) {
			System.out.println("O valor maior é "+ maior + ".");
		}
		if (maior < num2) {
			maior = num2;
			System.out.println("O valor maior é "+ maior + ".");
		}
		
		if (num1 == num2) {
			System.out.println("Os valores são iguais.");
		}
	}
}
