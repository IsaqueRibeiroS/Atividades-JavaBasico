package Aula10;

import java.util.Scanner;

public class NomeSenha {
	public static void main (String[] args) {
		
		// Declaração de Variáveis
		
		Scanner leitor =  new Scanner (System.in);
		
		String nome;
		String senha;
		
		// Entrada de Dados
		
		System.out.println("Digite seu nome de Usuário: ");
		nome = leitor.next();
		
		System.out.println("Digite sua senha: ");
		senha = leitor.next();
		
		while (nome.equals(senha)) {
			
			System.out.println("Nome e senha são iguais, digite novamente.");
			System.out.println("");
			
			System.out.println("Digite seu nome de Usuário: ");
			nome = leitor.next();
			
			System.out.println("Digite sua senha: ");
			senha = leitor.next();
		}
		
		leitor.close();
	}
}
