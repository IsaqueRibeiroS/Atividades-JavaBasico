package Aula10;

import java.util.Scanner;

public class ValorValido {
	public static void main (String[] args){
		
		// Declaração de Variáveis
		
		double valor = 0;
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite sua nota: ");
		valor = leitor.nextDouble();
		
		while (valor > 10 || valor < 0) {
			
			System.out.println("Valor inválido, digite novamente: ");
			valor = leitor.nextDouble();	
		}
		
		System.out.println("Você digitou " + valor + ".");
		leitor.close();
	}
}
