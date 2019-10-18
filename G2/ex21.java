import java.util.Scanner;

public class ex21 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double tpg1,tpg2,ei;
		//valores saida
		double nota;
		
		//valores teclado
		System.out.print("Valor da TPG1:");
		tpg1 = sc.nextDouble();
		System.out.print("Valor da TPG2:");
		tpg2 = sc.nextDouble();
		System.out.print("Valor da EI:");
		ei = sc.nextDouble();
		
		//calculos
		nota = 0.20*tpg1 + 0.30*tpg2 + 0.50*ei;
		
		if (nota >= 9.5)
		{
			System.out.printf("%4.2f/20  aluno APROVADO",nota);
		}
		else
		{
			System.out.printf("%4.2f/20  aluno REPROVADO",nota);
		}
		sc.close();
	}
}

