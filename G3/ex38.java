import java.util.Scanner;

public class ex38 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		int a,b;
		
		//ler teclado
		System.out.print("Insira dois números positivos: \n");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a <0 || b<0)
		{
			System.out.print("Valores inválidos");
		}
		else
		{
			if (a>b)
			{
				for (int i = b; i < a; i++)
				{
					if (i%2!=0)
					{
						System.out.printf("%d é impar\n",i);
					}
				}
				
			}
			else
			{
				for (int j = a; j < b; j++)
				{
					if (j%2!=0)
					{
						System.out.printf("%d é impar\n",j);
					}
				}
			}
		}
		
	}
}

