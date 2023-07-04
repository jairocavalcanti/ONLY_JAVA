package METODOS.Testes;

import java.util.Scanner;

public class MetodoSubstring {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma palavra: ");
        String palavra = scanner.next();
 
        System.out.println(MetodoSubstring.Caracter(palavra));

        scanner.close();
    }
    

    public static String Caracter(String palavra){
       return palavra.substring(1, 4);
    }



}
