/* Teste prático, exemplo 2019/20
 * NMec:
 * Nome: 
 */

import java.util.Scanner;

public class TesteExemplo {

    public static void main(String[] args) {
        int[] notas = {};//{4, 6, 7, 5, 4, 6, 6, 8, 11};
        int[] histo;

        double mediaf,mediat;

        // ler notas dos alunos do teclado (nota 0-10; 11 faltou)
        System.out.printf("Introduza notas dos alunos(nota 0-10; 11 faltou): %n");
        notas = lerNotas(10);

        // lista notas
        listar(notas);

        // calcula histograma
        histo = histograma(notas);

        // imprime histograma
        imprimeHistograma(histo);

        // calcular média freq e total
        mediaf = medias(notas,'f');	// alunos só de frequência
        mediat = medias(notas,'t');	// alunos todos

        // Imprime medias
        System.out.printf("Media total = %4.1f, Media alunos freq. = %4.1f\n", mediat, mediaf);

    }

    // 1) Listar notas no ecrã
    public static void listar(int[] notas) {
	if (notas.length <= 0)return;
        System.out.printf("Lista notas: ");
        for (int n = 0; n < notas.length - 1; n++) {
	     System.out.printf("%d, ", notas[n]);
	}
	System.out.printf("%d%n", notas[notas.length - 1]);
       
    }
    
    // 2) função para ler notas entre 0 e 11. 11 significa que o aluno faltou. Devolve array com as notas
    public static int[] lerNotas(int numNotas) {
		Scanner ler = new Scanner(System.in);
        int[] nota = new int[numNotas];
        int valor;
        for (int n = 0; n < numNotas; n++) {
            do {
                System.out.printf("Nota aluno %3d: ", n + 1);
                valor = ler.nextInt();
            } while (valor < 0 || valor > 11);
            nota[n] = valor;
        }
        return nota;
    }

    // 3) função histograma
    public static int[] histograma(int[] notas) {
        int[] hist = new int[12]; // array novo para cada histograma

        for (int nota : notas) {
            hist[nota]++;
        }
        return hist;
    }
    
    // 4) Função ImprimeHistograma.
    // Cada linha tem a nota, e um nº de * = à sua frequência
    //   ex: Nota 6: ****
    public static void imprimeHistograma (int[] hist) {
        for (int h = 0; h < hist.length; h++) {
            System.out.printf("Nota %2d:", h);
            for (int c = 0; c < hist[h]; c++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    // 5) função medias de freq ou total conforme tipo = 'f' ou 't'
    public static double medias(int[] lista,char tipo) {
        int contaf=0;
        double soma = 0;

        for (int n = 0; n < lista.length; n++) {
            if (lista[n] < 11) {
                soma = soma + lista[n];
                contaf++;
            }
        }
        if (tipo == 't')contaf=lista.length;
        return (double)soma/contaf;
    }
}

