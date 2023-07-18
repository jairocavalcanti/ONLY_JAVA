package VARIADOS.Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um nome: ");
        String nome = scanner.next();


        int contador = 1;
        for(int i =0; i<nome.length(); i++){
          if(nome.charAt(i) > 'a' && nome.charAt(i) <= 'z'){
             contador++;
          }
        }

        System.out.println("Quantidade de letras no nome: " + contador);


        scanner.close();
    }
    
}
