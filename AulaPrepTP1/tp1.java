import java.util.*;

public class tp1 {
	
	public static void main (String[] args) {
		int[] notas = {4, 6, 7, 5, 4, 6, 6, 8, 11};
		int[] histo;
		double mediaf,mediat;
		System.out.printf("Introduza notas dos alunos(nota 0-10; 11 faltou): %n");
		notas = LerNotas(10);
		// lista notas
		listar(notas);
		
		// calcula histograma
		histo = Histograma(notas);
		
		// imprime histograma
		ImprimeHistograma(histo);
		
		// calcular média freq e total
		mediaf= Medias(notas,'f');
		mediat= Medias(notas,'t');
		
		//imprime medias
		System.out.printf("Média total = %.1f, ",mediat);
		System.out.printf("Média alunos freq. = %.1f",mediaf);
	}	
	
	public static void listar(int[] notas)
	{
		if (notas.length <= 0)
		{
			return;
		}
		else
			System.out.print("Lista notas: ");
			for (int n = 0; n < notas.length; n++)
			{
				System.out.printf(" %d,", notas[n]);
			}
			System.out.println();
	}
	
	public static int[] LerNotas(int numNotas) 
	{
		Scanner ler = new Scanner(System.in);
        int[] nota = new int[numNotas];
        int valor;
        for (int n = 0; n < numNotas; n++) {
            do {
                System.out.printf("Nota aluno %3d: ", n + 1);
                valor = ler.nextInt();
            } while (valor < 0 || valor > 11);
            nota[n] = valor;
        }
        return nota;
    }

	public static int[] Histograma(int[] notas)
	{
		int[] hist = new int[12];
		for (int nota : notas)
		{
			hist[nota]++;
		}
		return hist;
		
	}
	
	public static void ImprimeHistograma(int[] hist)
	{
		for (int i = 0; i <hist.length ; i++)
		{
			
			System.out.printf("Nota %3d: ",i+1);
			for (int c = 0; c < hist[i]; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static double Medias(int[] lista, char tipo)
	{
		int cont = 0;
		double soma = 0;
		int media;
		
		for (int i = 0; i < lista.length; i++)
		{
			if (lista[i]<11)
			{
				soma = soma + lista[i];
				cont++;
			}
			
		}
		if (tipo == 't')
		{
			cont = lista.length;
		}
		
		return (double)soma/cont;
	}

}

