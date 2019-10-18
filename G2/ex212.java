import java.util.Scanner;

public class ex212 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//valores entrada
		double xp1,yp1,xp2,yp2,xp3,yp3,xp4,yp4;
		double xv1,yv1,xv2,yv2,xv3,yv3,xv4,yv4;
		//ler valores teclado
		System.out.print("Insira as coordenadas do primeiro ponto do quadrado 1:\n");
		xp1 = sc.nextDouble();
		yp1 = sc.nextDouble();
		System.out.print("Insira as coordenadas do segundo ponto do quadrado 1:\n");
		xp2 = sc.nextDouble();
		yp2 = sc.nextDouble();
		System.out.print("Insira as coordenadas do terceiro ponto do quadrado 1:\n");
		xp3 = sc.nextDouble();
		yp3 = sc.nextDouble();
		System.out.print("Insira as coordenadas do quarto ponto do quadrado 1:\n");
		xp4 = sc.nextDouble();
		yp4 = sc.nextDouble();
		System.out.print("Insira as coordenadas do primeiro ponto do quadrado 2:\n");
		xv1 = sc.nextDouble();
		yv1 = sc.nextDouble();
		System.out.print("Insira as coordenadas do segundo ponto do quadrado 2:\n");
		xv2 = sc.nextDouble();
		yv2 = sc.nextDouble();
		System.out.print("Insira as coordenadas do terceiro ponto do quadrado 2:\n");
		xv3 = sc.nextDouble();
		yv3 = sc.nextDouble();
		System.out.print("Insira as coordenadas do quarto ponto do quadrado 2:\n");
		xv4 = sc.nextDouble();
		yv4 = sc.nextDouble();
		
		//calculos
		double x1 = (xp2 -xp1); 
		double y1 = (yp2 - yp1);
		
		//Math.pow(a,2) -- elevar um número ao quadrado
		
		double da = (Math.sqrt((x1*x1)+(y1*y1))); //calculo da distancia
		double x2 = (xp3 -xp2); 
		double y2 = (yp3 - yp2);
		double db = (Math.sqrt((x2*x2)+(y2*y2))); //calculo da distancia
		double x3 = (xv2 -xv1); 
		double y3 = (yv2 - yv1);
		double dc = (Math.sqrt((x3*x3)+(y3*y3))); //calculo da distancia
		double x4 = (xv3 -xv2); 
		double y4 = (yv3 - yv2);
		double dd = (Math.sqrt((x4*x4)+(y4*y4))); //calculo da distancia

		
		//output
		if (da == db && dc == dd)
		{
			System.out.print("Os pontos formam dois quadrados\n");
			if (xv1<=xp1|| yv1<=yp1)
			{
				System.out.print("Os quadradros intersetam-se");
			}
			else
			{
				System.out.print("Os quadradros não se intersetam");
			}
		}
		else
		{
			System.out.print("Os pontos não formam quadrados");
		}
		sc.close();
	}
}

