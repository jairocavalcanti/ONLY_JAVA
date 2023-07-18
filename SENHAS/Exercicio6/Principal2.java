package SENHAS.Exercicio6;

import java.util.Scanner;

public class Principal2 {
    public static final int PASSWORD_SIZE = 4;
     public static  int contador = 0;

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Insira uma senha:");
      String senha = scanner.next();
      
      if(senhavalida(senha)){
        System.out.println("senha aprovada: " + senha );
      }else{
        System.out.println("senha reprovada: " + senha );
      }

      scanner.close();
   }    

   public static boolean senhavalida(String senha){
         if(senha.length() < PASSWORD_SIZE) return false;
         for(int i = 0; i<senha.length(); i++){
           
            contador = 0;
            
            char ch = senha.charAt(i);

            if(numeros(ch)) contador++;
            else return false;

         }
         return contador != 0;
        }



   public static boolean numeros(char ch){
      return(ch >= 'a' && ch <= 'z');
   }



}
