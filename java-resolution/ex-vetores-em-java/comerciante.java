import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N; 
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		N = sc.nextInt();
		
		String[] nomeProduto = new String [N];
		double[] precoCompra = new double [N];
		double[] precoVenda = new double [N];
		int lucroAbaixo10, lucroEntre10e20, lucroAcima20;
		double valorTotalCompra, valorTotalVenda, lucroTotal;
		
		for(int i=0; i<N; i++) {
			System.out.println("Produto " + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nomeProduto[i] = sc.nextLine();
			System.out.print("Preco de compra: ");
			precoCompra[i] = sc.nextDouble();
			System.out.print("Preco de venda: ");
			precoVenda[i] = sc.nextDouble();
		}
		System.out.println();
		
		lucroAbaixo10 = 0;
		lucroEntre10e20 = 0;
		lucroAcima20 = 0;
		for(int i=0; i<N; i++) {
			if ((precoVenda[i]/precoCompra[i]-1)*100 < 10) {
				lucroAbaixo10++;
			}
			else if ((precoVenda[i]/precoCompra[i]-1)*100 <= 20) {
				lucroEntre10e20++;
			}
			else {
				lucroAcima20++;
			}
		}
		
		valorTotalCompra = 0;
		valorTotalVenda = 0;
		for(int i=0; i<N; i++) {
			valorTotalCompra = valorTotalCompra + precoCompra[i];
			valorTotalVenda = valorTotalVenda + precoVenda [i];
		}
		lucroTotal = valorTotalVenda - valorTotalCompra;
		
		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		System.out.println("Valor total de compra: " + String.format("%.2f", valorTotalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", valorTotalVenda));
		System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));
		
		sc.close();
	}
}