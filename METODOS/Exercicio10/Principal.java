package METODOS.Exercicio10;

import java.util.Scanner;

public class Principal {
   
      /*Escreva um metodo para contar todas as palavras presentes em determinada frase */
    
       public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       String frase = "Joaquim é desenvolvedor java";
       
       int quantidade = contarpalavras(frase);

       System.out.println("Numero de palavras na frase: " + quantidade);
     
       scanner.close();
    }
    
    public static int contarpalavras(String frase){
       
        if(frase == null || frase.isEmpty()){
            return 0;
        }
       
        //Divide o texto em palavras tendo como parametero para isso os espaços entre elas
        String[] palavras = frase.split("\\s+");
   
        return palavras.length;
    }

}
