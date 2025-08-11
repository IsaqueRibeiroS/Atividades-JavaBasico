package Tarefas2;

import java.util.Scanner;

public class Turnos {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite a letra correspondente ao seu turno [M / V / N]: m");
		String validarTurno = leitor.next();
		
		leitor.close();
		
		// Saída de Dados 
		
		if (validarTurno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		}
		if (validarTurno.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		}
		if (validarTurno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}
		if (validarTurno.length() > 1) {
			System.out.println("Valor digitado inválido.");	
		}
	}
}
