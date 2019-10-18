public class Ex212_joaosedit {
    public static void main(String[] args) {
        // rectangulo 1
        int[] x1 = {8, 1, 9, 1};
        int[] y1 = {2, 10,0,1};
        //rectangulo 2
        int[] x2 = {0, 0, 0, 0};
        int[] y2 = {2, 1,0,1};

        int comparator = 0;
        boolean interx = false;
        boolean intery = false;

        //verificar se ha interseçao entre x
        for(int i = 0; i<x1.length;i++){
            for(int j=0;j<x2.length;j++){
                if(x1[i]<x2[j]){
                    comparator += -1;
                } else {
                    comparator += 1;
                }
            }
            if(Math.abs(comparator) != 4){ // ha interseçaõ dos x
                interx= true;
                comparator = 0;
                break;
            }
            comparator = 0;
        }

        //verificar se ha interseçao entre y
        for(int i = 0; i<y1.length;i++){
            for(int j=0;j<y2.length;j++){
                if(y1[i]<y2[j]){
                    comparator += -1;
                } else {
                    comparator += 1;
                }
            }
            if(Math.abs(comparator) != 4){ // ha interseçaõ dos y
                intery= true;
                break;
            }
            comparator = 0;
        }

        if(interx && intery){ //houve interseçao dos x e y logo os retangulos ibtersetam
            System.out.print("Intersetam-se!");
        } else {
            System.out.print("Nao se intersetam!");
        }
    }
}
