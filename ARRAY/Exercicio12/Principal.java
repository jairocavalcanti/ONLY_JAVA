package ARRAY.Exercicio12;
    
/* 
Crie um programa em Java que implemente a função valores_entre. Essa função  
recebe como parâmetro um array de inteiros 
V e retorna um outro array de inteiros  contendo todos os valores 
de V que estejam entre o valor mínimo e máximo (que também  são passados como parâmetro para a função).  
*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Valores_entre val = new Valores_entre();

        System.out.println("--------------------");
        System.out.println("Insira o tamanho do vetor: ");
        int tamanhovetor = scanner.nextInt();

        int vetorinteiros[] = new int[tamanhovetor];

        System.out.println("Insira o valor minimo: ");
        int valorminimo = scanner.nextInt();

        System.out.println("Insira o valor maximo:");
        int valormaximo = scanner.nextInt();

        val.arrayint(vetorinteiros, valorminimo, valormaximo, scanner);

    }
}

