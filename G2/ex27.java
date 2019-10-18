import java.util.Scanner;

public class ex27 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		int v1,v2,v3;
		//ler valores teclado
		System.out.print("Insira o primeiro número:");
		v1 = sc.nextInt();
		System.out.print("Insira o segundo número:");
		v2 = sc.nextInt();
		System.out.print("Insira o terceiro número:");
		v3 = sc.nextInt();
		
		//calculos
		if (v1>=v2 & v1>=v3)
		{
			System.out.printf("O valor %d é o maior número inserido",v1);
		}
		else if (v2>=v1 & v2>=v3)
		{
			System.out.printf("O valor %d é o maior número inserido",v2);
		}
		else
		{
			System.out.printf("O valor %d é o maior número inserido",v3);
		}
		sc.close();
	}
}

