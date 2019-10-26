import java.util.Scanner;

public class ex54 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.print("Introduza um número (entre 0 e 10): ");
		int a = sc.nextInt();
		int b = valid(a);
		
		for (int i = a; i >=1 ; i--)
		{
			System.out.printf("%d! = %d\n",i,fact(i));
		}
		
	}
	
	public static int valid(int x){
		if (x > 10 && x <0)
		{
			System.out.print("Introduza um número válido: ");
			x = sc.nextInt();
		}
		return x;
	}
	public static int fact(int x){
		int fact = 1;

        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
	}
}

