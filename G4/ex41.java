import java.util.Scanner;

public class ex41 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, cont=0;
		
		System.out.print("Introduza valores:\n");
		do
		{
			a = sc.nextInt();
			cont++;
		} while (a>=0);
		
		cont = cont-1;
		System.out.printf("Foram introduzidos %d números\n",cont);
	}		
}	

