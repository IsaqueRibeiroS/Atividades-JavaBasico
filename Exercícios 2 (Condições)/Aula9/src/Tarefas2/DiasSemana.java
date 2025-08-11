package Tarefas2;

import java.util.Scanner;

public class DiasSemana {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite o número correspondente ao dia da semana: ");
		int dia = leitor.nextInt();
		
		leitor.close();
		
		// Saída de Dados 
		
		switch (dia) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terça-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Valor inválido!"); 
		}
	}
}
