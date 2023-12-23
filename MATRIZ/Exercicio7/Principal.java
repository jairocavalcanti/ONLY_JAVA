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

    System.out.println("Insira a quantidade de LINHAS da matriz_1: ");
    int linhas_1 = scanner.nextInt();

    System.out.println("Insira a quantidade de COLUNAS da matriz_1: ");
    int colunas_1 = scanner.nextInt();
    
     System.out.println("Insira a quantidade de LINHAS da matriz_2: ");
    int linhas_2 = scanner.nextInt();

    System.out.println("Insira a quantidade de COLUNAS da matriz_2: ");
    int colunas_2 = scanner.nextInt();
    
    int matriz1 [][] = new int[linhas_1][colunas_1];
    int matriz2 [][] = new int[linhas_2][colunas_2];

    met.preenchermatrizes(linhas_1, colunas_1 , linhas_2, colunas_2 , matriz1, matriz2, scanner);
    met.mostrarmatrizes(linhas_1, colunas_1 , linhas_2, colunas_2 , matriz1, matriz2);
    met.multiplicarmatrizes(linhas_1, colunas_1, linhas_2, colunas_2, matriz1, matriz2);
    

    scanner.close();

    }
    
}
