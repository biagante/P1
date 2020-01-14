import java.util.*;

public class ex67 {
	
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();
	static int[] array;
	static int[] cont;
	
	public static void main (String[] args) 
	{
		int xi, xf, n;
		
		System.out.print("Número de valores a gerar: ");
		n = sc.nextInt();
		System.out.print("X inicial: ");
		xi = sc.nextInt();
		System.out.print("X final: ");
		xf = sc.nextInt();
		System.out.println();
		
		array_generator(xi,xf,n);
		contagem(xi,xf,n);
		
		for (int i = 0; i < cont.length; i++)
		{
			if (cont[i]>0)
			{
				System.out.printf("%d ocorre %d vezes \n",xi+i,cont[i]);
			}
		}	
	}
	
	public static void array_generator(int xi, int xf, int n)
	{
		array = new int[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = (int)(Math.random()*(xf - xi) +xi);
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void contagem(int xi, int xf, int n)
	{
		cont = new int[(xf-xi)+1];
		
		for (int i = 0; i < n; i++)
		{
			int h = 0;
			for (int c = xi; c <= xf; c++)
			{
				if (array[i] == c)
				{
					cont[h]++;
					break;
				}
				h++;
			}
			
		}
		
		
	}
}
