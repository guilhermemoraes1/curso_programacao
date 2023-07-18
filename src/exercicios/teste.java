package exercicios;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;

		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		sc.nextLine();
		int dif = (A * B - C * D);
		System.out.println("DIFERENCA = " + dif);

		sc.close();
	}

}
