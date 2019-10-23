import java.util.Scanner;

public class ex48 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		int soma = 0;
		String s = "";
		
		System.out.print("Introduza o valor de X: ");
		x = sc.nextInt();
		System.out.print("Introduza o valor de Y: ");
		y = sc.nextInt();
		
		System.out.println("   X  |   Y  | soma ");
		System.out.print("--------------------");
		
		if (x%2 != 0)
				{
					soma += y;
					s = "sim";
					System.out.printf("\n %4d | %4d | %s ",x,y,s);
				}
				else
				{
					s = "não";
					System.out.printf("\n %4d | %4d | %s ",x,y,s);
				}
		
		while (x > 1)
		{
				
			for (int i = 0; i < x; i++)
			{	
				
				x = x/2;
				y = y*2;
				
				if (x%2 != 0)
				{
					soma += y;
					s = "sim";
					System.out.printf("\n %4d | %4d | %s ",x,y,s);
				}
				else
				{
					s = "não";
					System.out.printf("\n %4d | %4d | %s ",x,y,s);
				}	
			}
		}
		
		System.out.println("\n--------------------");
		System.out.println("Soma: " + soma);
	}
}

