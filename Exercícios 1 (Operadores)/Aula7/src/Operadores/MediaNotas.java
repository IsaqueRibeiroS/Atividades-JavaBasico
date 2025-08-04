package Operadores;

import java.util.Scanner;

public class MediaNotas {
		public static void main (String[] args) {
			Scanner leitor = new Scanner (System.in);
			
			// Entrada de Dados
			
			System.out.println("Valor da 1° nota: ");
			double nota1 = leitor.nextDouble();
			
			System.out.println("Valor da 2° nota: ");
			double nota2 = leitor.nextDouble();
			
			System.out.println("Valor da 3° nota: ");
			double nota3 = leitor.nextDouble();
			
			System.out.println("Valor da 4° nota: ");
			double nota4 = leitor.nextDouble();
			
			leitor.close();
			
			// Processamento 
			
			double media = (nota1 + nota2 +  nota3 + nota4) / 4;
			
			// Saída de Dados 
			
			System.out.println("A média da nota é " + media);
		}
}
