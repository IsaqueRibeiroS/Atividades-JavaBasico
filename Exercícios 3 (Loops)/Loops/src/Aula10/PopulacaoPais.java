package Aula10;
import java.util.Scanner;

public class PopulacaoPais {
	public static void main (String[]args){
		
		// Declaração de Variáveis
		
		Scanner leitor = new Scanner (System.in);
		
		int ano = 0;
		double populacaoA = 0;
		double populacaoB = 0;
		double taxaCrescimentoA = 0;
		double taxaCrescimentoB = 0;
		int repetir = 0;
		
		// Entradad de Dados
		
		do {
			System.out.println("Digite o número de habitantes atual [A]");
			populacaoA = leitor.nextDouble();
			System.out.println("Digite a taxa de créscimento anual [A]:");
			taxaCrescimentoA = leitor.nextDouble();
		
		
			System.out.println("Digite o número de habitantes atual [B]");
			populacaoB = leitor.nextDouble();
			System.out.println("Digite a taxa de créscimento anual [B]:");
			taxaCrescimentoB = leitor.nextDouble();
		
		// Processamento
		
			while(populacaoA < populacaoB) {
				populacaoA += populacaoA * (taxaCrescimentoA / 100);
				populacaoB += populacaoB * (taxaCrescimentoB / 100);
				ano++;	
			}
		
		// Saída de Dados
		
			System.out.println("Taxa de crescimento anual [A] - " + taxaCrescimentoA + "%");
			System.out.println("População final [A] " 
				+ Math.ceil(populacaoA) + " habitantes");
			System.out.println("Taxa de crescimento anual [B] - " + taxaCrescimentoB + "%");
			System.out.println("População final [B] " 
					+ Math.ceil(populacaoB) + " habitantes");
			System.out.println("Total de anos estimados: " 
					+ ano);
			System.out.println("Deseja repetir a operação? "
					+ "[digite 1 para continuar]");
			repetir = leitor.nextInt();
			
		}while(repetir == 1);
		
		leitor.close();
	}
}
