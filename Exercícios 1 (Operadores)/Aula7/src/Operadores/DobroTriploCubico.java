package Operadores;

import java.util.Scanner;

public class DobroTriploCubico {
	public static void main (String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		// Entrada de Dados
		
		System.out.println("Digite 1° valor inteiro: ");
		int int1 = leitor.nextInt();
		
		System.out.println("Digite 2° valor inteiro: ");
		int int2 = leitor.nextInt();
		
		System.out.println("Digite um valor real: ");
		double real = leitor.nextDouble();
		
		leitor.close();
		
		//Processamento
		
		int dobro = (int1 * 2) * (int2/2) ;
		double triplo = (int1 * 3) + real;
		double cubo = Math.pow(real, 3);
		
		// Saída de Dados
		
		System.out.println("O dobro do 1° inteiro multiplicando com a metade do 2° inteiro resulta em " + dobro);
		System.out.println("O triplo do 1° inteiro somado com o valor real resulta em " + triplo);
		System.out.println("O número real elevado ao cubo resulta em " + cubo);
	}
}
