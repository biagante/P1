import java.util.Scanner;

public class ex411 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;  //ler valor do teclado
		int b = 0;	
		int c = 1;
		int n = 0;
		int m = 0;

		
		System.out.print("Introduza a lista de números: \n");
		
		do
		{
			b = a;				//armazena valor
			a = sc.nextInt();
			
			if (c == 1)
			{
				n = a;
			}
			c = 0;
			
			if (a > m)
			{
				m = a;		//determina o maior número
			}
			
			if (a < n)
			{
				n = a;		//determina o menor número
			}
		} while (a/2 != b);		//corre se onº não for o dobro do anterior
		
		System.out.printf("Menor número: %s\n",n);
		System.out.printf("Maior número: %s\n",m);
		System.out.printf("Números que interromperam a sequência: %d e %d",(a/2),a);
	}
}

