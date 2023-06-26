package LAMBDA.Pratico2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Principal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arraydouble = new ArrayList<>();
        ArrayList<Double> divisao = new ArrayList<>();

        System.out.println("Insira a quantidade de elementos a serem inseridos:");
        Double numero = scanner.nextDouble();

        int i = 0;
        while(i < numero){
            System.out.println("Insira o elemento #" + i + " :");
            Double elemento = scanner.nextDouble();
            arraydouble.add(elemento);
            i++;
        }

       //consumer<Integer> divisadas = (v) ->{divisao.add(v*2);};
       //valores.forEach(dobrar);
        
       //criando consumer
       Consumer<Double> divisadas = ((e) -> {divisao.add(e/2);});
       
       //associando consumer á operação LAMBDA
       arraydouble.forEach(divisadas);

       System.out.println();
        
       System.out.println("Numeros inseridos no arraylist:");
       System.out.println(arraydouble);
       
       System.out.println();
       
       System.out.println("Numeros do arraylist divididos por 2:");
       System.out.println(divisao);


        scanner.close();
    }
}
