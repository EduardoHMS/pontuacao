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
		System.out.println(" ");
		
		// Leitura dos outros dados //
		System.out.println("Quantas vezes o cliente atrasou o pagamento? ");
		int atraso = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)? ");
		char formasPagamento = sc.next().charAt(0);
		System.out.println(" ");
		
		// Score de volume de compras //
		double volumeConta = 0.0;
		int volumePontos = 0;
		volumeConta = compras * medio;
		if(compras == 0) {
			volumePontos = 0;
		}else if(compras <= 2) {
			if(volumeConta <= 3000.00) {
				volumePontos = 20;
			}else if(volumeConta > 3000.00) {
				volumePontos = 60;
			}
		}else if(compras > 2) {
			if(volumeConta <= 3000.00) {
				volumePontos = 40;
			}else if(volumeConta > 3000.00) {
				volumePontos = 60;
			}
		}
		System.out.println("Score de volume de compras = " + volumePontos);
		System.out.println(" ");
		
		sc.close();
	}

}
