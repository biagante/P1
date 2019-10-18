import java.util.Scanner;

public class ex210 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		int dia,mes,ano;
		boolean bis,op;
		//valores saida
		int dia1,dia2,mes2,ano2;
		//ler valores teclado
		System.out.print("Inserir o dia: ");
		dia = sc.nextInt();
		System.out.print("Inserir o mês (em número): ");
		mes = sc.nextInt();
		System.out.print("Inserir o ano: ");
		ano = sc.nextInt();
		
		//calculos
		//bis para ano bissexto
		bis = (ano%4 == 0 && ano%100 != 0 || ano%400 == 0);
		//a para meses com 31 dias
		op = (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12);
		
		//output
		if (dia == 31)
		{
			if (mes == 12)
			{
				ano2 = ano+1;
				mes2 = 1;
				dia2 = 1;
				dia1 = dia -1;
				System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
				System.out.printf("O dia anterior é %d-%d-%d",dia1,mes,ano);
			}
			else
			{
				ano2 = ano;
				mes2 = mes+1;
				dia2 = dia +1;
				dia1 = dia-1;
				System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
				System.out.printf("O dia anterior é %d-%d-%d\n",dia1,mes,ano);
			}
		}
		
		else if (dia == 29 && bis == true && mes==2)
		{
			    ano2 = ano;
				mes2 = mes+1;
				dia2 = 1;
				dia1 = dia-1;
				System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
				System.out.printf("O dia anterior é %d-%d-%d\n",dia1,mes,ano);
		}
		else if (dia == 28 && bis == false && mes==2)
		{
			ano2 = ano;
			mes2 = mes+1;
			dia2 = 1;
			dia1 = dia-1;
			System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
			System.out.printf("O dia anterior é %d-%d-%d\n",dia1,mes,ano);
		}
		else if (dia == 30)
		{
			ano2 = ano;
			mes2 = mes+1;
			dia2 = 1;
			dia1 = dia-1;
			System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
			System.out.printf("O dia anterior é %d-%d-%d\n",dia1,mes,ano);
		}
		else
		{
			ano2 = ano;
			mes2 = mes;
			dia2 = dia+1;
			dia1 = dia-1;
			System.out.printf("O dia seguinte é %d-%d-%d\n",dia2,mes2,ano2);
			System.out.printf("O dia anterior é %d-%d-%d\n",dia1,mes,ano);
		}
		
		if (bis == true && mes==2)
		{
			System.out.printf("O mes %d do ano %d tem 29 dias\n",mes,ano);
		}
		else if (mes==2)
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

