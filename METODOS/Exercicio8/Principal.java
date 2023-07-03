package METODOS.Exercicio8;

import java.util.Scanner;

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
