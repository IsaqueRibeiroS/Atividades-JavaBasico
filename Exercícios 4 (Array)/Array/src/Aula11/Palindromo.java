package Aula11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromo {
	public static void main(String[] args) throws IOException{
		
		// Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorOriginal = new String[5];
		String[] vetorInvertido = new String[5];
		
		// Entrada de Dados
		
		for(int i = 0; i < vetorInvertido.length; i++) {
			
			System.out.print("Índice[" + i + "] ");
			vetorOriginal[i] = leitor.readLine();
			
			// Evita retornar valor NULL
			
			vetorInvertido[i] = "";
		}
		
		for(int i = 0; i < vetorOriginal.length; i++) {
			for (int j = vetorOriginal[i].length() - 1; j >= 0; j--) {
				
				vetorInvertido[i] += vetorOriginal[i].charAt(j);
			}
		}
		
		// Processamento - Saída de Dados
		
		for (int i = 0; i < vetorOriginal.length; i++) {
			if (vetorOriginal[i].equalsIgnoreCase(vetorInvertido[i]) == true) {
				
				System.out.println("Índice[" + i + "] "
						+ "é um palíndromo!");
			}
			else {
				System.out.println("Índice[" + i + "] "
						+ "não é um palíndromo!");
			}
		}
	}
}
