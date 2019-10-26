import java.util.Scanner;

public class ex59 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int a;
		
		System.out.print("Introduza um número: ");
		a = sc.nextInt();
		
		isprime(a);
		
	}
	
	public static int isprime(int a) {
		int m = 0;
		int teste = 0;
		m = a/2;
		if (a == 0 || a == 1)
		{
			System.out.print(a + " não é um número primo");
		}
		else
		{
			for (int i = 2; i <= m; i++)
			{
				if (a % i == 0)
				{
					System.out.print(a + " não é um número primo");
					teste = 1;
					break;
				}
			}
			if (teste == 0)
			{
				System.out.print(a + " é um número primo");
			}
		}
		return a;
	}
	
}

