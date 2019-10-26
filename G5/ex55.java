import java.util.Scanner;

public class ex55 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int a, l;
		System.out.print("Insira valor da largura: ");
		l = sc.nextInt();
		System.out.print("Insira valor da altura: ");
		a = sc.nextInt();
		
		f(a,l);
	}
	
	public static int f(int a, int l){
		int x = l-2;
		int c, c1 = 1;
		if (a == 1)
		{
			for (c=1;c <=l; c++)
			{
				System.out.print("*");
			}
			
		}
		else if (a>2)
		{
			//primeira linha
			for (c = 1; c <=l; c++)
			{
				System.out.print("*");
			}
			//linhas internas
			System.out.println("");
			do
			{
				System.out.print("*");
				for (c=1; c <=x; c++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println("");
				c1++;				
			} while (c1<=(a-2));
			
			//ultima linha
			for (c=1; c <=l; c++)
			{
				System.out.print("*");
			}
		}
		else if (a == 2)
			{
				do
				{
					for (c = 1; c <=l; c++)
					{
						System.out.print("*");
					}
					c1++;
					System.out.println("");
				} while (c1<=a);
				
			}
		return x;
		}
	}
	


