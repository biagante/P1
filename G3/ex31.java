import java.util.Scanner;

public class ex31 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valor entrada
		int v;
		//ler teclado
		System.out.print("Introduz o número de vezes a repetir:");
		v = sc.nextInt();
		
		for (int i = 0; i < v; i++)
		{
			System.out.print("P1 é fixe!\n");
		}
		
		
	}
}

