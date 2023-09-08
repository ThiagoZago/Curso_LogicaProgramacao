package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnidade, dinheiroRecebido, troco;
		int qtd;
		
		System.out.print("Preco unitario do produto: ");
		precoUnidade = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - (precoUnidade*qtd);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}
}