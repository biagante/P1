import java.util.Scanner;

// Complete o programa
public class DoStats {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    // Cria um registo de estatisticas:
    Statistics xstat = new Statistics();
    
    // Enquanto houver um valor para ler:
    while (sc.hasNextDouble()) {
      // Lê um valor:
      double x = sc.nextDouble();
      // Atualiza o registo de estatisticas:
      updateStats(xstat, x);
    }
    
    // Escreve resultados:
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
    if (xstat.num > 0) {
      System.out.printf("min = %f\n", xstat.min);
      System.out.printf("max = %f\n", xstat.max);
      System.out.printf("média = %f\n", mean(xstat));
      System.out.printf("variancia = %f\n", variance(xstat));
    } else {
      System.out.printf("Lista vazia!");
    }
  }

  // Definir funções updateStats, mean e variance!
  public static void updateStats(Statistics xstat, double x)
  {
	  xstat.num++;
	  if (x < xstat.min)
	  {
		  xstat.min = x;
	  }
	  if (x > xstat.max)
	  {
		  xstat.max = x;
	  }
	  xstat.sum += x;
	  xstat.sum2 += Math.pow(x,2);
  }
  
  public static double mean(Statistics xstat)
  {
	  double mean;
	  mean = xstat.sum/xstat.num;
	  return mean;
  }
  
  public static double variance(Statistics xstat)
  {
	  double variance;
	  variance = Math.sqrt((xstat.sum2/(xstat.num-Math.pow((mean(xstat)),2))));
	  return variance;
  }
}

// Definir classe Statistics
class Statistics
{
	double max, min, sum, sum2;
	int num;
}
