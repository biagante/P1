import java.util.Scanner;

public class ex112 {
	
	public static void main (String[] args) {
		//scanner valores teclado
		Scanner sc = new Scanner(System.in);
		//valores entrada
		int temp;
		//valor saida
		int hh, mm, ss;
		//ler valor terminal
		System.out.print("Introduza o valor do tempo em segundos:");
		temp = sc.nextInt();
		
		//formula
		mm = temp/60;
		ss = temp%60;
		hh = mm/60;
		mm = mm%60;
		
		//output
		System.out.printf("%2d:%2d:%2d \n",hh,mm,ss); 
		sc.close();
	}
}

