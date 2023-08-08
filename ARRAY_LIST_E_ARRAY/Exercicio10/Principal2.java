package ARRAY_LIST_E_ARRAY.Exercicio10;

import java.util.Arrays;

public class Principal2 {
    
    public static void main(String[] args) {
    
        Integer soma = 0;
        Integer vetor1 [] = {90,2,3};
 
        //SOMANDO OS ELEMENTOS DO ARRAY
       
        for(int i =0; i<vetor1.length; i++){
            soma += vetor1[i];
        }
    
        //ordenando elementos do vetor
        Arrays.sort(vetor1);
       
        //forma correta de imprimir um vetor
        System.out.println("Elementos do array de maneira ordenada:" + Arrays.toString(vetor1));

        System.out.println("Valor da soma dos elementos:" + soma);


    }
}
