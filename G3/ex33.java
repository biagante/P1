import java.util.Scanner;

public class ex33 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valor entrada
		int m;
		
		//ler valor teclado
		System.out.print("Inserir valor: ");
		m = sc.nextInt();
		
		if(m>0 & m<=10)
		{
			for (int i = 1; i <= m; i++)
			{
				int fact=1;
				
				for (int n = 1; n <= i; n++)
				{
					fact *= n;
				}
				
				System.out.printf("%2d! = %2d\n",i,fact);
			}
			
		}
		else
		{
			System.out.print("Número inválido");
		}
		
	}
}

