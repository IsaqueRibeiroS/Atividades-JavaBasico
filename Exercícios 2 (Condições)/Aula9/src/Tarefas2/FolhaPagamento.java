package Tarefas2;

import java.util.Scanner;

public class FolhaPagamento {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
			
		// Entrada de Dados
		
		System.out.println("Digite o valor ganho por hora trabalhada: ");
		double valorHora = leitor.nextDouble();
		
		System.out.println("Digite o total de horas trabalhadas no mês: ");
		int horasTrabalhadas = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		
		double salarioBruto = valorHora * horasTrabalhadas;
		double inss = salarioBruto * 0.10;
		double fgts = salarioBruto * 0.11;
		double ir = 0;
		double salarioLiquido = 0;
		String irPorcentagem = "(0%)";
		
		if (salarioBruto <= 900) {
			salarioLiquido = salarioBruto - inss;
		}
		if (salarioBruto <= 1500 && salarioBruto > 900) {
			ir = salarioBruto * 0.05;
			salarioLiquido = (salarioBruto - inss) - ir;
			irPorcentagem = "(5%)";
		}
		if (salarioBruto <= 2500 && salarioBruto > 1500) {
			ir = salarioBruto * 0.10;
			salarioLiquido = (salarioBruto - inss) - ir;
			irPorcentagem = "(10%)";
		}
		if (salarioBruto > 2500) {
			ir = salarioBruto * 0.20;
			salarioLiquido = (salarioBruto - inss) - ir;
			irPorcentagem = "(20%)";
		}
		double totalDescontado = inss + ir; 
		
		// Saída de Dados 
		
		System.out.println("Sálario Bruto " + "(" + valorHora + " * " + horasTrabalhadas + ") : "+ salarioBruto);
		System.out.println("FGTS (11%): " + fgts);
		System.out.println("(-) IR " + irPorcentagem + ": " + ir);
		System.out.println("(-) INSS (10%) : " + inss);
		System.out.println("Total descontado: " + totalDescontado);
		System.out.println("Sálario Líquido: " + salarioLiquido);
	}
}
