import java.util.*;
import java.io.*;

public class tp2 {
	
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
		removerAL(al);
		terminAL(al);
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
		File fl = new File(name);
		Scanner scf = new Scanner(fl);
		int posicao = 0;
		while (scf.hasNextLine() && posicao < al.length)
		{
			String s = scf.nextLine();
			String[] p = removeSpace(s);
			
			al[posicao].nm = Integer.parseInt(p[0]);
			
			String nCompleto = "";
			for (int i = 1; i < p.length; i++)
			{
				nCompleto += p[i] + " ";
			}
			al[posicao].nome = nCompleto.trim();
			posicao++;
		}
	}
	
	public static String[] removeSpace(String s){
		String[] p = s.split("\\s+");
		return p;
	}
	
	public static Aluno[] addAluno(Aluno[] al){
		int index = 0;
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome != null)
			{
				index++;
			}
		}
		for (int i = 0; i < al.length; i++)
			{
				Scanner kb = new Scanner(System.in);
				System.out.print("Número Mecanográfico: ");
				al[index].nm = kb.nextInt();
				Scanner linha = new Scanner(System.in);
				System.out.print("Nome: ");
				al[index].nome = linha.nextLine();
				System.out.println();
				break;
			}
		
		return al;
	}
	
	public static void terminAL(Aluno[] al) {
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome != null)
			{
				System.out.println(al[i].nm + " " + al[i].nome);
			}
		}
		
	}
	
	public static void filtAL(Aluno[] al){
		Scanner find = new Scanner(System.in);
		System.out.print("Introduza o nome/conjunto de letras a procurar: ");
		String look = find.next();
		boolean exist = false;
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome!= null)
			{
				if ((al[i].nome).contains(look))
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
	
	public static Aluno[] removerAL(Aluno[] al){
		Scanner num = new Scanner(System.in);
		System.out.print("Introduza o número mecanográfico do aluno a remover: ");
		int look = num.nextInt();
		boolean exist = false;
		for (int i = 0; i < al.length; i++)
		{
			if (al[i].nm != 0 && al[i].nome!= null)
			{
				if ((al[i].nm) == look)
				{
					exist = true;
					int index = i;
					if (exist == true)
					{
						al[index].nm = 0;
						al[index].nome = null;
					}
				}	
			}	
		}
		return al;
	}
	
	public static void saveFile(Aluno[] al) throws FileNotFoundException{
		Scanner tc = new Scanner(System.in);
		System.out.print("Introduza o nome do ficheiro de destino: ");
		String fname = tc.nextLine();
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
