package cursoLogicaProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int total, seg, min, hora;
		
		System.out.print("Digite a duracao em segundos: ");
		total = sc.nextInt();
		
		seg = total%60;
		min = (total/60)%60;
		hora = (total/3600)%60;
		
		System.out.println(hora + ":" + min + ":" + seg);
		
		sc.close();
	}
}