import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N, indice, maior; 
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		N = sc.nextInt();
		
		String[] nome = new String [N];
		int[] idade = new int [N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maior = idade[0];
		indice = 0;
		for (int i=0; i<N; i++) {
			if (maior < idade [i]) {
				maior = idade[i];
				indice = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nome[indice]);
		
		sc.close();
	}
}
