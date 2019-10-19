import java.util.Scanner;

public class ex312 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int d,m,ano,dd,i;
		int b,b1; //b espaços em branco sem dias
		String mes;  
		int u;
		
		System.out.print("Inserir data no formato (mm aaaa ds):");
		m=sc.nextInt();
		ano=sc.nextInt();
		d=sc.nextInt();
		mes=mes(m);
		
		//cabeçalho
		System.out.println("------------------------");
		System.out.printf("|    %8s  %4d   |\n",mes,ano);  
		System.out.println("------------------------");
		System.out.println("|  D  S  T  Q  Q  S  S |");
		System.out.println("------------------------");
		
		//Imprimir a primeira linha
		b=d-1;
		System.out.print("|");
		for(i=1;i<=b;i++){
			System.out.print("   ");
			}
		b1=7-b;
		dd=1;
		for(i=1;i<=b1;i++){
			System.out.printf(" 0%d",dd);
			dd++;
			}
		System.out.print(" |");
		
		//imprimir linhas internas
		int y=1,l;
		
		u=u(m,ano)+1;
		l=((b+u)/7)-1;
		do{
		System.out.print("\n| ");
		for(i=1;i<=7;i++){
			if(dd<10){
				System.out.printf("0%d ",dd);
			}else{
				System.out.printf("%d ",dd);
				}
			dd++;
			}
		System.out.print("|");
		y++;
		}while(y<4);
		
		//ultima linha
		int c=0;
		//u=u(m,ano)+1;
		System.out.print("\n| ");
		for(i=1;i<=7;i++){
			if(dd<10){
				System.out.printf("0%d ",dd);
			}else{
				System.out.printf("%d ",dd);
				}
			dd++;
			c++;
			
			if(dd==u){break;}
			}
			
			if (c==7){
				System.out.print("|");
			}else{
				for(i=c;i<=6;i++){
					System.out.print("   ");
					}
				System.out.print("|");
				}
		
		//rodape
		System.out.println("\n------------------------");
		
	}
	
	//função para determinar nome do mes
	public static String mes (int m) {
		
		String mes=""; 
		switch(m){
			
			case 1:
				mes="Janeiro";
				break;
			case 2:
				mes="Fevereiro";
				break;
			case 3:
				mes="Março";
				break;
			case 4:
				mes="Abril";
				break;
			case 5:
				mes="Maio";
				break;
			case 6:
				mes="Junho";
				break;
			case 7:
				mes="Julho";
				break;
			case 8:
				mes="Agosto";
				break;
			case 9:
				mes="Setembro";
				break;
			case 10:
				mes="Outubro";
				break;
			case 11:
				mes="Novembro";
				break;
			case 12:
				mes="Dezembro";
				break;
			
			}
		return mes;
	}

	//função para determinar ultimo dia dp mes
	public static int u (int m, int ano){
		int u;
		boolean bis,a;
		
		bis =(ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0);
		a =(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m ==12);
		
		if ( bis=true && m==2){u=29;}
		else if(a=true){u=31;}
		else if(bis=false && m==2){u=28;}
		else {u=30;}
		
		return u;
		}
}
