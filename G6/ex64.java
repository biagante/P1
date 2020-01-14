import java.util.*;

public class ex64 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int[] array_notas, array_notas_temp;
	static int[] array_hist = new int[21];
	static int pos_max = 0;
	static int nTimes_max = 0;
	
	public static void main (String[] args) {
		int a;
		System.out.print("Quantas notas serão introduzidas?  ");
		int n = sc.nextInt();
		array_notas_temp = new int[n];
		
		System.out.println("Introduza as notas: ");
		for (int i = 0; i < n; i++)
		{
			a = sc.nextInt();
			if (a>=0 || a <=20)
			{
				array_notas_temp[i] = a;
			}
			else
			{
				System.out.printf("%d é inválida e será ignorada e o array será atualizado");
				n--;
			}
			
		}
		
		//versão final do array com dados atualizados e validos
		array_notas = new int[n];
		
		for (int i = 0; i < array_notas_temp.length; i++)
		{
			array_notas[i] = array_notas_temp[i];
		}
		
		analise();
		
	}
	public static void analise() {
        int a=0;

        for(int i=0;i<array_notas.length;i++) {
            a=array_notas[i];

            switch(a) {
                case 0: array_hist[0]++; break;
                case 1: array_hist[1]++; break;
                case 2: array_hist[2]++; break;
                case 3: array_hist[3]++; break;
                case 4: array_hist[4]++; break;
                case 5: array_hist[5]++; break;
                case 6: array_hist[6]++; break;
                case 7: array_hist[7]++; break;
                case 8: array_hist[8]++; break;
                case 9: array_hist[9]++; break;
                case 10: array_hist[10]++; break;
                case 11: array_hist[11]++; break;
                case 12: array_hist[12]++; break;
                case 13: array_hist[13]++; break;
                case 14: array_hist[14]++; break;
                case 15: array_hist[15]++; break;
                case 16: array_hist[16]++; break;
                case 17: array_hist[17]++; break;
                case 18: array_hist[18]++; break;
                case 19: array_hist[19]++; break;
                case 20: array_hist[20]++; break;
            }
        }

        for (int i=0;i<21;i++) 
        {
            if(array_hist[i]>nTimes_max) 
            {
                nTimes_max=array_hist[i];
                pos_max=i;
            }
    
        }
        
        histograma();
    }
	
	public static void histograma()
	{
		System.out.println("\nHistograma de notas");
		
		for (int i = 0; i < 55; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		
		for (int i = 20; i>=0; i--)
		{
			if (i<10)
			{
				System.out.printf("%2d | %s\n",i,printNtimes(i));
			}
			else
			{
				System.out.printf("%2d | %s\n",i,printNtimes(i));
			}
		}
		
	}
	
	public static String printNtimes(int posicao)
	{
		int nTimes = array_hist[posicao];
		String s = "";
		int y;
		
		//y = (array_hist[posicao]); 
		//-> calcula histograma com n de notas introduzidas 
		
		y = ((array_hist[posicao]*50)/array_hist[pos_max]);
		//->valor maximo do histograma == 50 astetriscos
		
		for (int i = 0; i < y; i++)
		{
			s = s + "*";
		}
		 return s;
	}
}

