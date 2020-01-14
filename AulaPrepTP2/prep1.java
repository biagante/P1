import java.util.*;
import java.io.*;

public class prep1 {
		
		static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		//Inicializar array
		Aluno[] al = saveSpace(20);
		int cheio = 0;
		
		// Ler informação do ficheiro
		String fileName = "turma.txt";
		Scanner fileIn = new Scanner(new File(fileName));
		
		while (fileIn.hasNextLine() && cheio < al.length)
		{
			String s = fileIn.nextLine();

			String[] p = s.split("\\s+");
			
			al[cheio].nm = Integer.parseInt(p[0]);
			
			String nCompleto = "";
			
			for(int i = 1; i < p.length;i++){
				
				nCompleto += p[i] + " ";
			}

			al[cheio].nome = nCompleto.trim();

			cheio++;
		}
		
		fileIn.close();
		
		while(true)
		{
			System.out.println();
			System.out.println("1 - Adicionar um aluno");
			System.out.println("2 - Copiar informação do array");
			System.out.println("3 - Guardar informação dos alunos num ficheiro  ");
			System.out.println("4 - Imprimir informação contida no array");
			System.out.println("5 - Terminar o programa");
			System.out.print("Opção -> ");
			int op = rd.nextInt();
			
			if (op < 0 || op > 5 )
			{
				System.out.println("Opção inválida");
				System.out.print("Opção -> ");
				op = rd.nextInt();
			}
			
			switch (op)
			{
				case 1:
					Scanner kb = new Scanner(System.in);
					System.out.println("Introduza um aluno novo");
					System.out.print("N,º mecanográfico: ");
					al[cheio].nm = rd.nextInt();
					System.out.print("Nome: ");
					al[cheio].nome = kb.nextLine();
					cheio++;
					break;
				case 2:
					copyInfo(al);
					break;
				case 3:
					saveFich(al);
					break;
				case 4:
					for (int i = 0; i < al.length; i++)
					{
						if (al[i].nm != 0 )
						{
							System.out.println(al[i].nm +" "+ al[i].nome);
						}
						
					}
					
					break;
				default:
					System.exit(0);
			}
		}
		
		

		
	}
	
	public static Aluno[] saveSpace(int n){
		
		Aluno[] al = new Aluno[n];

		for (int i = 0; i < al.length; i++)
		{
			al[i] = new Aluno();
		}
		
		return al;
		
	}
	
	public static void copyInfo(Aluno[] data) {
		Aluno[] copia = new Aluno[data.length];
		for (int i = 0; i < data.length; i++)
		{
			copia[i] = data[i];
		}
		System.out.println("Array copiado com sucesso");
		
	}
	
	public static void saveFich(Aluno[] al) throws IOException {
		System.out.print("Introduza o nome do ficheiro de destino: ");
		String fileNameout = rd.next();
		File fout = new File(fileNameout);
		PrintWriter pw = new PrintWriter(fout);
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 )
			{	
				pw.println(al[i].nm +" "+ al[i].nome);
			}
		}
		pw.close();
	}
	
}

class Aluno	{
	int nm;
	String nome;
}
