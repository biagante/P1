import java.util.Scanner;

public class ex57 {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void main (String[] args) {
		int a;
		int b;		
		
		System.out.print("Introduza um número: ");
		a = sc.nextInt();
		System.out.print("Introduza outro número: ");
		b = sc.nextInt();
		
		System.out.println("O máximo divisor comum (MDC) é " + mdc(a,b));
	}
	
	public static int mdc(int a, int b){
		while (b > 0)
		{
			int res = a % b;
			a = b;
			b = res;
		}
		return a;
	}
}

