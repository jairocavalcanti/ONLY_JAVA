package Pratica_Avulsa;
public class matrizes {
   
  //'dividir' as matrizes: '%n'//
  //'System.out.printf'//


    public static void main(String[] args) {
       

        Integer linha = 5;
        Integer coluna = 5;
        Integer[][] matriz = new Integer [linha][coluna];

        for(int d=0;d<linha;d++){
           for(int c=0;c<coluna;c++){
             System.out.println("Windows");
         }
        System.out.printf("%n"); 
        System.out.println(matriz);
      }
     
   }
 
  }