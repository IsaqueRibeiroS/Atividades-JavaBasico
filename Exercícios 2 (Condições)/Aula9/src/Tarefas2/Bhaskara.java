package Tarefas2;

import java.util.Scanner;

public class Bhaskara {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Declaração de Variáveis
		
		double a = 0;
		double b = 0;
		double c = 0;
		double delta = 0;
		double xPositivo = 0;
		double xNegativo = 0;
		
		// Entrada de Dados
		
		System.out.println("[ Bhaskara - ax² + bx + c ] ");
		System.out.println();
		
		System.out.println("Digite o valor de A:");
		a = leitor.nextDouble();
		
		if (a != 0) {
			System.out.println("Digite o valor de B:");
			b = leitor.nextDouble();
			System.out.println("Digite o valor de C:");
			c = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento / Saída de Dados
		
			delta = (Math.pow(b,2)) - 4 * (a * c);
		
			if (delta == 0) {
				xPositivo = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Delta = " + delta);
				System.out.println("A equação só possui uma raiz real. Que é o valor de x = " + xPositivo + ".");
			}
			if (delta > 0) {
				xPositivo = (-b + Math.sqrt(delta)) / (2 * a);
				xNegativo = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Delta = " + delta);
				System.out.println("A equação possui duas raízes reais. Que é o valor de x' = " + xPositivo + " , e o valor x\" = " + xNegativo );
			}
			
		}
		
		// Em caso de não ser possível execução
		
		else {
			System.out.println("Essa equação não pode ser classificada de 2° grau.");
		}
		if (delta < 0) {
			System.out.println("Essa equação não possui raízes reais.");
		}
		
		leitor.close();
		
	}
}
