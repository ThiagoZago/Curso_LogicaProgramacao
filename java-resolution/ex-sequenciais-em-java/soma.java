package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, Y, soma;
		
		System.out.print("Digite o valor de X: ");
		X = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		Y = sc.nextInt();
		
		soma = X+Y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
