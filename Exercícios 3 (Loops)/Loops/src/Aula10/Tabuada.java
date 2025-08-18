package Aula10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tabuada {
	public static void main (String[] args) throws IOException {
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String numero;
		int resultado = 0;
		
		// Entrada de Dados
		
		System.out.println("Digite um número "
				+ "para gerar tabuada: ");
		numero = leitor.readLine();
		
		// Saída de Dados
		
		System.out.println("Tabuada[" + numero + "]");
		
		for (int i = 1; i < 11; i++) {
			
			resultado = (Integer.parseInt(numero) * i);
			
			System.out.println(numero + " x " 
			+ i + " = " + resultado);
		}
	}
}
