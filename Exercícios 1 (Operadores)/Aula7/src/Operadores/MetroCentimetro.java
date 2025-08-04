package Operadores;

import java.util.Scanner;

public class MetroCentimetro {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite a quantidade de metros: ");
		double metro = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		double centimetro = metro * 100;
		
		// Saída de Dados 
		
		System.out.println(metro + " metros é o mesmo que " + centimetro + " centímetros.");
	}

}
