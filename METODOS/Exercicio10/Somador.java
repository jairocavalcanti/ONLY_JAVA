package METODOS.Exercicio10;

public class Somador {
    

    public static double somador(double n){
        int result = 0;

       while( n > 0){
      
       result += n % 10;
       n /= 10;
       }

        return result;
   
    }
}
