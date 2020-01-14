import java.util.*;
import java.io.*;
public class ex77 {
    static Scanner rd = new Scanner(System.in);
    static Scanner scf;
    static File fin;
    
    public static void main(String[] args) throws java.io.IOException {
        int p=1;
        // posição da palavra a analisar, se 1 a palavra é a primeira ou está apos ponto final, se 0 nao e necessaria qualquer alteração
        String word;
        // string que vai guardar a palavra a analizar
        char c;

        input(); 
        //função que lida com o ficheiro de entrada

        while (scf.hasNextLine()) {
            word=scf.next();
            if(p==1){ 
				//se p=1 a palavar vai ter o seu primero carater pasado para maiuscula
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                p=0;// faz reset a p
            }

            System.out.print(word + " "); 

            c=word.charAt(word.length() - 1); 
            //ve se o ultimo carater da palavra é um ponto final, se sim p=1, pois a proxima palavra tera ser ser passada para maiuscula
            if(c=='.') {p=1;}
            
        }
    }

    public static void input() throws java.io.IOException { 
		//pese o ficheiro a analizar e faz a sua verificação, apos verificação defenine o scanner para o ficheiro de entrada
        System.out.print("Ficheiro de entrada:");
        String nameIn = rd.nextLine();
        File fin = new File(nameIn);

        if (!fin.exists()) {
            System.out.println("ERRO: ficheiro " + nameIn + " não existe!");
            System.exit(2);
        }
        
        if (!fin.canRead()) {
            System.out.println("ERRO: ficheiro " + nameIn+ "não pode ser lido!");
            System.exit(4);
        }

        //define novo scanner apos verificação
        scf = new Scanner(fin);
    }

}
