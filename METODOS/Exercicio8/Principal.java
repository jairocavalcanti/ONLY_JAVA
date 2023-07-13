package METODOS.Exercicio9;

import java.util.Scanner;

/*Escreva um método Java para contar todas as vogais em uma string */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodovogais met = new Metodovogais();

        System.out.println("Insira uma palavra de sua escolha: ");
        String palavra = scanner.next();


        met.metodo(palavra);


        scanner.close();
    }
}
