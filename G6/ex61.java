import java.util.*;

public class ex61 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.print("Introduza o valor de N: ");
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		array = lerSequencia(array);
		
		//array temporário para armazenar sequência invertida
		int temp[] = new int[array.length];
		
		//inversao dos dados introduzidos pelo utilizador e  guarda no array temp
		for (int i=1;i<=array.length; i++)
		{
			temp[i-1]=array[array.length-i];
		}
		System.out.println(Arrays.toString(temp));
	}
	
	public static int[] lerSequencia (int array[])
	{
			System.out.print("Insira a sequência de números:");
			for (int i = 0; i < array.length; i++)
			{
				array[i] = sc.nextInt();
			}
			System.out.println();
			return array;
	}
}

