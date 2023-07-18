package ARRAY.Exercicio6;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        int maior;
        int vetor[] = {1,2,665,4,5};

       System.out.println("Vetor: " + Arrays.toString(vetor));

       maior = vetor[0];
    
       for(int i = 0; i<vetor.length; i++){
        if(vetor[i] > maior){
          maior = vetor[i];  
        }
       
    }

       System.out.println("Maior numero do vetor: " + maior);
       

    }
    
}
