import java.util.Scanner;
import java.lang.Math.*;

public class ex113 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//valores entrada
		double xa, ya; //valores A
		double xb, yb; // valores B
		//valor saida
		double dk; //dsitancia em km
		//valores teclado
		System.out.print("Coordenadas de A em centímetros \n");
		System.out.print("x:");
		xa = sc.nextDouble();
		System.out.print("y:");
		ya = sc.nextDouble();
		System.out.print("Coordenadas de B em centímetros \n");
		System.out.print("x:");
		xb = sc.nextDouble();
		System.out.print("y:");
		yb = sc.nextDouble();
		
		//formula
		double x = (xb -xa); 
		double y = (yb - ya);
		double d = (Math.sqrt((x*x)+(y*y))); //calculo da distancia
		dk = d/100; // fator da escala (neste caso 100 por ser Km)
		
		
		
		//output
		System.out.printf("A distância entres os pontos A e B é de %4.1f Km", dk);
		
	}
}

