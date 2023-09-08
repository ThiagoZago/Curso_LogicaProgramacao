package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dist;
		double combGasto, consumoMedio;
		
		System.out.print("Distancia percorrida: ");
		dist = sc.nextInt();
		System.out.print("Combustivel gasto: ");
		combGasto = sc.nextDouble();
		
		consumoMedio = dist/combGasto;
		
		System.out.println("Consumo medio = " + String.format("%.3f", consumoMedio));
		
		sc.close();
	}
}