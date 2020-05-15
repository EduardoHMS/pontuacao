package prova;

import java.util.Locale;
import java.util.Scanner;

public class pontuacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// CABECALHO //
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		System.out.println(" ");
		
		// Leitura do Volume //
		System.out.println("Quantas compras o cliente fez no último ano? ");
		int compras = sc.nextInt();
		System.out.println("Qual o ticket médio? ");
		double medio = sc.nextDouble();
		
		
		sc.close();
	}

}
