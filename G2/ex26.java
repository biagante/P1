import java.util.Scanner;

public class ex26 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//variaveis entrada
		int number;
		//ler valor teclado
		System.out.print("Inserir número: ");
		number = sc.nextInt();
		//calculo
		if (number % 2 == 0)
		{
			System.out.print("O número é par");
		}
		else
		{
			System.out.print("O número é ímpar");
		}
		sc.close();
	}
}

