package Operadores;

import java.util.Scanner;

public class SalarioTributo {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite o valor ganho por hora: ");
		double salario = leitor.nextDouble();
		
		System.out.println("Digites as quantidade de horas por mês: ");
		double horas = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		double salBruto = salario * horas;
		double inss = salBruto * 0.08;
		double sindicato = salBruto * 0.05;
		double impostoRenda = salBruto * 0.11;
		double salLiquido = salBruto - (impostoRenda + inss + sindicato);
		
		// Saída de Dados 
		
		System.out.println("Salário [valor bruto]: " + salBruto);
		System.out.println("O valor descontado do imposto de renda (11%): " + impostoRenda);
		System.out.println("O valor descontado do sindicato (5%): " + sindicato);
		System.out.println("O valor descontado do INSS (8%): " + inss);
		System.out.println("Salário [valor líquido]: " + salLiquido);
		
	}
}
