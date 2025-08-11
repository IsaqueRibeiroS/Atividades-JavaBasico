package Tarefas2;

import java.util.Scanner;

public class NotasConceito {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Enrtrada de Dados
		
		System.out.println("Digite o valor da 1° Nota: ");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Digite o valor da 2° Nota: ");
		double nota2 = leitor.nextDouble();
		
		leitor.close();
		
		// 	Processamento
		
		double media = (nota1 + nota2) / 2;
		String conceito = "";
		if (media >=9) {
			conceito = "A";
		}
		if (media < 9 && media >= 7.5) {
			conceito = "B";
		}
		if (media >= 6 && media < 7.5) {
			conceito = "C";
		}
		if (media >= 4 && media < 6 ) {
			conceito = "D";
		}
		if (media < 4) {
			conceito = "E";
		}
		// Saída de Dados
		
		if (media >= 6) {
			System.out.println("1° Nota: " + nota1);
			System.out.println("2° Nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("APROVADO");
		}
		else {
			System.out.println("1° Nota: " + nota1);
			System.out.println("2° Nota: " + nota2);
			System.out.printf("Média: /n " + media);
			System.out.println("Conceito: " + conceito);
			System.out.println("REPROVADO");
		}
	}
}
