import java.util.Scanner;

public class ex29 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//variaveis entrada
		double tempint;
		int op;
		//variavel saida
		double tempconv;
		
		//ler valores teclado
		System.out.print("Insira a temperatura: ");
		tempint = sc.nextDouble();
		System.out.print("\nTipos de temperatura:\n");
		System.out.print("0 - Celsius | 1 - Fahrenheit\n");
		System.out.print("\nSelecione o tipo de temperatura lida:");
		op = sc.nextInt();
		
		//calculos
		if (op == 0)
		{
			tempconv = 1.8*tempint +32;
			System.out.printf("%4.2f ºCelsius é equivalente a %4.2f ºFahrenheit",tempint,tempconv);
		}
		else
		{
			tempconv = (tempint-32)/1.8;
			System.out.printf("%4.2f ºFahrenheit é equivalente a %4.2f ºCelsius",tempint,tempconv);
		}
		sc.close();
	}
}

