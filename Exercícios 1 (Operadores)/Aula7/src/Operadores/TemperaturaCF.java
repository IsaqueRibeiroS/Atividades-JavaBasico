package Operadores;

import java.util.Scanner;

public class TemperaturaCF {
	 public static void main (String[] args) {
		 Scanner leitor = new Scanner (System.in);
		 
		 // Entrada de Dados 
		 
		 System.out.println("Digite a temperatura em Celsius: ");
		 double celsius = leitor.nextDouble();
		 
		 leitor.close();
		 
		 // Processamento
		 
		 double farenheit = (celsius * 1.8) + 32;
		 
		 // Saída de Dados 
		 
		 System.out.println("A temperatura " + celsius + "°C é o mesmo que " + farenheit + "°F.");
	 }
}
