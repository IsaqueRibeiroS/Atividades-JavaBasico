package Aula10;

import java.util.Scanner;

public class ValidadorRequisitos {
	public static void main (String[] args) {
		
		// Declaração de Variáveis
		
		Scanner leitor = new Scanner (System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean validador = false;
		
		// Entrada de Dados
		
		System.out.println("Nome: ");
		nome =  leitor.next();
		
		// Validador nome
		
		do {
			
			if (nome.length() > 3) {
			validador = true;
			} 
			else {
			validador = false;
			System.out.println("Digite um nome que possua mais de 3 letras: ");
			nome = leitor.next();
			}
			
		}while (validador == false);
		
		// Validador idade
		
		validador = !validador; 
		
		System.out.println("Idade: ");
		idade = leitor.nextInt();
		
		do {
			
			if (idade <= 150 && idade >= 0) {
			validador = true;
			} 
			else {
			validador = false;
			System.out.println("Idade tem que estar entre 0 e 150 anos: ");
			idade = leitor.nextInt();
			}
			
		}while (validador == false);
		
		// Validador Salário
		
		validador = !validador;
		
		System.out.println("Salário: ");
		salario = leitor.nextDouble();
		
		do {
			
			if (salario > 0) {
			validador = true;
			} 
			else {
			validador = false;
			System.out.println("O salário precisa ser maior que 0: ");
			salario = leitor.nextDouble();
			}
			
		}while (validador == false);
		
		// Validador Sexo
		
		validador = !validador;
		
		System.out.println("Sexo [F/M]: ");
		sexo = leitor.next();
		
		do {
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
			validador = true;
			} 
			else {
			validador = false;
			System.out.println("Digite a opção F para feminino e M para masculino: ");
			sexo = leitor.next();
			}
			
		}while (validador == false);
		
		// Validador Estado Civil
		
		validador = !validador;
		
		System.out.println("Estado civil [C/S/V/D]: ");
		estadoCivil = leitor.next();
		
		do {
			
			if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || 
				estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ) {
			validador = true;
			} 
			else {
			validador = false;
			System.out.println("Digite C para casado, S para solteiro, "
					+ "V para viúvo e D para divórciado: ");
			estadoCivil = leitor.next();
			}
			
		}while (validador == false);
		
		leitor.close();
		
		// Saída de Dados
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário R$: " + salario);
		System.out.println("Sexo[" + sexo.toUpperCase() + "]"  );
		System.out.println("Estado Civil [" + estadoCivil.toUpperCase() + "]");
	}
}
