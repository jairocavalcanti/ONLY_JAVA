package METODOS.Exercicio7;

import java.util.Scanner;

/*Programa para criação de metodo capaz de imprimir o caracter do meio de uma palavra */

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Insira uma palavra: ");
    String palavra = scanner.next();

    //Metodo estatico nao depende da instanciação da classe
    System.out.println("Caractere do meio da palavra inserida: " + Caractere.caracteredomeio(palavra));

    scanner.close();
    }
    
}
