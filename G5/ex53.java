import java.util.Scanner;

public class ex53 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int ano,mes;
		boolean bis;
		
		mes = mes();
		ano = ano();
		bis = bis(ano);
		
		if ( bis=true && mes==2){
			 System.out.printf("O mes %d do ano %d tem 29 dias\n",mes,ano);
		 }else if (bis=false && mes==2) {
			 System.out.printf("O mes %d do ano %d tem 28 dias\n",mes,ano);
		} else if( mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12){
			 System.out.printf("O mes %d do ano %d tem 31 dias\n",mes,ano);
		 } else if( mes==4 || mes==6 || mes==9 || mes==11) {
			 System.out.printf("O mes %d do ano %d tem 30 dias\n",mes,ano);
		 }	
		 System.out.print(bis);	
	}
	
	public static boolean bis(int ano){
		if ((((ano%4 == 0) && !(ano%100 == 0)) )|| (ano%400 == 0)) return true;
		else return false;		
	}
	
	public static int mes(){
		System.out.print("Inserir mês: ");
		int mes = sc.nextInt();
		
		while (mes<1 | mes>12)
		{
			System.out.println("Mês inválido");
			System.out.print("Inserir mês: ");
			mes = sc.nextInt();
		}
		return mes;
	}
		
	public static int ano(){
		System.out.print("Inserir ano: ");
		int ano = sc.nextInt();
		while (ano <0)
		{
			System.out.println("Ano inválido");
			System.out.print("Inserir ano: ");
			ano = sc.nextInt();
		}
		return ano;
	}
}

