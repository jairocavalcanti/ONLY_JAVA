package METODOS.Exercicio9;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "Programação orientada a objetos";

        String[] palavras = frase.split("\\s+");

        System.out.println("Quantidade de palavras na frase: " + palavras.length);

        scanner.close();
    }
    
}
