import java.util.Scanner;

public class ex52 {
	
	public static void main (String[] args) {
		double a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza os valores de a,b,c e d: (com a > 0):");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		
		System.out.printf("x = %f", poly3(a,b,c,d));
	}
	
	public static double poly3(double a,double b,double c,double d) {
		double x;
		if (a == 0)
		{
			System.out.print("Não é uma equação cúbica.");
			return a;
		} 
		else
		{
			x = ((Math.cbrt(
			(((-Math.pow(b,3))/(27*Math.pow(a,3)))+((b*c)/(6*Math.pow(a,2)))-(d/2*a))+
			(Math.sqrt(((Math.pow((-Math.pow(b,3))/(27*Math.pow(a,3))+
			((b*c)/(6*Math.pow(a,2)))-(d/2*a),2))
			+(Math.pow(((c/3*a)-((Math.pow(b,2))/9*Math.pow(a,2))),3))))))
			+ (Math.cbrt(
			(((-Math.pow(b,3))/(27*Math.pow(a,3)))+((b*c)/(6*Math.pow(a,2)))-(d/2*a))-
			(Math.sqrt(((Math.pow((-Math.pow(b,3))/(27*Math.pow(a,3))+
			((b*c)/(6*Math.pow(a,2)))-(d/2*a),2))
			+(Math.pow(((c/3*a))-((Math.pow(b,2))/9*Math.pow(a,2)),3)))))))
			- (b/3*a)));
			
			 return x;
			
		}
	} 
}

