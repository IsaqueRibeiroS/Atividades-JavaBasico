package Tarefas2;

import java.util.Scanner;

public class MediaAluno {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados 
		
		System.out.println("Nota da 1° prova: ");
		double nota1 = leitor.nextInt();
		
		System.out.println("Nota da 2° prova: ");
		double nota2 = leitor.nextInt();
		
		System.out.println("Nota da 3° prova: ");
		double nota3 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		double media = (nota1 + nota3 + nota2) / 3;
		
		// Saída de Dados 
		
		if ( media == 10){
			System.out.println("O aluno está aprovado com distinção!");
		}
			else if (media < 7) {
				System.out.println("O aluno está reprovado!");
		}
		else {
			System.out.println("O aluno foi aprovado!");
		}	
	}
}
