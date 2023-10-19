package ESTRUTURA_DE_DECISÃO.Exercicio4;
import java.util.Scanner;

/* Faça um Programa que verifique se uma letra digitada é vogal ou consoante */

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
       boolean vogal = false;
       Character vetor1 [] = {'a', 'e' , 'i', 'o' , 'u'};

       System.out.println("Digite uma letra qualquer: ");
       Character letra = scanner.next().charAt(0);

       for(int i = 0; i < vetor1.length; i++){
        if(letra == vetor1[i]){
           vogal = true;  
        }
      }
         

        if(vogal){
            System.out.println("Vogal identificada -- " + letra);
        }else{
            System.out.println("Consoante identificada -- " + letra);
        }


       scanner.close(); 
   

 }
}