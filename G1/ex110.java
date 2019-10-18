import java.util.Scanner;

public class ex110 {
	
	public static void main (String[] args) {
		//scanner para ler valores do teclado
		Scanner sc = new Scanner(System.in);
		double cl; //variavel para valor em Celsius
		double fr; //variavel para valor em Fahrenheit
		//ler os dados no terminal
		System.out.print("Temperatura em Celsius:");
		cl = sc.nextDouble();
		//calcular a conversao
		fr = ((1.8)*(cl)+32);
		
		//escrever os resultados
		System.out.printf("%4.1f ºCelsius é equivalente a %4.1f ºFahrenheit\n", cl, fr);
		sc.close();
		
	}
}

