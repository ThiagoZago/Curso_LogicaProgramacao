import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int valor, soma;
		
		System.out.print("Digite um numero inteiro: ");
		valor = sc.nextInt();
		
		while (valor != 0) {
			if (valor % 2 == 0) {
				soma = valor;
				for (int i=2; i< 10; i+=2) {
					soma = soma + valor + i;
				}
			}
			else {
				soma = valor + 1;
				for (int i=2; i< 10; i+=2) {
					soma = soma + (valor + 1) + i;
				}
			}
			System.out.println("SOMA = " + soma);
			System.out.print("Digite um numero inteiro:");
			valor = sc.nextInt();
		}
		sc.close();
	}
}