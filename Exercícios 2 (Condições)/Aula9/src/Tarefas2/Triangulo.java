package Tarefas2;

import java.util.Scanner;

public class Triangulo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Declaração de Variáveis
		
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		
		// Entrada de Dados
		
		System.out.println("[ TRIÂNGULO ]");
		System.out.println();
		
		System.out.println("Digite o valor do 1° Lado: ");
		lado1 =  leitor.nextInt();
		
		System.out.println("Digite o valor do 2° Lado: ");
		lado2 =  leitor.nextInt();
		
		System.out.println("Digite o valor do 3° Lado: ");
		lado3 =  leitor.nextInt();
		
		leitor.close();
		
		// Saída de Dados
		
		if ((lado1 + lado2 >= lado3) && (lado1 + lado3 >= lado2) && (lado2 + lado3 >= lado1)) {
			System.out.println("O conjunto de lados formam um triângulo. ");
			
			if ((lado1 != lado2) && (lado2 != lado3) && (lado3 != lado1)) {
				System.out.println("Classificado como Escaleno. ");
			}
			else if ((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("Classificado como Equilátero. ");
			} 
			else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3) ) {
				System.out.println("Classificado como Isósceles. ");
			}
		}
		else {
			System.out.println("O conjunto de lados não tornam possível a formação de um triângulo.");
		}
	}
}
