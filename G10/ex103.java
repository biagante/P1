import java.util.*;
import java.io.*;

public class ex103 {
	
	static Scanner rd = new Scanner(System.in);
	static double[] array = new double[100];
	static double[] array_temp = new double[100];
	
	public static void main (String[] args) throws IOException {
		int op;
		while(true)
		{
			System.out.println("Analisador de pH");
			System.out.println("1 - Ler valores de pH de um ficheiro");
			System.out.println("2 - Escrever valores de pH no terminal");
			System.out.println("3 - Calcular o pH médio das amostras");
			System.out.println("4 - Calcular o número de amostras ácidas (< 7) e básicas (> 7)");
			System.out.println("5 - Calcular o número de amostras de pH superior à média");
			System.out.println("6 - Escrever valores de pH no terminal ordenados de modo crescente");
			System.out.println("7 - Terminar o programa");
			System.out.print("Opção -> ");
			op = rd.nextInt();
		
			if (op<0 || op>7)
			{
				System.out.println("Opção inválida");
				System.out.print("Opção -> ");
				op = rd.nextInt();
			}
		
			switch (op)
			{
				case 1:
					f1();
					break;
				case 2:
					f2();
					break;
				case 3:
					System.out.printf("\nO valor da média de pH é %4.2f\n\n",f3());
					break;
				case 4:
					f4();
					break;
				case 5:
					f5();
					break;
				case 6:
					f6();
					break;
				default:
					System.exit(0);
			}
		}
	}
	
	public static void f1() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduza o nome do ficheiro: ");
		String fname = sc.nextLine();
		File fl = new File(fname);
		Scanner scf = new Scanner(fl);
		int n = 0;
		while (scf.hasNextLine())
		{
			double a = scf.nextDouble();
			if (a<0 || a>14)
			{
				continue;
			}
			else
			{
				array_temp[n] = a;
				n++;
			}
		}
		array = new double[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = array_temp[i];
		}
		System.out.println();
	}
	
	public static void f2(){
		//System.out.print(Arrays.toString(array));
		System.out.println("\nValores de pH: ");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+ ", ");
		}
		System.out.println("\n");
	}
	
	public static double f3(){
		double sum = 0;
		double media = 0;
		int n = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
			n++;
		}
		media = sum/n;
		
		return media;
	}
	
	public static void f4(){
		int acido = 0;
		int basic = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < 7)
			{
				acido++;
			}
			if (array[i] > 7)
			{
				basic++;
			}
		}
		System.out.printf("\nNúmero de amostras ácidas: %d\n",acido);
		System.out.printf("Número de amostras básicas: %d\n\n",basic);
		
	}
	
	public static void f5(){
		double media = f3();
		int n = 0;
		for (int i = 0; i < array.length; i++)
		{				
			if (array[i] > media)
			{
				n++;
			}
		}
		System.out.printf("\nNúmero de amostras de pH superiores à média: %d\n\n",n);
	}
	
	public static void f6(){
		double max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		int n = -1, i , j;
		double tmp;
		
		for (int c = 0; c < array.length; c++)
		{
			if(array[c] < max)
			{
				n = c;
			}
		}
		
		
		for (i = 0; i < n; i++)
		{
			for (j = i + 1 ; j < n + 1; j++)
			{
				if (array[i] > array[j])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}			
		}
		//System.out.println(Arrays.toString(array));
		System.out.print("\nValores ordenados: ");
		for (int k = 0; k < array.length; k++)
		{
			System.out.print(array[k]+ ", ");
		}
		System.out.println("\n");
	}
	
}

