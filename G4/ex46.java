import java.util.Scanner;

public class ex46 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int teste = 0;
		
		
		System.out.print("Introduza um número: ");
		a = sc.nextInt();
		System.out.print("Introduza outro número: ");
		b = sc.nextInt();
		
		while (b > 0)
		{
			int res = a % b;
			a = b;
			b = res;
		}
		
		
		System.out.println("O máximo divisor comum (MDC) é " + a);
	}
}

