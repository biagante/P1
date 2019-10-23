import java.util.Scanner;

public class ex412 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c;
		
		String s = "";
		int a, b, n = 0;
		
		do
		{
			c = 0;
			int secret = (int)(100.0*Math.random()) + 1;
			System.out.print(secret);
			System.out.print("Adivinha o número: ");
			a = sc.nextInt();
				
			while (a != secret)
			{
				b = Math.abs(secret -a);
				if (b <= 5)
				{
					s = "Está muito perto";
				}
				if (b <= 10 & b > 5)
				{
					s = "Está perto";
				}
				if (b > 10 & b <20)
				{
					s = "Está longe";
				}
				if (b > 20)
				{
					s = "Está muito longe";
				}
				n++;
				System.out.printf("Tentativa errada\n%s\nTente Novamente: ",s);
				a = sc.nextInt();
			}
			System.out.printf("Parabéns!\nAcertou após %d tentativas",(n+1));
		
			System.out.print("\nNovo jogo? s/n\n");
			String resp = sc.next();
			if (resp.equals("s"))
			{
				c = 1;
			}
			else if (resp.equals("n"))
			{
				c = 0;
			}
		} while (c == 1);
	}
}

