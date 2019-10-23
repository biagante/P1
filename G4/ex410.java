import java.util.Scanner;

public class ex410 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double a;
		int p = 0; //numeros positivos
		int n = 0; //numeros negativos
		int centp = 0; //intervalo [100...1000]
		int milneg = 0; //intervalo [-1000...-100]
		
		System.out.println("Introduza uma lista de números (terminada com 0): ");
		a = sc.nextInt();	
			while (a != 0)
			{
				if (a < 0)
				{
					n++;
					if (-1000 < a && a < -100)
					{
						milneg++;
					}
				}	
				else{
						p++;
						if (a >= 100 && a <= 1000)
						{
							centp++;
						}
					}
				a = sc.nextInt();
			}		
				
		System.out.printf("Números posivivos: %d\n",p);
		System.out.println("Números negativos: " + n);
		System.out.println("Números no invervalo [-1000,-100]: " + milneg);
		System.out.println("Números no invervalo [100,1000]: " + centp);

			
	}
}

