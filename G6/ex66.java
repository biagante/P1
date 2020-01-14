import java.util.*;

public class ex66 {
	
	static Scanner sc = new Scanner(System.in);
	static String frase;
	static boolean[] char_array = new boolean[26];
	
	public static void main (String[] args) {
		System.out.println("Inserir frase: ");
		frase = sc.nextLine();
		
		string_analise();
		output();
		
		
	}
	
	public static void string_analise()
	{
		for (int i = 0; i < frase.length(); i++)
		{
			char c = frase.charAt(i);
			char_analise(c);
		}
	}
	
	public static void char_analise(char c)
	{
		char x = 'a';
		for (int i = 0; i < 26; i++)
		{
			if (c == x)
			{
				char_array[i] = true;
			}
			x++;
			
		}
		
	}
	
	public static void output()
	{
		char[] letras = new char[26];
		char x = 'a';
		
		for (int i = 0; i < 26; i++)
		{
			letras[i] = x;
			x++;
		}		
		System.out.println("\nAs letras usadas foram: ");
		for (int i = 0; i < 26; i++)
		{
			if (char_array[i]==true)
			{
				System.out.printf("%s ",letras[i]);
			}
		}
		
	}
}

