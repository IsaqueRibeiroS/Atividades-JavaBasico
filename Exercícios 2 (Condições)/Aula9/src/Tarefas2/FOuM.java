package Tarefas2;

import java.util.Scanner;

public class FOuM {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Informe seu genêro: [F/M] ");
		String input = leitor.next();
	
		leitor.close();
		
		// Saída de Dados 
		
		if (input.equalsIgnoreCase("f")) {
			System.out.println("Você é do sexo feminino. ");
		}
			else if (input.equalsIgnoreCase("m")) {
				System.out.println("Você é do sexo masculino. ");
			}
			else {
				System.out.println("Sexo inválido. ");
			}
	}
}
