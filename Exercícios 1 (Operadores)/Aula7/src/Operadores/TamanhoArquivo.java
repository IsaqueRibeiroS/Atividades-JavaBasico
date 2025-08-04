package Operadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TamanhoArquivo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

//		Entrada de Dados

		System.out.println("Digite o tamanho do arquivo [MB]: ");
		double arquivo = leitor.nextDouble();

		System.out.println("Informe a velocidade do link de internet [MBps]: ");
		double link = leitor.nextDouble();

		leitor.close();

//		Processamento

		double velocidade = (arquivo / link) / 60;

//		Saída de Dados

		System.out.println("O arquivo será baixado em " + new DecimalFormat("#.##").format(velocidade) + " minutos.");

	}
}
