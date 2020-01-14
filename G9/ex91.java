import java.util.*;
import java.awt.*;

public class ex91 {
	
	static Scanner kb = new Scanner(System.in);
	
	public static void main (String[] args) {
		f1();
	}
	
	public static void f1()
	{
		int upper = 0, lower = 0, digit = 0;
		System.out.println("Análise de uma frase");
		System.out.print("Frase de entrada -> ");
		String in = kb.nextLine();
		int vog = 0, con = 0;
		
		for (int i = 0; i < in.length(); i++)
		{
			if (Character.isUpperCase(in.charAt(i)))
			{
				upper++;
				if (!isVowel(in.charAt(i)))
				{
					con++;
				}
			}
			if (Character.isLowerCase(in.charAt(i)))
			{
				lower++;
				if (!isVowel(in.charAt(i)))
				{
					con++;
				}
			}
			if (Character.isDigit(in.charAt(i)))
			{
				digit++;
			}
			
			if (isVowel(in.charAt(i)))
			{
				vog++;
			}
			
		}
		
		System.out.println("Número de caracteres minúsculos -> " + lower);
		System.out.println("Número de caracteres maiúsculos -> " + upper);
		System.out.println("Número de caracteres numéricos -> " + digit);
		
		System.out.println("Número de vogais -> " + vog);
		System.out.println("Número de consoantes -> " + con);
		
	}
	public static boolean isVowel(char c)
	{
		int vog = 0, con = 0;
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			return true;
		}
		if ( c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

