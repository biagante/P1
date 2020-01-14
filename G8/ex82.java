import java.util.*;

public class ex82 {
	
	static Scanner sc = new Scanner(System.in);
	static double pontosx[] = new double[100];
	static double pontosy[] = new double[100];
	static int nPontos;
		
	public static void main (String[] args) 
	{
		double soma = 0;
		double dist1, dist0 = 0;
		Ponto2D ponto0 = new Ponto2D();
		Ponto2D pontomax = new Ponto2D();
		ponto0.x = 0;
		ponto0.y = 0;
		
		lerPonto();
		
		for (int i = 0; i < nPontos; i++)
		{
			Ponto2D ponto1 = new Ponto2D();
			ponto1.x = pontosx[i];
			ponto1.y = pontosy[i];
			dist1 = distPontos(ponto0, ponto1);
			
			if (dist1 > dist0)
			{
				pontomax = ponto1;
			}
			dist0 = dist1;
			soma += dist1;
		}
		
		System.out.printf("A soma da distância dos %d pontos à origem é %.1f\n", nPontos,soma);
		System.out.printf("O ponto mais afastado da origem foi: ");
		printPonto(pontomax);
		
	}
	
	public static void lerPonto()
	{
		Ponto2D ponto = new Ponto2D();
		nPontos = 0;
		do{
			System.out.println("Introduza um ponto: ");
			System.out.print("Coordenada de x: ");
			ponto.x =sc.nextInt();
			System.out.print("Coordenada de y: ");
			ponto.y = sc.nextInt();
			
			if (ponto.x != 0 || ponto.y!= 0)
			{
				pontosx[nPontos] = ponto.x;
				pontosy[nPontos] = ponto.y;
				nPontos++;
			}
		}while (ponto.x != 0 || ponto.y != 0);
	}
	
	public static double distPontos(Ponto2D ponto0, Ponto2D ponto1){
		double dist;
		dist = Math.sqrt(Math.pow((ponto1.x - ponto0.x),2) + Math.pow((ponto1.y - ponto0.y),2) );
		return dist;
	}
	
	public static void printPonto(Ponto2D ponto) 
	{
		System.out.printf("(%.1f  ,  %.1f)",ponto.x,ponto.y);
	}
}

class Ponto2D
{
	double x, y;	
}
