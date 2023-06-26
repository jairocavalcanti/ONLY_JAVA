package ARRAY_LIST.Exercicio10;

public class Principal {
//Escreva um programa Java para calcular o valor médio dos elementos do array
public static void main(String[] args) {
    
    Integer array1 [] = {20,29,80};
    Integer soma;


    // 'som += array[i]' abreviação de 'som = som + array1[] '
    // +=
    // +=

    int som = 0;
  
    for(int i=0; i< array1.length ; i++){
    //somando os elementos do array a uma variavel de valor 0  
     
         som += array1[i];
    }
    System.out.println(som);
  
    soma = som / array1.length;

    System.out.println("Valor medio dos elementos do array: " + soma);
     

    }

  }



