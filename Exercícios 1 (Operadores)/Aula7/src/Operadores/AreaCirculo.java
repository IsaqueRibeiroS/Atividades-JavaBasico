package Operadores;

import java.util.Scanner;

public class AreaCirculo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
	
		// Entrada de Dados
	
		System.out.println("Valor do raio do círculo: ");
		double raio = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		double area = Math.PI * Math.pow(raio, 2);
		
		// Saída de Dados
		
		System.out.println("A área do círculo é: " + area);
	}

}
