import java.util.Scanner;

public class ex311 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,l=1,c,d;
		char letra = 'a';
		
		int a=0;
		do{
			System.out.print("Inserir um valor para I:");
			i=sc.nextInt();
		 
			if (i<=26&&i>=0)
			{
				a=1;
			} 
			else 
			{
				System.out.print("\n0 <= N <= 26\n\n");
			}
			}while(a==0);
		
		do{
			
			for(c=1;c<=i;c++)
			{
				
				d=c-1;
				letra= (char) ('a' + d);
				if(l<10){
					System.out.printf(" %c0%d",letra,l);
				}
				else
				{
					System.out.printf(" %c%d",letra,l);
				}
			}
			System.out.println();
			l++;
			
		}while(l<=i);
		
	}
}

