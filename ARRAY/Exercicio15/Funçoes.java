package ARRAY.Exercicio15;
import java.util.Arrays;
import java.util.Scanner;


public class Funçoes {

    Scanner scanner = new Scanner(System.in);

    public Funçoes(){

    }

    public void inserirelementos(int array[], Scanner scanner, int array2[]){
        int i = 0;
        for(i = 0; i < array.length; i++){
            System.out.println("Insira o elemento #" + (i+1) + " do vetor 1 :");
            array[i] = scanner.nextInt();
        }
        System.out.println("------------------------------------------");
        int j = 0;
        for(j = 0; j<array2.length; j++){
            System.out.println("Insira o elemento #" + (j+1) + " do vetor 2 :");
            array2[j] = scanner.nextInt();
        }


        System.out.println("------------------------------------------");
        System.out.println("Elementos INSERIDOS no vetor 1: " + Arrays.toString(array));
         System.out.println("Elementos INSERIDOS no vetor 2: " + Arrays.toString(array2));
    }
   
    public Integer totalpares(int array[]){
        int total = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] % 2 == 0){
                total += 1;
            }
        }
        System.out.println("Total de numeros PARES presentes no vetor 1: " + total);
        return 0;
    }

    public Integer maiorelemento(int array[]){
        int maior_numero = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > maior_numero){
                maior_numero = array[i];
            }
        }
        System.out.println("MAIOR numero inserido no vetor 1: " + maior_numero);
        return 0;
    }
    
    public Integer elementosIguais(int array[], int array2[]){
        int numero_iguais = 0;
        for(int i = 0; i<array2.length; i++){
            for(int j = 0; j<array.length; j++){
                if(array2[i] == array[j]){
                numero_iguais += 1;
               }
            }
        }
      System.out.println("------------------------------------------");
      System.out.println("Quantidade de numeros do vetor 2 que sao iguais aos do vetor 1 : " + numero_iguais);
      return 0;
    }

    
}
