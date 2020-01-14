import java.util.*;
import java.io.*;

public class ex104 {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) throws FileNotFoundException {
		Aluno[] al = new Aluno[20];
		
		String fileName = "alunos.tab";
		Scanner fileIn = new Scanner(new File(fileName));
		int cheio = 0;
		while (fileIn.hasNextLine() && cheio < al.length)
		{
			String s = fileIn.nextLine();
			String[] p = s.split("\\s+");
			al[cheio] = new Aluno();
			al[cheio].numero = Integer.parseInt(p[0]);
			
			String nCompleto = "";
			for(int i = 1; i < p.length;i++){
				
				nCompleto += p[i] + " ";
			}
			al[cheio].nome = nCompleto.trim();

			cheio++;
		}
		
		fileIn.close();
		
		while (true)
		{
			System.out.print("Introduza um número mecanográfico: ");
			int num = rd.nextInt();
			
			if (num == 0)
			{
				System.exit(0);
			}
					
			for (int i = 0; i < al.length; i++)
			{
					
				if (num == al[i].numero)
				{
					System.out.printf("Nome: %s\n\n",al[i].nome);
					break;
				}
				
			}
			
		}
	}
}

class Aluno
{
	int numero;
	String nome;
}


