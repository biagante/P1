/*
 * JAM, out-2019
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */
import java.util.Scanner;

public class Functions {
	
	static Scanner sc = new Scanner(System.in); //evoca sempre este scanner

	public static void main (String args[]) {
		// Testar função sqr:
		//System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		//System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2)); //testar max
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2)); // testar max int
		//System.out.printf("p(x) = %f",poly3(3,5,-14,0,2)); // testar equacao grau 3
		//System.out.printf("%d! = %d",5,fact(5));	//testar fatorial
		
		//int ano = getIntPos();
		//System.out.printf("ano = %d\n", ano);	//testar getIntPos
		
		//int x = getIntRange(0,125); //testar getIntRange(intervalo)
		
		//printNtimes(3,"Ola"); //testar o printNtimes

	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}

	// Defina as funções pedidas no enunciado:
	
	public static double f(double x){
		double y;
		y = 1/(1 + x*x);
		return y;
	}
	
	public static double max(double x,double y) {
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	public static int max(int x,int y) {
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	public static double poly3(double a,double b, double c, double d, double x){
		double y;
		y = (a*(Math.pow(x,3))+(b*(Math.pow(x,2)))+(c*x)+d);
		return y;
	}
	
	public static int fact(int x){
		int fact = 1;

        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
	}
	
	public static int getIntPos(){
		int x;
		do
		{
			System.out.print("Introduza um valor positivo: ");
			x = sc.nextInt();
		} while (x<0);
		
		return x;
	}
	
	public static int getIntRange(int a, int b){
		int x;
		System.out.print("Introduza um número: ");
		x = sc.nextInt();
		if (x > a && x < b)
		{
			System.out.print("O número encontra-se no intervalo definido");
		}
		else if (x < a && x < b)
		{
			System.out.print("O número encontra-se no intervalo definido");
		} 
		else
		{
			System.out.print("O número não se encontra no intervalo");
		}
		return x;
	}

	public static void printNtimes(int x, String s){
		for (int i = 0; i < x; i++)
		{
			System.out.print(s);
		}
		return;
	}

}


