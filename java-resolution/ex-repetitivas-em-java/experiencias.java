import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n, cobaias, total, coelhos, ratos, sapos;
		char tipo;
		double PCoelhos, PRatos, PSapos;
		
		coelhos=0;
		ratos=0;
		sapos=0;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Quantidade de cobaias: ");
			cobaias = sc.nextInt();
			System.out.print("Tipo de cobaias: ");
			tipo = sc.next().charAt(0);
			
			if (tipo == 'C') {
				coelhos = coelhos + cobaias;
			}
			else if (tipo == 'R') {
				ratos = ratos + cobaias;
			}
			else if (tipo == 'S') {
				sapos = sapos + cobaias;
			}	
		}
		total = coelhos + ratos + sapos;
		PCoelhos = ((double)coelhos/total)*100;
		PRatos = ((double)ratos/total)*100;
		PSapos = ((double)sapos/total)*100;
		
		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + total);
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", PCoelhos));
		System.out.println("Percentual de ratos: " + String.format("%.2f", PRatos));
		System.out.println("Percentual de sapoos: " + String.format("%.2f", PSapos));
		
		sc.close();
	}
}
