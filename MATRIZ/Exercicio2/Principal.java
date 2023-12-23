package MATRIZ.Exercicio2;

/* 
  Programa para teste simples com matrizes pre definidas do tipo String, Integer e Double 
*/

public class Principal {
    public static void main(String[] args) {
        
    //inserindo elementos previamente na matriz
    //virgula funciona como quebra de linha neste caso 
      
      String matrix[][] = {{
        " a " + " b " + " c " + " d "
        + " e " , " f " + " g "
        + " h " + " i " + " j " , " l " 
        + " m " + " n " + " o " + " p ", 
       " q " + " r " + " s " + " t " + " u "}};
       
      Integer matrix2[][] = new Integer[3][4];
      //19,25,100,99,
      //10,7,25,14,
      //35,2,47,74
      matrix2[0][0] = 19;    matrix2[0][1] = 25;     matrix2[0][2] = 100;    matrix2[0][3] = 99;  
      matrix2[1][0] = 10;    matrix2[1][1] = 7;      matrix2[1][2] = 25;     matrix2[1][3] = 14;
      matrix2[2][0] = 35;    matrix2[2][1] = 2;      matrix2[2][2] = 47;     matrix2[2][3] = 74;
     
      
     
      Double matrix3[][] = new Double[3][3];
        

      matrix3[0][0] = 1.9;    matrix3[0][1] = 2.5;      matrix3[0][2] = 10.0;   
      matrix3[1][0] = 1.0;    matrix3[1][1] = 7.8;      matrix3[1][2] = 2.5;     
      matrix3[2][0] = 3.5;    matrix3[2][1] = 2.2;      matrix3[2][2] = 4.7;  

         

        System.out.println("-- MATRIZ STRING --");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.println("[" + matrix[i][j] + "]");
            }
        }

        System.out.println();

        System.out.println("-- MATRIZ INTEGER --");
        for(int i = 0; i<matrix2.length; i++){
            for(int j = 0; j<matrix2[i].length; j++){
               System.out.printf("[" + matrix2[i][j] + "]");
            } 
           System.out.printf("%n");
        }

        System.out.println();

        System.out.println("-- MATRIZ DOUBLE --");
        for(int i = 0; i< matrix3.length;i++){
            for(int j = 0; j<matrix3[i].length; j++){
                System.out.printf("[" + matrix3[i][j] + "]");
            }
          System.out.printf("%n");
        }



    }
   
    


}
