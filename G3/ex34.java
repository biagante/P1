import java.util.Scanner;

public class ex34 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		 //valor entrada
		 int n;
		 double pi = 0;
		 double denom = 1;
		 //ler valor
		 System.out.print("Inserir um número: ");
		 n = sc.nextInt();
		 
		 for (int i = 0; i < n; i++)
		 {
			 if (i%2 == 0)
			 {
				 pi = pi + (1/denom);
			 }
			 else
			 {
				 pi = pi - (1/denom);
			 }
			 denom = denom +2;
		 }		 
		 
		 //output
		 System.out.printf("%4.15f\n",pi);
		 System.out.print((Math.PI)/4);
	}
}

