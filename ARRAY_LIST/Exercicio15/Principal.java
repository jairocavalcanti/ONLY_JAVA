package ARRAY_LIST.Exercicio15;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int i = 0;

    ArrayList<Elementos> lista = new ArrayList <Elementos>();
    
    System.out.println("Insira a quantidade de listas de 2 que deseja:");
    int quanti = scanner.nextInt();

    int i2 = 1;

    do {
    System.out.println("Insira o  elemento #" + i2++ + " :" );
    String elemento1 = scanner.next();

    System.out.println("Insira o elemento #" + i2++ + " :"  );
    String elemento2 = scanner.next();

    lista.add(new Elementos(elemento1, elemento2));
   
    i++;

    System.out.println();

    } while (i < quanti);

    
    for(Elementos e : lista){
        System.out.println("Elemento - 1: " + e.elemento1 + " // " + "Elemento - 2: " + e.elemento2 );
    }


    scanner.close();
   
    }
}
