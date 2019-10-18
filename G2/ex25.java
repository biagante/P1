import java.util.Scanner;

public class ex25 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double xp1,yp1,xp2,yp2,xp3,yp3,xp4,yp4;
		//ler valores teclado
		System.out.print("Insira as coordenadas do primeiro ponto:\n");
		xp1 = sc.nextDouble();
		yp1 = sc.nextDouble();
		System.out.print("Insira as coordenadas do segundo ponto:\n");
		xp2 = sc.nextDouble();
		yp2 = sc.nextDouble();
		System.out.print("Insira as coordenadas do terceiro ponto:\n");
		xp3 = sc.nextDouble();
		yp3 = sc.nextDouble();
		System.out.print("Insira as coordenadas do quarto ponto:\n");
		xp4 = sc.nextDouble();
		yp4 = sc.nextDouble();
		
		//calculos
		double x1 = (xp2 -xp1); 
		double y1 = (yp2 - yp1);
		double da = (Math.sqrt((x1*x1)+(y1*y1))); //calculo da distancia
		double x2 = (xp3 -xp2); 
		double y2 = (yp3 - yp2);
		double db = (Math.sqrt((x2*x2)+(y2*y2))); //calculo da distancia
		
		//output
		if (da == db)
		{
			System.out.print("Os pontos formam um quadrado");
		}
		else
		{
			System.out.print("Os pontos não formam um quadrado");
		}
		sc.close();
	}
}

