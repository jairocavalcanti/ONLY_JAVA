package LAMBDA.Pratico3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Principal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<>();
        ArrayList<Double> soma = new ArrayList<>();

        System.out.println("Insira a quantidade de elementos a inserir no arraylist: ");
        int tamanho = scanner.nextInt();        

        for(int i = 0; i< tamanho; i++ ){
            double elemento = scanner.nextDouble();
            array.add(elemento);
        }

        System.out.println();

        System.out.println("ARRAY: ");
        System.out.println(array);

        System.out.println("Deseja inserir soma aos elementos do ArrayList? ");
        String escolha = scanner.next();

        if(escolha.toLowerCase().equals("sim")){
        System.out.println("Insira o numero para soma: ");
        double elemento2 = scanner.nextDouble();
        
        Consumer<Double> consumer = ((E) -> {soma.add(E + elemento2);});
        array.forEach(consumer);
        }else{
           System.out.println("Programa finalizado...");
        }
        

        // Consumer<Double> consumer = ((E) -> {arraysoma.add(E + soma);});
       

        System.out.println("ARRAY 2:");
        System.out.println(soma);

        scanner.close();
    }
    
}
