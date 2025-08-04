package Operadores;

import java.util.Scanner;

public class PesoIdeal {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados 
		
		System.out.println("Digite o a sua altura:");
		double altura = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		double ideal = (72.7 * altura) - 58;
		
		// Saída de Dados 
		
		System.out.println("O peso ideal para você é " + ideal + " Kg.");
	}
}
