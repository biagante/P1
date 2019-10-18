import java.util.Scanner;

public class ex117 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double vprod, vdisc, vIva;
		//valores saida
		double totlq;
		
		//valor teclado
		System.out.print("Valor dos produtos: ");
		vprod = sc.nextDouble();
		System.out.print("Valor do desconto oferecido (em percentagem): ");
		vdisc = sc.nextDouble();
		System.out.print("Valor da taxa do IVA (em percentagem): ");
		vIva = sc.nextDouble();		
		
		//calculos 
		totlq = vprod - (vprod*(vdisc/100)) + (vprod*(vIva/100));
		
		//output
		System.out.printf("Valor total líquido da fatura: %4.2f ",totlq);
		sc.close();
	}
}

