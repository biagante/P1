import java.util.Scanner;

public class ex111 {
	
	public static void main (String[] args) {
		//scanner para ler dados teclado
		Scanner sc = new Scanner(System.in);
		//variaveis entrada
		double dl; //valor em dolares
		double cv; //valor da taxa de conversao
		//variavel saida
		double eu;
		//ler dados terminal
		System.out.print("Valor em dólares para converter:");
		dl = sc.nextDouble();
		System.out.print("Valor da taxa de conversão:");
		cv = sc.nextDouble();
		//formula
		eu = cv*dl;
		
		System.out.printf("%4.1f dólares equivalem a %4.2f euros\n",dl,eu);
		sc.close();
	}
}

