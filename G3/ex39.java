import java.util.Scanner;

public class ex39 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//entrada
		int n;
		int sum=0;
		//ler valor
		System.out.print("Inserir um valor: ");
		n = sc.nextInt();
		
		if (n < 0 || n >10000)
		{
			System.out.print("Número inválido");
		}
		else
		{
			for (int i = 1; i <= n; i++)
			{
				if (i%2 == 0)
				{
					System.out.println(i);
					sum = sum +i;
					sum++;
				}
				
			}
			System.out.printf("\nA soma dos números pares é %d ",sum);
		}
		
	}
}

