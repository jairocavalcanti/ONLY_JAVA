package LAMBDA.Pratico2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Principal4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    ArrayList<Double> arraydouble = new ArrayList<>();
   
    ArrayList<Double> arraysoma= new ArrayList<>();
    ArrayList<Double> arraysubtração = new ArrayList<>();
    ArrayList<Double> arraymultiplicação = new ArrayList<>();
    ArrayList<Double> arraydivisao = new ArrayList<>();
    

    System.out.println("Insira a quantidade de elementos double do array:");
    Integer quanti = scanner.nextInt();         

    int i = 0;

    while(i < quanti){
        System.out.println("Insira o elemento #" + i + ":");
        double elemento = scanner.nextDouble();

        arraydouble.add(elemento);
        i++;
    }

    System.out.println();

    System.out.println(" -- -- Elementos inseridos: -- -- ");
    System.out.printf(" " + arraydouble);

    System.out.println();

    System.out.println("Insira numero para soma:");
    double soma = scanner.nextDouble();

    Consumer<Double> consumer = ((E) -> {arraysoma.add(E + soma);});

    arraydouble.forEach(consumer);
    System.out.println();

    System.out.println(" -- Numeros do array somados: -- ");
    System.out.println(arraysoma);
    System.out.println();

    System.out.println("Insira numero para subtração:");
    Double subtração = scanner.nextDouble();

    Consumer<Double> consumer2 = ((F) -> {arraysubtração.add((F + soma) - subtração);});
    
    arraydouble.forEach(consumer2);
    System.out.println();

    System.out.println(" -- Numeros do array subtraidos -- ");
    System.out.println(arraysubtração);
    System.out.println();

    System.out.println("Insira o numero para multiplicação:");
    Double multiplicaçao = scanner.nextDouble();

    Consumer<Double> consumer4 = ((G) -> {arraymultiplicação.add(((G + soma) - subtração) * multiplicaçao);});
 
    arraydouble.forEach(consumer4);
    
    System.out.println(" -- Numeros do array multiplicados -- ");
    System.out.println(arraymultiplicação);
    System.out.println();

    System.out.println("Insira o numero para dvisão:");
    Double divisao = scanner.nextDouble();

    Consumer<Double> consumer5 = ((H) -> {arraydivisao.add(((H + soma) - subtração) * multiplicaçao / divisao);});

    arraydouble.forEach(consumer5);
   
    System.out.println(" -- Numeros do array divididos -- ");
    System.out.println(arraydivisao);
    System.out.println();
    
   
    scanner.close();
}
    
}
