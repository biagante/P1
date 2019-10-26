import java.util.Scanner;

public class ex56 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		//valor entrada
		int n;
		//ler valor teclado
		System.out.print("Inserir um número de 1 a 100: ");
		n = sc.nextInt();
		
		tabuada(n);
	}
	
	public static int tabuada(int n){
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
		return n;
	}
}

