package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int [N][N];
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<N; j++) {
				System.out.print("Elemento [" + i + ","+ j + "]: ");
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		for (int i=0; i<N; i++){
			maior = 0;
			for (int j=0; j<N; j++) {
				if (mat[i][j]>maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}
}
