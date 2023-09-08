package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int M, N;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		N =sc.nextInt();
		
		int[][] matA = new int [M][N];
		int[][] matB = new int [M][N];
		int[][] matC = new int [M][N];
		
		System.out.println("Digite os valores da matriz A: ");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B: ");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matB[i][j] = sc.nextInt();
			}
		}
		System.out.println("MATRIZ SOMA:");
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}