import java.util.*;

public class ex95 {
	
	static Scanner rd = new Scanner(System.in);
	
	public static void main (String[] args) {
		int numero;
		int base;
		System.out.print("Insira um número: ");
		numero = rd.nextInt();
		System.out.print("Insira a base do número introduzido: ");
		base = rd.nextInt();
		
		numToBase(numero,base);
			
	}
	public static void numToBase(int numero, int base)
	{
		int resto;
		String ans = "";
		do
		{
			resto = numero % base;
			numero = numero / base;
			ans = resto + ans;
		} while (numero != 0);
		
		System.out.print(ans);
	}
}

