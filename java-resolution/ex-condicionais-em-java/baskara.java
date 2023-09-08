package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double coefA, coefB, coefC, X1, X2, delta;
		
		System.out.print("Coeficiente A: ");
		coefA = sc.nextDouble();
		System.out.print("Coeficiente B: ");
		coefB = sc.nextDouble();
		System.out.print("Coeficiente C: ");
		coefC = sc.nextDouble();
		
		delta = Math.pow(coefB, 2) - 4*coefA*coefC;
		
		if (delta < 0 || coefA == 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}else {
			X1 = (-coefB + Math.sqrt(delta)) / (2*coefA);
			X2 = (-coefB - Math.sqrt(delta)) / (2*coefA);
			System.out.println("X1 = " + String.format("%.4f", X1));
			System.out.println("X2 = " + String.format("%.4f", X2));
		}
		sc.close();
	}
}
