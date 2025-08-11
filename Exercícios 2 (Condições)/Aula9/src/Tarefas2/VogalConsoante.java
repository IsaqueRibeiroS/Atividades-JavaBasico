package Tarefas2;

import java.util.Scanner;

public class VogalConsoante {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite uma letra qualquer: ");
		String letra = leitor.next();
		
		leitor.close();
		/*
		// Saída de Dados
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra " + letra + " é uma vogal.");
		}
		else {
			System.out.println("A letra " + letra + " é uma consoante.");
		} */
		
		// Também é possível utilizar a função switch para resolução do problema.
		
		if (letra.length() > 1) {
			System.out.println("A letra digitada não é válida");
		}
		else {
		switch (letra) {
		case "a": 
		case "e": 
		case "i": 
		case "o": 
		case "u":
		case "A": 
		case "E": 
		case "I": 
		case "O":
		case "U": System.out.println("A letra " + letra + " é uma vogal."); break;
		default: System.out.println("A letra " + letra + " é uma consoante.");
			}
		}
	}
}
