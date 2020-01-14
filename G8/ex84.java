import java.util.*;
import java.io.*;

public class ex84 {

	static Scanner rd = new Scanner(System.in);
	static int dias = 5;
	static Temperatura[] temp = new Temperatura[dias];
	 
	public static void main (String[] args) {
		input();
		output(biggerAmplitude());	
	}
	
	public static void input()
	{
		double max, min, ampltd;
		for(int i = 0; i<5; i++)
		{
			System.out.printf("Dia %d: \n",i+1);
			
			while(true)
			{
				System.out.print("Temperatura máxima: ");
				max = rd.nextDouble();
				if (max >= -20 && max <= 50)
				{
					break;
				}
				else
				{
					System.out.println("Temperatura inválida");
				}
			}
			while(true)
			{
				System.out.print("Temperatura mínima: ");
				min = rd.nextDouble();
				if (min >= -20 && min <= 50 && min < max)
				{
					break;
				}
				else
				{
					System.out.println("Temperatura inválida");
				}
			}
			ampltd = max - min;
			
			temp[i] = new Temperatura(max,min,ampltd);
		}
	}
	public static int biggerAmplitude()
	
	{
		double ampl0, ampl1;
		int n = 0;
		ampl0 = 0;
		for (int i = 0; i < 5; i++)
		{
			ampl1 = Math.abs(temp[i].amplitude);
			if (ampl1>ampl0)
			{
				n = i;
				ampl0 = ampl1;
			}
		}
		return n;
		
	}
	
	public static void output(int n)
	{
		System.out.printf("A amplitude máxima foi %.2f no dia %d",temp[n].amplitude,n+1);
	}
}

class Temperatura
{
	double tMax, tMin, amplitude;
	
	//construtores
    Temperatura(double max, double min, double amplitude) 
    {
        this.tMax=max;
        this.tMin=min;
        this.amplitude=amplitude;
    }
}
