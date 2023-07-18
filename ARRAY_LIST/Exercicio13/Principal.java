package ARRAY_LIST.Exercicio13;

import java.util.Arrays;

public class Principal {
    
public static void main(String[] args) {
    String array1[] = { "Ryab", "Zorro","Armando"};
    
    //forma errada de tentar imprimir um array
    System.out.println(array1);

    System.out.println("---------------------------------------");
    
    //forma correta de  se imprimir um array
    System.out.println("Array acima:" + Arrays.toString(array1));
    
    System.out.println("----------------------------------------");

    //ordenando o array de forma alfabética por ser do tipo string
    Arrays.sort(array1);
    System.out.println("Array acima ordenado:" + Arrays.toString(array1));

}


}
