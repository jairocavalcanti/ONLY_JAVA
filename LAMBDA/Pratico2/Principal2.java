package LAMBDA.Pratico2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> nomesmaiores = new ArrayList<>();
        ArrayList<String> nomesmenores = new ArrayList<>();
        ArrayList<String> nomesde5 = new ArrayList<>();


        System.out.println("Insira quantos nomes vai querer inserir na lista:");
        Integer quantidade = scanner.nextInt();

        int i = 0;
        while(i < quantidade){
            System.out.println();
            System.out.printf("Insira o elemento #" + i + " da lista: ");
            String nome = scanner.next();
            array.add(nome);
            i++;
        }

        System.out.println();

        System.out.println("Elementos inseridos na lista:");
        System.out.println("----------------------------------------");
        System.out.println(" " + array);


        array.forEach((E) -> {
         if(E.length() > 5){
            nomesmaiores.add(E);
            }
         if(E.length() < 5){
            nomesmenores.add(E);
            }         
         if(E.length() == 5){
            nomesde5.add(E);
         }
        });
             
     
        System.out.println("----------------------------------------");
        System.out.println();

        
        System.out.println("Nomes com mais de 5 caracteres:");
        System.out.println(nomesmaiores);

        System.out.println();

        System.out.println("Nomes com menos de 5 caracteres:");
        System.out.println(nomesmenores);

        System.out.println();

        System.out.println("Nomes com exatos 5 caracteres:");
        System.out.println(nomesde5);

        scanner.close();
    }
}
