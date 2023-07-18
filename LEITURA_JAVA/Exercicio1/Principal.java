package LEITURA_JAVA.Exercicio1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
     
        File file = new File("c:\\java\\in.txt");
        Scanner scanner = null;
        try {
        scanner = new Scanner(file);
        //funçao q retorna verdadeiro se ainda nao chegou no fim do arquivo 
        while (scanner.hasNextLine()){
                   System.out.println(scanner.nextLine());
                }
        
         } 
         //IOException excessao para todo tipo de entrada e saída
         catch (IOException e ){
            //imprimir na tela excessao
            System.out.println(e.getMessage()); 
         }
         finally{
            if(scanner != null){
            scanner.close();
            } 
        }



    }



}
