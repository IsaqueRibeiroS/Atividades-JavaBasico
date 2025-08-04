package Operadores;

import java.util.Scanner;

public class PesoIdeal2 {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite sua altura: ");
		double altura = leitor.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento 
		
		double masculino = (72.7 * altura) - 58;
		double feminino = (62.1 * altura) - 44.7;
		
		
		// Saída de Dados 
		
		System.out.println("O peso ideal masculino é " + masculino + " Kg.");
		System.out.println("O peso ideal feminino é " + feminino + " Kg.");
		System.out.println("Seu peso é o ideal feminino? " + (feminino == peso));
		System.out.println("Seu peso é o  ideal masculino? " + (masculino == peso));
		System.out.println("Seu peso está abaixo do feminino?  " + (feminino > peso));
		System.out.println("Seu peso está abaixo do masculino?  " + (masculino > peso));
		System.out.println("Seu peso está acima do feminino?  " + (feminino < peso));
		System.out.println("Seu peso está acima do masculino?  " + (masculino < peso));
	}
}
