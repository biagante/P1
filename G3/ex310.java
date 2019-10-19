import java.util.Scanner;

public class ex310 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,b=2,s=1,c;
		double a;
		
		System.out.print("Inserir um número inteiro: ");
		a = sc.nextDouble();
		n = (int)a;
		
		if (a<0)
		{
			System.out.print("Número inválido");
		}
		else
		{
			while(b<=n)
			{
				a=n%b;
				if (a==0)
				{
					//b divisor perfeito
					s+=b;
				}
				b++;
			}
			s=s-n;
			
			if(s==n)
			{
				System.out.printf("%d é um número perfeito\n",n);
			}
			else
			{
				System.out.print("Não é um número perfeito");
			}
		}
	}
}

