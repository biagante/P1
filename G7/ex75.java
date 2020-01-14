import java.util.*;
import java.io.*;

public class ex75 {
	
	static Scanner kb = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException
	{
		int comment = 0;
		
		System.out.print("Introduza o nome do ficheiro a ler: ");
		String nome = kb.nextLine();
		
		File fl = new File(nome);
		Scanner scf = new Scanner(fl);
		PrintWriter pw = new PrintWriter("copy.java");
		while (scf.hasNextLine())
		{
			String line = scf.nextLine();
			String[] words = line.split("\\s+");
			
			for (int i = 0; i < words.length; i++)
			{
				String word = words[i];
				
				if (word.length() == 0)
				{
					pw.print((" "));
					continue;
				}
				else if (word.length() >= 2)
				{
					comment = comment(word, comment);
					if (comment == 1)
					{
						comment = 0;
						break;
					}
					if (comment == 2)
					{
						break;
					}
					if (comment == 3)
					{
						comment = 0;
						break;
					}
				}
				pw.print((word + " "));
			}
			pw.println();
		}
		scf.close();
		pw.close();
	}
	
	public static int comment(String word, int comment)
	{
			boolean com_line, com_multiline0, com_multiline1;
			char c0 = word.charAt(0);
			char c1 = word.charAt(1);
			char cn = word.charAt((word.length()-1));
			char cm = word.charAt((word.length()-2));
			
			com_line = (c0 == '/' && c1 == '/');
			com_multiline0 = (c0 == '/' && c1 == '*');
			com_multiline1 = (cm == '*' && cn == '/');
			
			if (comment == 0 && com_line == true)
			{
				return 1;
			}
			if (comment == 0 && com_multiline0 == true)
			{
				return 2;
			}
			if (comment == 2 && com_multiline1 == false)
			{
				return 2;
			}
			if (comment == 2 && com_multiline1 == true)
			{
				return 3;
			}
			return comment;
	}	
	
}

