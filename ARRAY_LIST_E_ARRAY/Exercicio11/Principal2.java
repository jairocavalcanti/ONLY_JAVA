package ARRAY_LIST_E_ARRAY.Exercicio11;

public class Principal2 {
     public static void main(String[] args) {
       
        int [][] matriz = new int [10][10];  

        for(int i=0; i<10; i++)
        {
          for(int j=0; j<10; j++){
        
          //formato precisa ser definido com " ", caso contrario neste caso será '0'
               System.out.printf(" - ", + matriz[i][j]);
          }
       
          System.out.println();
         }

     }


}
