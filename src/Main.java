import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.println("Study!!!!");
		
		int y = 32;
		System.out.println(y);
		
		//
		double x = 10.35784;
		System.out.println(x);
		// print some numbers with decimal places set to 2 and 4
		System.out.printf("%.2f%n", x);
		// Jump a line %n or \n
		System.out.printf("%.4f", x);
		Locale.setDefault(Locale.US);
		System.out.print("\n");
		System.out.printf("%.4f\n", x);
		
		//
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		// 
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
