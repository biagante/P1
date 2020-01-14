import java.util.*;

public class ex93 {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Introduza uma frase: ");
		String in = rd.nextLine();
		
		int palav = countWords(in);
		System.out.println("Número de palavras -> " + palav);
	}
	
	public static int countWords(String in)
	{
		int cont = 0;
		
		String words[] = in.split("\\W+");
		
		// Here we separate a String based on non-word characters.
		// We use "\\W+" to mean this.
		//The pattern(\\) means "one or more non-word characters."
		// A plus means "one or more" and a W means non-word.
		
		cont = words.length;
		
		return cont;
	}
}

