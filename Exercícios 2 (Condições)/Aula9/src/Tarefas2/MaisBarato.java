package Tarefas2;

import java.util.Scanner;

public class MaisBarato {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite o valor do 1° produto: ");
		double produto1 = leitor.nextDouble();
		
		System.out.println("Digite o valor do 2° produto: ");
		double produto2 = leitor.nextDouble();
		
		System.out.println("Digite o valor do 3° produto: ");
		double produto3 = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		if  (produto2 < produto1 && produto2 < produto3) {
			System.out.println("O 2° produto apresenta o menor valor, sendo de " + produto2 + " reais.");
		}
		
		else if (produto3 < produto2 && produto3 < produto1) {
			System.out.println("O 3° produto apresenta o menor valor, sendo de " + produto3 + " reais.");
			}
		
		else {
			System.out.println("O 1° produto apresenta o menor valor, sendo de " + produto1 + " reais.");
		}
		
	}
}
