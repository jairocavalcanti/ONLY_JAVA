package LAMBDA.Pratico3;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<> ();

        System.out.println("Insira a quantidade de elementos double que vai inserir na lista: ");
        double quantidade = scanner.nextDouble();
        
        for(int i = 0; i< quantidade; i++){
            System.out.println("Insira o elemento " + i + "do arraylist: ");
            Double elemento = scanner.nextDouble();
            array.add(elemento);
        }

        System.out.println(array);

        System.out.println("Deseja adicionar algum numero aos elementos do array? ");
        String resposta = scanner.next();
        
        if(resposta.equals("S")){
            System.out.println("Insira o numero escolhido para soma:");
            Double soma = scanner.nextDouble();
        }




        array.forEach((v) -> { });

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


}
