import java.util.Scanner;

public class ex23 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valor entrada
		int idade;
		
		//imprime tabela de preços
		System.out.print("     Idade     |      Bilhete      \n");
		System.out.print("-------------------------------------\n");
		System.out.print(" Inferior a 6  | Isento de pagamento\n");
		System.out.print(" Entre 6 e 12  | Bilhete de criança\n");
		System.out.print(" Entre 13 e 65 | Bilhete normal\n");
		System.out.print(" Mais de 65    | Bilhete de 3ª idade\n");
		
		//ler valor teclado
		System.out.print("\nInserir idade do visitante: ");
		idade = sc.nextInt();
		
		//formula
		if (idade < 6)
		{
			System.out.print("Isento de pagamento");
		}
		else if (idade >= 6 & idade < 12)
		{
			System.out.print("Bilhete de criança");
		}
		else if (idade >= 12 & idade < 66)
		{
			System.out.print("Bilhete normal");
		}
		else
		{
			System.out.print("Bilhete de 3ª idade");
		}
		sc.close();
	}
}

