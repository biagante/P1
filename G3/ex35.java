import java.util.Scanner;

public class ex35 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=3,b=4,c,cont=0;
		System.out.printf("A	B	C\n");
		System.out.println("-------------------");
		c=pitagoras(a,b);
		do{
			do{
				c=pitagoras(a,b);
					//verifica se c é inteiro. em caso positivo escreve os valores de a,b e c
					if((c==(int)c)&&c!=0)
					{ 
					System.out.printf("%d	%d	%d\n",(int)a,(int)b,(int)c);
					b++;
					}
					else
					{
						b++;
					}
			}while(b<100);
			a++;
			b=a;

		}while(a<100);
	}
	public static double pitagoras(double x, double y){
		double hip=0;
		if(x<y)
		{
			hip=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		}
		return hip;
	}
	
}

