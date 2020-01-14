import java.util.*;

public class ex102 {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int[] chaveIn = new int[6];
		int[] chavePr = new int[6];
		
		String chaveStr = "";
		
		chavePr = gerarChave(); //chave premiada
		
		System.out.println("Aposta de Totoloto");
		System.out.print("Chave : ");
		
        for(int i = 0; i < 6; i++)
        {
            chaveIn[i]=rd.nextInt();
        }
		
		chaveIn = ordenarBolha(chaveIn);//organiza chave
		
		mostrarChave(chaveIn); //print da chave
	}
	
	public static int[] gerarChave() {
		int[] chave = new int[6];
		int temp;
		
		for (int i = 0; i < 6; i++)
		{
			while (true)
			{
				temp = (int) ((Math.random()*48)+1);
				if (pertenceChave(temp, chave))
				{
					continue;
				}
				else
				{
					chave[i] = temp;
					break;
				}
			}
		}
		return chave;
	}
	
	public static boolean pertenceChave(int n, int[] seq) {
		int inicio = 0;
		int fim = seq.length-1;
		int meio;
		int valor = -1;
		
		do
		{
			meio = ((inicio + fim)/2);
			if (n > seq[meio])
			{
				inicio = meio + 1;
			}
			else if (n < seq[meio])
			{
				fim = meio - 1;
			}
			else
			{
				valor = meio;
			}
		} while (valor == -1 && inicio <= fim);
		
		if (valor != -1)
		{
			return true;
		}
		return false;
	
	}
	
	public static int[] ordenarBolha(int[] seq) {
		int n = seq.length;
		int tmp, i, j;
		int nlo = 0;
		boolean trocas;
		
		do
		{
			trocas = false;
			for (i = 0; i < n - 1 - nlo; i++)
			{
				if(seq[i] > seq[i+1]) { tmp = seq[i];
                    seq[i] = seq[i+1]; 
                    seq[i+1] = tmp; 
                    trocas = true;
                } 
            }
			nlo++;
		} while (trocas);
		return seq;
	}
      
	
	public static void mostrarChave(int[] chave) {
		String chaveString = "";
		
		for (int i = 0; i < 6; i++)
		{
			chaveString += chave[i];
			if (i < 5)
			{
				chaveString += ", ";
			} 
		}
		
		System.out.println("\n   Aposta de Totoloto");
		System.out.printf("Chave: %s\n",chaveString);
		
		for (int i = 1; i < 50; i++)
		{
			if (pertenceChave(i, chave))
			{
				System.out.print("  X ");
			}
			else
			{
				System.out.printf(" %2d ",i);
			}
			if ((i%7)==0)
			{
				System.out.println();
			}
		}
		
	}
}

