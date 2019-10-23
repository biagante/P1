import java.util.Scanner;

public class ex42 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, cont=1;
		int vez=0;
		
		System.out.print("Introduza uma lista de números (terminada com 0): ");
		
		do
		{
			a = sc.nextInt();
			if (a != 0)
			{
				cont = cont * a;
				vez++;
			}
			else if (a == 0 & vez == 0)
			{
				cont = 0;
			}

		} while (a>=1);
		
		System.out.printf("Produto = %4.2f",cont);
	}
}

