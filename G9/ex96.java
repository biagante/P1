import java.util.*;

public class ex96 {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) {
		String frase0, frase1="";
		System.out.println("Insira uma frase: ");
		frase0 = rd.nextLine();
		
		for (int i = 0; i < frase0.length(); i++)
		{
			char c = frase0.charAt(i);
			
			if (c == 'l')
			{
				c = 'u';
			}
			if (c == 'r')
			{
				continue;
			}
			
			frase1 += c;
		}
		System.out.print(frase1);	
		
	}
}

