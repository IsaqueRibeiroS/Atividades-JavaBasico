package Tarefas2;

import java.util.Scanner;

public class AjusteSalarial {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Declaração de Variáveis (valores iniciais nulos)
		
		double salarioFinal;
		double valorExtra;
		
		// Entrada de Dados
		
		System.out.println("[ - Organização Tabajara - ]");
		System.out.println("Digite o salário atual: ");
		double salarioInicial = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento / Saída de Dados
		
		if (salarioInicial <= 280) {
			valorExtra = salarioInicial * 0.20;
			salarioFinal = salarioInicial + valorExtra;
			System.out.println("O valor inicial de " + salarioInicial + " reais, foi alterado para um reajuste de 20%");
			System.out.println("Atribuindo o acréscimo de " + valorExtra+ " reais, resultando no valor final de " + salarioFinal + " reais.");
		}
		if (salarioInicial <= 700 && salarioInicial > 280) {
			valorExtra = salarioInicial * 0.15;
			salarioFinal = salarioInicial + valorExtra;
			System.out.println("O valor inicial de " + salarioInicial + " reais, foi alterado para um reajuste de 15%");
			System.out.println("Atribuindo o acréscimo de " + valorExtra + " reais, resultando no valor final de " + salarioFinal + " reais.");
		}
		if (salarioInicial <= 1500 && salarioInicial > 700) {
			valorExtra = salarioInicial * 0.10;
			salarioFinal = salarioInicial + valorExtra;
			System.out.println("O valor inicial de " + salarioInicial + " reais, foi alterado para um reajuste de 10%");
			System.out.println("Atribuindo o acréscimo de " + valorExtra + " reais, resultando no valor final de " + salarioFinal + " reais.");
		}
		if (salarioInicial > 1500) {
			valorExtra = salarioInicial * 0.05;
			salarioFinal = salarioInicial + valorExtra;
			System.out.println("O valor inicial de " + salarioInicial + " reais, foi alterado para um reajuste de 5%");
			System.out.println("Atribuindo o acréscimo de " + valorExtra + " reais, resultando no valor final de " + salarioFinal + " reais.");
		}
	}
}
