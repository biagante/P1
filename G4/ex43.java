import java.util.Scanner;

public class ex43 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.print("Introduza uma lista de números (terminada com o primeiro valor introduzido): ");
		a = sc.nextInt();
		
		int max = a, min = a, med = a;
		int n = 1;
		int sum = a;
		
		b = sc.nextInt();
		while (b != a)
		{
			if (b>a)
			{
				max = b;
			}
			else
			{
				min = b;
			}
			n++;
			sum += b + a;
			b = sc.nextInt();
			
		}
		
		med = sum/n;
		System.out.println("Valor Máximo: "+max);
		System.out.println("Valor Mínimo: "+min);
		System.out.println("Valor da Média: "+med);
		System.out.println("Número de Elementos: "+(n+1));
	}
}

