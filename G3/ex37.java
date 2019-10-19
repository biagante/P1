import java.util.Scanner;

public class ex37 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valor entrada
		int a,l;
		int c1 =1;
		//ler teclado
		System.out.print("Insira valor da largura: ");
		l = sc.nextInt();
		System.out.print("Insira valor da altura: ");
		a = sc.nextInt();
		do
		{
			for (int c = 1; c <=l; c++)
			{
				System.out.print("*");
			}
			c1++;
			System.out.println(" ");
		} while (c1<=a);
		
	}
}



