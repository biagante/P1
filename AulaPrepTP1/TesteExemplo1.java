/* Teste prático, exemplo 2019/20
 * NMec:
 * Nome: 
 */

import java.util.Scanner;

public class TesteExemplo1 {

    public static void main(String[] args) {
        int[] notas = {4, 6, 7, 5, 4, 6, 6, 8, 11};
        int[] histo;

        double mediaf,mediat;

        // ler notas dos alunos do teclado (nota 0-10; 11 faltou)
        System.out.printf("Introduza notas dos alunos(nota 0-10; 11 faltou): %n");
        //~ notas = lerNotas(10);

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
        
    }
    
    // 2) função para ler notas entre 0 e 11. 11 significa que o aluno faltou. Devolve array com as notas
    public static int[] lerNotas(int numNotas) {
		
        return new int[0];
    }

    // 3) função histograma
    public static int[] histograma(int[] notas) {
        
        return new int[0];
    }
    
	// 4) Função ImprimeHistograma.
	// Cada linha tem a nota, e um nº de * = à sua frequência
	//   ex: Nota 6: ****
    public static void imprimeHistograma (int[] hist) {
      
    }

    // 5) função medias de freq ou total conforme tipo = 'f' ou 't'
    public static double medias(int[] lista,char tipo) {
       
        return 0.0;
    }
}

