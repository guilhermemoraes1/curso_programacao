package aula25;

import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou seu nome: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou sua idadde: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou seu peso:" + z);
		
		char a;
		a = sc.next().charAt(0);
		System.out.println("Primeira letra: " + a);
		
		sc.close();
	}

}
