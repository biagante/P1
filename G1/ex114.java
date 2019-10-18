import java.util.Scanner;


public class ex114 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double A, B;
		//valore saida
		double C;
		double angle;
		//valores teclado
		System.out.print("Inserir o valor do cateto A:");
		A = sc.nextDouble();
		System.out.print("Inserir o valor do cateto B:");
		B = sc.nextDouble();
		
		//formulas
		double f = (A*A)+(B*B);
		C = Math.sqrt(f);
		angle = Math.toDegrees(Math.acos(A/C));
		
		//output
		System.out.printf("Valor da hipotenusa C : %4.2f \n",C);
		System.out.printf("Valor do ângulo entre o cateto A e a hipotenusa: %4.2f \n", angle);
		sc.close();
	}
}

