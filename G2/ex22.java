import java.util.Scanner;

public class ex22 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double v1,v2;
		
		//ler valores teclado
		System.out.print("Insira o primeiro valor:");
		v1 = sc.nextDouble();
		System.out.print("Insira o segundo valor:");
		v2 = sc.nextDouble();
		
		//calculos
		if (v1 > v2)
		{
			System.out.printf("%4.2f é maior que %4.2f",v1,v2);
		}
		else if (v1 < v2)
		{
			System.out.printf("%4.2f é menor que %4.2f",v1,v2);
		}
		else
		{
			System.out.print("Os dois valores são iguais");
		}
		sc.close();
	}
}

