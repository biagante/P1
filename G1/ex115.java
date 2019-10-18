import java.util.Scanner;


public class ex115 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double tp1, tp2, api, ep;
		double tf1, tf2, apf, epf;
		//valor saida
		double nfinalp, nfinalv;
		//ler valores terminal
		System.out.print("Nota da componente TP1:");
		tp1 = sc.nextDouble();
		System.out.print("Nota da componente TP2:");
		tp2 = sc.nextDouble();
		System.out.print("Nota da componente API:");
		api = sc.nextDouble();
		System.out.print("Nota da componente EP:");
		ep = sc.nextDouble();
		
		//calculos
		tf1 = tp1*0.15;
		tf2 = tp2*0.15;
		apf = api*0.30;
		epf = ep*0.40;
		
		nfinalv = tf1+tf2+apf+epf;
		nfinalp = ((nfinalv*100)/20);
		
		
		//outuput
		System.out.printf("Nota final do aluno: %4.2f/20\n",nfinalv);
		System.out.printf("Nota final do aluno: %4.2f/100",nfinalp);
		sc.close();
	}
}

