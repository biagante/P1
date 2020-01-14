import java.util.*;

public class ex62 
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) 
	{
		//array temporario de 100,base para os valores introduzidos
		int[] array_temp = new int[100];
		
		//aquisição de valores para array
		array_temp = input();
		
		//adquirir numero para comparacao com verificacao
		int a = compara();
		
		//array definitivo com o valor adequado
		int[] array = new int[array_temp.length];
		array = array_temp;
		
		//contagem do numero de vezes que o numero pedido se repete
		int c = contagem(array,a);
		System.out.printf("O número %d foi introduzido %d vezes",a,c);
		
	}
	
	public static int compara() 
	{
		System.out.print("Qual o número a comparar? ");
		int a = sc.nextInt();
		
		while (a<0)
		{
			System.out.println("Número inválido");
			System.out.println("Insira um número inteiro positivo: ");
			a = sc.nextInt();
		}
		return a;
	}
	
	public static int[] input()
	{
		int a;
		int[] array = new int[100];
		
		System.out.print("Introduza números inteiros positivos: ");
		for (int i = 0; i < 100; i++)
		{
			a = sc.nextInt();
			if (a<0)
			{
				break;
			}
			else
			{
				array[i] = a;
			}
		}
		return array;
	}
	
	public static int contagem(int[] array, int x)
	{
		
		int c = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]==x)
			{
				c++;
			}
		}
		return c;
	}
}


