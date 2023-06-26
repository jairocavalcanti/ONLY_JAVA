package ARRAY_LIST.Exercicio14;

import java.util.Scanner;
import java.util.Arrays;

public class Principal2 {
   

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Integer numero1;
    Integer numero2;   
      
    System.out.println("Insira o primeiro numero:");
    numero1 = scanner.nextInt();

    System.out.println("Insira o segundo numero:");
    numero2 = scanner.nextInt();

    Integer lista[] = new Integer[]{numero1,numero2};


    System.out.println("Nomes inseridos na lista:" + Arrays.toString(lista));

    Integer numero0 = 0;
    

    for(int i=0; i <lista.length; i++){
         numero0 += lista[i];
        }
    
    Integer numero4 = numero0/2;

    System.out.println("Numeros do array somados:");
    System.out.println(numero0);

    System.out.println("Numeros do array somados e dividos por 2:");
    System.out.println(numero4);

    



    scanner.close(); 

}
   
 


}
