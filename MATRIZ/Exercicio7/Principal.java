package MATRIZ.Exercicio7;
import java.util.Scanner;


/*
Escreva um programa em Java que realize a multiplicação de duas matrizes quadradas de ordem n. 
O programa deve solicitar ao usuário que insira o tamanho da matriz (ordem n). 
Em seguida, o programa deve pedir ao usuário para preencher os elementos das duas matrizes. 
Após a multiplicação, o programa deve exibir o resultado da multiplicação das matrizes.

Dicas:

Crie métodos separados para preencher as matrizes, realizar a multiplicação e exibir o resultado.
Lembre-se de que a multiplicação de duas matrizes é possível se o número de colunas da primeira matriz 
for igual ao número de linhas da segunda matriz.
*/

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Metodos met = new Metodos();

    System.out.println("Insira o tamanho da matriz_1: ");
    int N = scanner.nextInt();

    System.out.println("Insira o tamanho da matriz_2: ");
    int N2 = scanner.nextInt();


    int matriz1 [][] = new int[N][N];
    int matriz2 [][] = new int[N2][N2];
    int matriz3 [][] = new int[N2][N2];



    System.out.println("-----------------------------------------------------");

    met.preenchermatrizes(matriz1, matriz2, scanner);
    met.mostrarmatrizes(matriz1, matriz2);
    met.multiplicarmatrizes(matriz1, matriz2, matriz3);

    scanner.close();
    }
    
}
