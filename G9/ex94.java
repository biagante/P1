import java.util.*;
import java.io.*;

public class ex94 {
	
	static Scanner rd = new Scanner(System.in);
	static String patterns[] = {"AA0000","00AA00","0000AA"};
		
	public static void main (String[] args) {
		boolean patt = false;
		
		System.out.print(" Inserir matrícula: ");
		String matricula = rd.nextLine();
		matricula = matricula.replaceAll("[-+.^:,\\s+]","");
		//remove espacos em braco e simbolos
		
		if (matricula.length()!=6)
		{
			System.out.print("Matrícula inválida");
			System.exit(2);
		}
		
		for (int i = 0; i < 3; i++)
		{
			patt = matchPattern(matricula,patterns[i]);
			if (patt == true)
			{
				break;
			}
		}
		
		matricula = matricula.substring(0,2) + "-" + matricula.substring(2,4) + "-" + matricula.substring(4,6);
		if (patt =false)
		{
			System.out.printf("Matrícula %s inválida",matricula);
		}
		else
		{
			System.out.printf("Matrícula %s válida",matricula);
		}
	}
	
	public static boolean matchPattern(String matricula, String pattern)
	{
		String mFingerprint = "";
		char c;
		
		for (int i = 0; i < matricula.length(); i++)
		{
			c = matricula.charAt(i);
			if (Character.isLetter(c))
			{
				mFingerprint += "A";
			}
			if (Character.isDigit(c))
			{
				mFingerprint += "0";
			}
		}
		
		if (mFingerprint.equals(pattern))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

