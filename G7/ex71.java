import java.util.Scanner;
import java.io.*;

public class ex71 {
	
	static Scanner sc = new Scanner(System.in);
	static File f1;
	static int erro;
	
	public static void main (String[] args) throws FileNotFoundException{
		
		do
		{
			System.out.print("Nome do ficheiro: ");
			String nome = sc.nextLine();
			erro = fich_valid(nome);
			
			if (erro == 1)
			{
				System.out.println("O ficheiro não existe");
			}
			else if (erro == 2)
			{
				System.out.println("O ficheiro não pode ser lido. Verifique as permissões");
			}
		} while (erro != 0);
		output();
	}
	
	public static int fich_valid(String nome) throws FileNotFoundException{
		erro = 0;
		//return 0 - existe
		//return 1 - não existe
		//return 2 - não pode ser lido
		f1 = new File(nome);
		if (f1.isFile() == false)
		{
			erro = 1;
		}
		else if (f1.canRead() == false)
		{
			erro = 2;
		}
		return erro;
	}
	
	public static void output() throws FileNotFoundException{
		Scanner f1S = new Scanner(f1);
		System.out.println();
		while (f1S.hasNextLine() == true)
		{
			System.out.println(f1S.nextLine());
		}
		System.out.println();
	}
}

