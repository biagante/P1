/*
 * JAM, 24-out-2019
 * Ler notas de 0 a 20 (terminar com valor negativo), calcular media e notas > media
 */
import java.util.Scanner;

public class Notas19a {

	static Scanner teclado = new Scanner(System.in);
	
    public static void main(String[] args) {

        int nota = 0, soma = 0, num = -1;
        float media;
        
        int[] notas;
        //~ double d[] = new double[5];
        int tamanho = 10;
        notas = new int[tamanho];
        
        System.out.println("Introduza as notas dos alunos (<0 termina):");

        do {
            soma = soma + nota;
            num = num + 1;
            System.out.printf("Nota aluno %3d: ",num+1);
            nota = teclado.nextInt();
			notas[num] = nota;
        } while (nota >= 0);
        
        media = (float)soma/num;
        System.out.printf("Soma = %3d\nMedia = %4.1f\n",soma,media);
        
        for (int i=0;i < num;i++){
			if (notas[i] > media)System.out.printf("Nota %d maior que media%n",i);
		}
		//print(notas);
        
    }
    
    public static void print(int[] n){
		for (int x : n)System.out.printf("Nota %d%n",x);
		n[5] = -99;
		}
}
