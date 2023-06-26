package ARRAY_LIST.Exercicio9;

import java.util.Arrays;

public class Principal {
    //Escreva um programa Java para classificar um array numérico e um array de strings.
    //.sort ORDENA O ARRAYLIST -- DAHORA

    public static void main(String[] args) {

        String arrasysString [] = {"jairo", "louro" , "presciliano"};
        int arrasyinteger [] = {2,4,1};
       
        System.out.println("Array numerico original : "+ Arrays.toString(arrasyinteger));
        Arrays.sort(arrasyinteger);
        System.out.println("Array numerico ordenado :" + Arrays.toString(arrasyinteger));
        
        System.out.println("Array string original:" + Arrays.toString(arrasysString));
        Arrays.sort(arrasysString);
        System.out.println("Array string ordenado:" + Arrays.toString(arrasysString));

    }
   

}
