import java.util.Scanner;

public class ex32 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valor entrada
		int n;
		//ler valor teclado
		System.out.print("Inserir um número de 1 a 100: ");
		n = sc.nextInt();
		
		//output
		if (n>0 & n<100)
		{
			System.out.print("\n-----------------\n");
			System.out.printf("| Tabuada dos %2d |\n",n);
			System.out.print("-----------------\n");
			for (int i = 1; i < 11; i++)
			{
				int a = n*i;
				System.out.printf("|%3d x %2d | %3d |\n",n,i,a);
			}
			System.out.print("-----------------\n");
		}
		else
		{
			System.out.print("Número não é válido\n");
		}
		
		
		sc.close();
		
	}
}

