package Operadores;

import java.util.Scanner;

public class TemperaturaFC {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// Entrada de Dados

		System.out.println("Digite a temperatura que está medida em Farenheit: ");
		double farenheit = leitor.nextDouble();

		leitor.close();

		// Processamento

		double celsius = 5 * (farenheit - 32) / 9;

		// Saída de Dados

		System.out.println("Convertendo " + farenheit + "°F seria equivalente a " + celsius + "°C.");
	}
}
