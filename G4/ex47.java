import java.util.Scanner;

public class ex47 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int versus = 0;
		
		System.out.print("Introduza um número: ");
		a = sc.nextInt();
		
		if (a <= 0)
		{
			System.out.print("Introduza um número válido: ");
			a = sc.nextInt();
		}
		else
		{
			while (a != 0)
			{
				int digit = a % 10;
				versus = versus * 10 + digit;
				a /= 10;
			}
		}
		System.out.println("O número invertido é " + versus);
		
	}
}

