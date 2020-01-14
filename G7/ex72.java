import java.util.*;
import java.io.*;

public class ex72 {
	
	static Scanner sc = new Scanner(System.in);
	static File f1;
	public static void main (String[] args) throws IOException 
	{		
		f1 = new File(args[0]);
		f1_valid(f1);
		lerNumero(f1);
	}
	
	public static void f1_valid(File f1) throws FileNotFoundException{
		if (f1.isFile() == false)
		{
			System.out.println("O ficheiro não existe");
			System.exit(1);
		}
		else if (f1.canRead() == false)
		{
			System.out.println("O ficheiro não pode ser lido");
			System.exit(1);
		}
		else
		{
			System.out.println("O ficheiro é valido");
		}
	}
	
	public static void lerNumero(File f1) throws IOException
	{
		int n;
		int c = 0;
		Scanner scf = new Scanner(f1);
		while (scf.hasNextLine() && c < 100)
			{
				n = scf.nextInt();
				if (n>0)
				{
					c++;
					System.out.println(c);
				}
			}
	
		
		scf.close();
	
	}
}

