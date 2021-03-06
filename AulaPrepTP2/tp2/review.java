import java.util.*;
import java.io.*;

public class review {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) throws FileNotFoundException{
		Aluno[] al = arraySpace();
		readFile(al);
		System.out.println("Deseja adicionar um aluno à turma? 1-sim, 0-não");
		System.out.print("Opção -> ");
		int op = rd.nextInt();
		if (op == 1)
		{
			addAluno(al);
		}
		terminAL(al);
		filtAL(al);
		saveFile(al);
	}

	public static Aluno[] arraySpace(){
		Aluno[] al = new Aluno[20];
		for (int i = 0; i < al.length; i++)
		{
			al[i] = new Aluno();
		}
		return al;
	}
	
	public static void readFile(Aluno[] al) throws FileNotFoundException {
		String name = "turma.txt";
		File f1 = new File(name);
		Scanner fileIn = new Scanner(f1);
		int cheio = 0;
		while (fileIn.hasNextLine() && cheio < al.length)
		{
			String s = fileIn.nextLine();
			String[] p = removeSpace(s);
			
			al[cheio].nm = Integer.parseInt(p[0]);
			
			String nComp = "";
			for (int i = 1; i < p.length; i++)
			{
				nComp += p[i] + " ";
			}
			al[cheio].nome = nComp.trim();
			cheio++;
		}
	}

	public static String[] removeSpace(String s){
		String[] p = s.split("\\s+");
		return p;
	}
	
	public static Aluno[] addAluno(Aluno[] al){
		Scanner info = new Scanner(System.in);
		int unidade = 0;
		
		for (int i = 0; i < al.length; i++)
		{
			if (al[i] != null)
			{
				unidade++;
			}
			System.out.print("Número mecanográfico: ");
			al[unidade].nm = rd.nextInt();
			System.out.print("Nome: ");
			al[unidade].nome = info.nextLine();
			break;
		}		
		return al;
	}
	
	public static void terminAL(Aluno[] al) {
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome != null )
			{
				System.out.println(al[i].nm +" " +al[i].nome);
			}
		}
	}
	
	public static void filtAL(Aluno[] al){
		Scanner find = new Scanner(System.in);
		System.out.print("Introduz o nome a procurar: ");
		String n = find.next();
		boolean exist = false;
		
		for (int i = 0; i < al.length; i++)
		{	
			if(al[i].nm != 0 && al[i].nome != null)
			{
				if ((al[i].nome).contains(n))
				{
					exist = true;
					int index = i;
					if (exist == true)
					{
						System.out.println(al[index].nm + " " + al[index].nome);
					}
				}
			}
		}
	}
	
	public static void saveFile(Aluno[] al) throws FileNotFoundException{
		Scanner tc = new Scanner(System.in);
		System.out.print("Introduza o nome do ficheiro de destino: ");
		String fname = tc.next();
		File fout = new File(fname);
		PrintWriter pw = new PrintWriter(fname);
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome != null)
			{
				pw.println(al[i].nm + " " + al[i].nome);
			}
			
		}
		pw.close();
		tc.close();
	}
}

class Aluno{
	int nm;
	String nome;
}
