package METODOS.Exercicio5;

import java.util.Random;

public class Metodomatriz {
    
    public void matriz(int N){
        Random rand = new Random();
        int matriz[][] = new int[N][N];
        
       for(int i =0; i<matriz.length;i++){
             for(int j =0; j<matriz[i].length;j++){
               matriz[i][j] = rand.nextInt(2);
               }
            }
       for(int i =0; i<matriz.length;i++){
             for(int j =0; j<matriz[i].length;j++){
               System.out.printf("[" + matriz[i][j] + "]");
               }
             System.out.printf("%n");
            }
   
    }

}
