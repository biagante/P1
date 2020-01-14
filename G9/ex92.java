import java.util.*;

public class ex92
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		//teste para a função
		String c = "", b = "";
		c = acronimo("Organização das Nações Unidas");
		b = acronimo("Universidade de Aveiro");
		System.out.println(c);
		System.out.println(b);
		
		String a;
		while(true)
		{
			System.out.println("Introduza frase para formar acrónimo: ");
			String in = sc.nextLine();
			if (in.equals(""))
			{
				System.exit(0);
			}
			else
			{
				a = acronimo(in);
				System.out.println(a + "\n");
			}
		}	
		
	}
	
	public static String acronimo(String in)
	{
		String out = "";
		for (int i = 0; i < in.length(); i++)
		{
			if (Character.isUpperCase(in.charAt(i)))
			{
				out += in.charAt(i);
			}
		}
		return out;		
		
	}
}

