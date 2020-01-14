import java.util.*;
import java.io.*;
import java.awt.*;

public class ex85 {
	
	static Scanner rd = new Scanner(System.in);
	static TAS person = new TAS();
	static double taxa;
	
	public static void main (String[] args) {
		input();
		taxa();
		output();
	}
	public static void input() 
	{
		System.out.print("Nome: ");
		person.nome = rd.nextLine();
		
		while (true)
		{
			System.out.print("Sexo(m/f): ");
			person.sexo = rd.nextLine().charAt(0);
			if (person.sexo == 'm' || person.sexo == 'f')
			{
				break;
			}
			else
			{
				System.out.println("Sexo inválido");
			}
		}
		while (true)
		{
			System.out.print("Massa: ");
			person.mass = rd.nextDouble();
			if (person.mass > 0)
			{
				break;
			}
			else
			{
				System.out.println("Massa inválida");
			}
		}
		
        while(true){
            System.out.print("Quantidade de bebida ingerida(ml):");
            person.qtd=rd.nextDouble();
            if(person.qtd>0) 
            {
				break;
			}
            else  
            {
				System.out.println("Quantidade inválida");
			}
        }
		while (true)
		{
			System.out.print("Teor alcoólico: ");
			person.teor = rd.nextDouble();
			if (person.teor > 0)
			{
				break;
			}
			else
			{
				System.out.println("Teor inválido");
			}
		}
		while (true)
		{
			System.out.print("Consumida em jejum(s/n): ");
			String resp;
			do resp = rd.nextLine(); while(resp.length() == 0);
			if (resp.equals("s"))
			{
				person.jejum = true;
				break;
			}
			else if (resp.equals("n"))
			{
				person.jejum = false;
				break;
			}
			else
			{
				System.out.println("Resposta inválida");
			}
		}
	}
	
	public static void taxa()
	{
		double coef = 0;
		double densidade = 0.8;
		if (person.jejum=true)
		{
			if (person.sexo == 'm')
			{
				coef = 0.7;
			}
			if (person.sexo == 'f')
			{
				coef= 0.6;
			}
		}
		else
		{
			coef = 1.1;
		}
		taxa = ((densidade*person.qtd*(person.teor/100))/(person.mass*coef));
	}
	
	public static void output()
	{
		System.out.println();
		System.out.println(person.nome);
		System.out.printf("Taxa de alcoolemia: %.2f",taxa);
	}
}

class TAS
{
	String nome;
	char sexo;
	double mass, qtd, teor;
	boolean jejum = true;
	
}
