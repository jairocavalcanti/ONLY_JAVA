package METODOS.Exercicio7;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Substring2 subs = new Substring2();

        String string = "Automatico";

        System.out.println("------------------------------------");

        System.out.println("Insira o indice 1: ");
        int indice1 = scanner.nextInt();

        System.out.println("Insira o indice 2: ");
        int indice2 = scanner.nextInt();

        System.out.println(subs.caracteres(string, indice1, indice2));
        
      
        scanner.close();
    }
    

    public String caracteres(String string, int indice1, int indice2){
        return  string.substring(indice1, indice2);
    }

}
