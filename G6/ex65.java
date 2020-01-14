import java.util.*;

public class ex65 {
	
	static Scanner sc = new Scanner(System.in);
	static double[] array;
	static double media, desvio;
	
	public static void main (String[] args) {
		input();
		media();
		desvio();
		
		System.out.println("Média: "+media);
		System.out.printf("Desvio padrão: %.2f",desvio);
		
		System.out.println("\nValores superiores à média: ");
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>media)
			{
				System.out.printf("%.2f ",array[i]);
			}
		}
	}
	
	public static void input()
	{
		System.out.print("Número de valores a introduzir: ");
		int n = sc.nextInt();
		array = new double[n];
		
		System.out.println("Inserir sequência: ");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextDouble();
		}
		
	}
	public static void media()
	{
		double soma = 0;
		for (int i = 0; i < array.length; i++)
		{
			soma = soma + array[i]; 
		}
		media = soma/array.length;
	}
	
	public static void desvio()
	{
		double somatorio = 0;
		for (int i = 0; i < array.length; i++)
		{
			somatorio = somatorio + Math.pow((array[i]-media),2);
		}
		desvio = Math.sqrt(somatorio/array.length);
	}
	
	
}

