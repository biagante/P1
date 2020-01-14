import java.util.*;
import java.io.*;

public class ex101 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int[] array = new int[50];
	static int[] array_temp = new int[50];
	
	public static void main (String[] args) throws FileNotFoundException{
		
		while(true)
		{
			System.out.println("Análise de uma sequência de números inteiros");
			System.out.println("1 - Ler a sequência");
			System.out.println("2 - Escrever a sequência");
			System.out.println("3 - Calcular o máximo da sequência");
			System.out.println("4 - Calcular o mínimo da sequência");
			System.out.println("5 - Calcular a média da sequência");
			System.out.println("6 - Detetar se é uma sequência só constituída por números pares");
			System.out.println("7 - Ler uma sequência de números de um ficheiro de texto");
			System.out.println("8 - Adicionar números à sequência existente");
			System.out.println("9 - Gravar a sequência atual de números num ficheiro");
			System.out.println("10 - Ordenar a sequência por ordem crescente utilizando \nordenação sequencial");
			System.out.println("11 - Ordenar a sequência por ordem decrescente utilizando \nordenação por flutuação");
			System.out.println("12 - Pesquisa de valor na sequência");
			System.out.println("13 - Terminar o progama");
			System.out.print("Opção -> ");
		
			int op = sc.nextInt();
			if (op<0 || op >13)
			{
				System.out.println("Opção inválida");
				continue;
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
					f3();
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
				case 7:
					f7();
					break;
				case 8:
					f8();
					break;
				case 9:
					f9();
					break;
				case 10:
					f10();
					break;
				case 11:
					f11();
					break;
				case 12:
					f12();
					break;
				case 13:
					System.exit(0);
				
			}
		}
	}
	public static void f1() //criação da sequencia
	{
		int a, c = 0;
		System.out.println("Introduzir números inteiros positivos: ");
		for (int i = 0; i < array.length; i++)
		{
			a = sc.nextInt();
			if (a == 0)
			{
				break;
			}
			else
			{
				array_temp[i] = a;
				c++;
			}
		}
		array = new int[c];
		for (int i = 0; i < c; i++)
		{		
			array[i] = array_temp[i];
		}
	}	
	
	public static void f2() //impressao da sequencia
	{
		System.out.println(Arrays.toString(array));
	}
	
	public static void f3() //calcular o valor maximo da sequencia
	{
		int max = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]>max)
			{
				max = array[i];
			}
		}
		System.out.println("O número máximo é " + max);
	}
	
	public static void f4() //calcular o valor minimo da sequencia
	{
		int min = 1;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]<min && array[i] != 0)
			{
				min = array[i];
			}
		}
		
		System.out.println("O número mínimo é " + min);
	}
	
	public static void f5() //calcular a media da sequencia
	{
		int soma = 0;
		int c = 1;
		double media;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]==0)
			{
				break;
			}
			else
			{
				soma = soma + array[i];
				c++;
			}
		}
		media = soma/c;
		System.out.printf("A média de sequência é %.2f\n",media);
	}
	
	public static void f6() //detetar se a sequencia so tem numeros pares
	{
		boolean par = true;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i]==0)
			{
				break;
			}
			else if (array[i]%2 != 0)
			{
				System.out.println("A sequência não é composta apenas por pares");
				par = false;
				break;
			}
		}
		
		if (par == true)
		{
			System.out.println("A sequência é composta apenas por pares");
		}
	}	
	public static void f7() throws FileNotFoundException //ler sequencia de numeros de ficheiro
	{
		Scanner nm = new Scanner(System.in);
		System.out.println("Introduza o nome do ficheiro: ");
		String nome = nm.nextLine();
		File fich = new File(nome);
		Scanner scf = new Scanner(fich);
		int c = 0;
		while (scf.hasNextLine() && (c < array.length))
		{
			int a =scf.nextInt();
			if (a == 0)
			{
				break;
			} 
			else
			{
				array_temp[c] = a;
				c++;
			}
		}
		array = new int[c];
		for (int i = 0; i < c; i++)
		{		
			array[i] = array_temp[i];
		}
	}
	
	public static void f8() //adicionar numeros à sequencia existente
	{
        if(array.length==50)
        {
            System.out.println("A sequência já está completa");
        }
        int n;
        int c = array.length;
        System.out.print("Introduza os números a adicionar à sequência :");
        for(int i = array.length; i<50;i++){
            n = sc.nextInt();
            if(n==0)
            {
				break;
			}
            else 
            {
				array_temp[i]=n; 
				c++;
			}
        }
        //atualizacao do array
        array = new int[c];
        for(int i=0;i<c;i++) {
            array[i]=array_temp[i];
        }	
       	
	}
	
	public static void f9() throws FileNotFoundException//gravar a sequencia atual num ficheiro
	{
		Scanner nm = new Scanner(System.in);
		System.out.println("Introduza o nome do ficheiro de destino: ");
		String nome = nm.nextLine();
		File f2 = new File(nome);
		PrintWriter pw = new PrintWriter(f2);
		for (int i = 0; i < array.length; i++)
		{
			pw.println(array[i]);
		}
		pw.close();
	} 

	public static void f10() { //organizar crescente sequencialmente
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		int n = -1, i , j, tmp;
		
		for (int c = 0; c < array.length; c++)
		{
			if(array[c] < max)
			{
				n = c;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 2 ; j < n + 1; j++)
			{
				if (array[i] < array[j])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}			
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void f11() {	//organizar decrescente flutuação
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min < array[i]) {
				min = array[i];
			}
		}
		int n = 0;
		int i , j, tmp;
		
		for (int c = 0; c < array.length; c++)
		{
			if(array[c] < min)
			{
				n = c;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1 ; j < n; j++)
			{
				if (array[i] > array[j])
				{
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}			
		}
		System.out.println(Arrays.toString(array));
	}
	public static void f12() { //procura um número no array
	
		int toCheck = 0;
		System.out.print("Introduza o número a procurar na sequência: ");
		toCheck = sc.nextInt();
		boolean test = false;
		for (int element : array)
		{
			if (element == toCheck)
			{
				test = true;
				break;
			}
		}
		if (test = true)
		{
			System.out.println("O número introduzido pertence à sequência \n");
		}
		else
		{
			System.out.println("O número introduzido não pertence à sequência \n");
		}
	}
}
