import java.util.Scanner;

public class ex28 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores de entrada
		int v1,v2,v3;
		//ler valores teclado 
		System.out.print("Insira o primeiro número: ");
		v1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		v2 = sc.nextInt();
		System.out.print("Insira o terceiro número: ");
		v3 = sc.nextInt();
		
		//output
		System.out.print("Números ordenados por ordem crescente:\n");
		if (v1<v2 & v1<v3)
		{
			System.out.print(v1);
			if (v2<v3)
			{
				System.out.print(" "+v2+" ");
				System.out.print(v3);
			}
			else
			{
				System.out.print(" "+v3+" ");
				System.out.print(v2);
			}
		}
		else if (v2<v1 & v2<v3)
		{
			System.out.print(v2);
			if (v1<v3)
			{
				System.out.print(" "+v1+" ");
				System.out.print(v3);
			}
			else
			{
				System.out.print(" "+v3+" ");
				System.out.print(v1);
			}
		}
		else
		{
			System.out.print(v3);
			if (v1<v2)
			{
				System.out.print(" "+v1+" ");
				System.out.print(v2);
			}
			else
			{
				System.out.print(" "+v2+" ");
				System.out.print(v1);
			}
		}
		sc.close();
	}
}

