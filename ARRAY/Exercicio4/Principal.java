package ARRAY.Exercicio4;


import java.util.Arrays;
import java.util.Scanner;
/*Um algoritmo
que insere um elemento no vetor de acordo com a posição
fornecida como parâmetro;*/ 

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o tamanho do vetor: ");
        int t = scanner.nextInt();

        int vetor[] = new int[t];

        /*Posição de veotres sempre se inicia em '0' 
        logo a primeira posição do vetor sera '0' a segunda '1' e assim sucetivamente */
        System.out.println("Insira a posiçao do vetor que deseja inserir o elemento: ");
        int posicao = scanner.nextInt();

            System.out.println("Insira o elemento: ");
            vetor[posicao] = scanner.nextInt();
        
        
        System.out.println("Vetor:" + Arrays.toString(vetor));

        scanner.close();
    }

}
