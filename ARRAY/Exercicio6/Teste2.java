package ARRAY.Exercicio6;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[4];

        for(int i = 0; i< vetor.length;i++){
            vetor[i] = scanner.nextInt();
        }
      
        double maiornumero = vetor[0];

        for(int i = 0; i <vetor.length; i++){
            if(vetor[i] > maiornumero){
                maiornumero = vetor[i];
            }
        }

        System.out.println("Maior numero do vetor: " + maiornumero);

        scanner.close();

    }
    
}
