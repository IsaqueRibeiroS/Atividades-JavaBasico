package Operadores;

import java.util.Scanner;

public class Soma {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite um valor: ");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite mais um valor: ");
		int valor2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		int total = valor1 + valor2;
		
		// Saída de Dados
		
		System.out.println("A soma de " + valor1 + " e " + valor2 + " resulta em " + total + ".");
	}
}
