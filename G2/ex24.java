import java.util.Scanner;

public class ex24 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		int mes,ano;
		boolean bis,op;
		//ler valores teclado
		System.out.print("Inserir o mês (em número):");
		mes = sc.nextInt();
		System.out.print("Inserir o ano:");
		ano = sc.nextInt();
		
		//calculos
		//bis para ano bissexto
		bis = (((ano%4 == 0) && !(ano%100 == 0)) )|| (ano%400 == 0);
		//a para meses com 31 dias
		op = (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12);
		
		//output
		if ((bis == true) && (mes==2))
		{
			System.out.printf("O mes %d do ano %d tem 29 dias\n",mes,ano);
		}
		else if (bis == false && mes==2)
		{
			System.out.printf("O mes %d do ano %d tem 28 dias\n",mes,ano);
		}
		else if (op == true)
		{
			System.out.printf("O mes %d do ano %d tem 31 dias\n",mes,ano);
		}
		else
		{
			System.out.printf("O mes %d do ano %d tem 30 dias\n",mes,ano);
		}
		sc.close();
	}
}

