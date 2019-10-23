import java.util.Scanner;

public class ex49 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vez = 1;
		double soma = 0;
		double media = 0;
		
		System.out.println("Introduza a nota (de 0 a 20) ");
		System.out.print("Nota? ");
		int a = sc.nextInt();
		
		while (a >= 0)
		{	
			soma += a;
			media = soma/vez;
			System.out.print("Nota? ");
			a = sc.nextInt();
			vez++;
		}
		
		System.out.println("Soma = " + (int)soma);
		System.out.println("Média = " + media);
	}
}

