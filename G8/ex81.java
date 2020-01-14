import java.util.Scanner;

public class ex81 {
	
	static final Scanner sc = new Scanner(System.in);
  
	public static void main(String[] args) {
		Hora inicio;  // tem de definir o novo tipo Hora!
		Hora fim;
    
		inicio = new Hora();
		inicio.h = 9;
		inicio.m = 23;
		inicio.s = 5;
    
		System.out.print("Começou às ");
		printHora(inicio);  // crie esta função!
		System.out.println(".");
		System.out.println("Quando termina?");
		fim = lerHora();  // crie esta função!
		System.out.print("Início: ");
		printHora(inicio);
		System.out.print(" Fim: ");
		printHora(fim);
  }
  
	public static void printHora(Hora hr ) {
		System.out.printf("%02d:%02d:%02d",hr.h,hr.m,hr.s);
	}
	
	public static Hora lerHora()
	{
		Hora hr = new Hora();
		
		System.out.print("Horas? ");
		hr.h = sc.nextInt();
		while (!(hr.h >= 0 && hr.h <= 23))
		{
			System.out.println("Hora incorreta");
			System.out.print("Horas? ");
			hr.h = sc.nextInt();
		}
		
		System.out.print("Minutos? ");
		hr.m = sc.nextInt();
		while (!(hr.m >= 0 && hr.m <= 59))
		{
			System.out.println("Minutos incorretos");
			System.out.print("Minutos? ");
			hr.m = sc.nextInt();
		}
		
		System.out.print("Segundos? ");
		hr.s = sc.nextInt();
		while (!(hr.s >= 0 && hr.s <= 59))
		{
			System.out.println("Segundos incorretos");
			System.out.print("Segundos? ");
			hr.s = sc.nextInt();
		}
		return hr;
	}
}

	class Hora
	{
	int m, h, s;
	}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
