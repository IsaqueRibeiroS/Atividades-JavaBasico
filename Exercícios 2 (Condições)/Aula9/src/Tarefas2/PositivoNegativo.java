package Tarefas2;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados 
		
		System.out.println("Digite um número qualquer: ");
		double numero = leitor.nextDouble();
		
		String valor = "positivo";
		leitor.close();
		
		// Saída de Dados
		
		if (numero < 0) {
			valor = "negativo";
		}	
		if (numero == 0) {
			valor = "nulo";
		}
		System.out.println("O valor digitado é " + valor + ".");
	}
}
