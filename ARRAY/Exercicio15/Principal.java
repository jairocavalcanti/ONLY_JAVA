package ARRAY.Exercicio15;
import java.util.Scanner;

/*

Que um programa em Java que implemente as seguintes funções:  

-- Função 1 : a função recebe como parâmetro um array de inteiros e retorna um  número inteiro indicando o total de números 
pares existentes no array. 

-- Função 2 : a função recebe como parâmetro um array de inteiros e retorna o  maior número existente no array.  

-- Função 3 : a função recebe como parâmetro dois arrays de inteiros e retorna o  total de números iguais existentes em ambos os arrays.  

Em seguida, 
crie a função principal do programa para testar as funções criadas em arrays  definidos estaticamente ou informados pelo usuário. 

*/

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o tamanho do array 1: ");
       int N = scanner.nextInt();
      
       System.out.println("Insira o tamanho do array 2: ");
       int N2 = scanner.nextInt();

       System.out.println("------------------------------------------");
       int[] array1 = new int[N];
       int[] array2 = new int[N2];
      
       Funçoes func = new Funçoes();

       func.inserirelementos(array1, scanner,array2);
       func.totalpares(array1);
       func.maiorelemento(array1);
       func.elementosIguais(array1, array2);

      scanner.close();
    }

}
