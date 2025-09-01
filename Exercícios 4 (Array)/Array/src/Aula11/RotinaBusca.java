package Aula11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotinaBusca {
	public static void main (String[] args) throws IOException {
		
		//Declaração de Variáveis
		
		BufferedReader leitor = new BufferedReader
				(new InputStreamReader(System.in));
		
		String[] vetorDeNomes = new String[10];
		int nomeNaoEncontrado = 0;
		String pesquisarNome;
		String continuarPesquisa;
		boolean validadorDePesquisa = true;
		
		// Entrada de Dados
		
		for (int i = 0; i < vetorDeNomes.length; i++) {
			
			System.out.print("Índice[" + i + "] ");
			vetorDeNomes[i] = leitor.readLine();
			
		}
		
		// Buscar nome no vetor
		
		do {
			
			System.out.print("Digite o nome que deseja ser consultado: ");
			pesquisarNome = leitor.readLine();
			
		// Saída de Dados / Processamento
			
			for(int i = 0; i < vetorDeNomes.length; i++) {
				
				if(vetorDeNomes[i].equalsIgnoreCase(pesquisarNome)) {
					System.out.println("Nome encontrado: Índice[" 
				+ i + "]");
				}
				else {
					nomeNaoEncontrado += 1;
				}
			}
			
			if (nomeNaoEncontrado == 10) {
				System.out.println("O nome inserido não consta no vetor.");
			}
			
		// Continuar Processeo de Pesquisa
			
			System.out.println("Deseja fazer outra pesquisa? "
					+ "(S para continuar)");
			continuarPesquisa = leitor.readLine();
			
			if (continuarPesquisa.equalsIgnoreCase("s") == false) {
				validadorDePesquisa = false;
			}
			
			nomeNaoEncontrado = 0;
				
		}while(validadorDePesquisa == true);
		
		System.out.print("Programa encerrado.");
	}
}
