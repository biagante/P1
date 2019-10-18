import java.util.Scanner;

public class ex211 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double a,b,c;
		//valor saida
		double res,res1,res2;
		
		//valores teclado
		System.out.print("Raízes de equação de 2ºgrau\n");
		System.out.print("Insira o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Insira o valor de B: ");
		b = sc.nextDouble();
		System.out.print("Insira o valor de C: ");
		c = sc.nextDouble();
		
		//calculos
		if (((Math.pow(b,2))-4*a*c)>0)
		{
			res1 = (-b + (Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
			res2 = (-b - (Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
			System.out.printf("Raízes da função: \n%4.2f e %4.2f",res1,res2);
		}
		else if (((Math.pow(b,2))-4*a*c)==0)
		{
			res = (-b + (Math.sqrt((Math.pow(b,2))-4*a*c)))/(2*a);
			System.out.printf("Raíz da função: \n%4.2f",res);
		}
		else
		{
			System.out.print("A equação não admite soluções reais");
		}
		
	}
}

