package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N, M;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		N = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		M = sc.nextInt();
		
		double[][] mat= new double [N][M];
		double[] vet= new double [N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Digite os elementos da "+ (i+1) +"a linha: ");
			for (int j=0; j<M; j++) {
				mat[i][j]= sc.nextDouble();
			}
		}
		
		for (int i=0; i<N; i++) {
			vet[i]=0;
			for (int j=0; j<M; j++) {
				vet[i]= vet[i] + mat[i][j];
			} 
		}
		
		System.out.println("VETOR GERADO: ");
		for (int i=0; i<N; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		sc.close();
	}
}
