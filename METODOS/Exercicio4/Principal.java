package METODOS.Exercicio4;

import java.util.Scanner;
//Escreva um método Java (recebe n como entrada) para exibir uma matriz n por n
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodomatriz met = new Metodomatriz();

        System.out.println("Escolha o tamanho das linhas e colunas da matriz:");
        int n = scanner.nextInt();

        met.matriz(n);
    
        scanner.close();    
    }
    
}
