package LAMBDA.Pratico3;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<>();
        ArrayList<Double> array2 = new ArrayList<>();

        System.out.println("Insira a quantidade de elementos do array double: ");
        double quantidade = scanner.nextDouble();

        for(int i = 0;i < quantidade;i++){
          double elemento = scanner.nextDouble();
          array.add(elemento);
        }

       System.out.println(array);

       System.out.println("Insira numero para soma: ");
       double soma = scanner.nextDouble();

       array.forEach((v) -> {array2.add(v + soma);});

       System.out.println("Elementos do array somados a variavel soma: ");
       System.out.println(array2);



        scanner.close();
    }


     /*
        valores.forEach((v) -> {
        dobro.add(v*2);
         if(v%2 == 0){
            par.add(v); 
         }else{
            impar.add(v);
         }
    });*/

    // Consumer<Double> consumer = ((E) -> {arraysoma.add(E + soma);});

}
