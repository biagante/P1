import java.util.Scanner;


public class ex116 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valor entrada
		double dg; //dinheiro gasto dia 1
		//valor saida
		double d5; //dinheiro gasto ao fim de 4 dias 
		
		//valor teclada
		System.out.print("Valor que o turista gastou no primeiro dia:");
		dg = sc.nextDouble();
		
		//calculos
		double d2, d3, d4;
		d2= dg + (0.20*dg);
		d3 = d2 + (0.20*d2);
		d4 = d3 + (0.20*d3);
		d5 = dg + d2 + d3 + d4;
		
		//output 
		System.out.printf("Valor que o turista gastou ao fim de 4 dias: %4.2f ",d5);
	}
}

