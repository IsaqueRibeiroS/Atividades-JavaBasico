package Operadores;

import java.util.Scanner;

public class SalarioHora {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
	 
	 // Entrada de Dados
	 
		System.out.println("Digite o valor ganho por hora: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de horas de trabalhos mensais: ");
		int hora = leitor.nextInt();
		
		leitor.close();
		
	// Processamento 
		
		double total = salario * hora;
	
	// Saída de Dados
		
		System.out.println("Você recebe " + total + " no mês.");
 }
}
