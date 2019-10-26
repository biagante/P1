import java.util.Scanner;

public class ex58 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		double xi,xf,f;
		int n;
		do{
		System.out.print("x inicial:");
		xi = sc.nextDouble();
		
		System.out.print("x final:");
		xf = sc.nextDouble();
		
		System.out.print("Número de entradas:");
		n = sc.nextInt();
		
		if(xi>=xf) 
			{
			System.out.print("xi <= xf");
			}
		}while(xi>=xf);
		
		f=(xf-xi)/(n-1);
		
		//output
		System.out.println("---------------------------");
		System.out.printf("|  x  |  poly1  |  poly2  |\n");
		System.out.println("---------------------------");
		
		for(double i=xi;i<=xf; i+=f) 
		{
			System.out.printf("| %3.1f | %5.2f | %8.3f |\n",i,poly2(i),poly3(i));
			System.out.println("---------------------------");
		}
	}
	
	public static double poly2 (double x) {
		double y;
		y=5*Math.pow(x,2)+10*x+3;
		return y;
	}
	
	public static double poly3 (double x) {
		double y;
		y=7*Math.pow(x,3)+3*Math.pow(x,2)+5*x+2;
		return y;
	}
}

