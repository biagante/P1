import java.util.Scanner;

public class HelloWorld {
	
	public static void main (String[] args) {
		//scanner para ler dados do teclado
		Scanner sc = new Scanner(System.in);
		//variavel para nome a ser intriduzido 
		String nome;
		System.out.println("Insert name of whom you want to welcome: ");
		nome = sc.nextLine(); //armazena  dado fornecido na variavel iniciada
		//imprime output + nome inserido
		System.out.println("Hello World and " + nome);
		sc.close(); // fecha o scanner
		
		
		/*
		 * 
		 * isto é um comentário para teste
		 * 
		 */
	}
}

