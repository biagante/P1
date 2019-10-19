import java.util.Scanner;

public class ex36 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valor entrada
		int a,l,x;
		int c,c1 =1;
		//ler teclado
		System.out.print("Insira valor da largura: ");
		l = sc.nextInt();
		System.out.print("Insira valor da altura: ");
		a = sc.nextInt();
		
		x = l-2;
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
		}
		
		
	}


