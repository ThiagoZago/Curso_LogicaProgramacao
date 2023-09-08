package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double larg, comp, valorMetro, area, preco;
		
		System.out.print("Digite a largura do terreno: ");
		larg = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comp = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();
		
		area = comp * larg;
		preco = area * valorMetro;
		
		System.out.println("Area do terreno = " + String.format("%.2f", area));
		System.out.println("Preco do terreno = " + String.format("%.2f", preco));
		
		sc.close();
	}
}
