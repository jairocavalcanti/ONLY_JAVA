package ARRAY.Exercicio7;
import java.util.Scanner;
import java.util.Random;

public class Principal {

//PRATICA VETORES
//INSERINDO ELEMENTOS PRÉ EDITADOS


public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);    
      Random rando = new Random(200);

    System.out.println("insira uma palavra:");
    String palavra = scanner.next();

    String n[] = new String[10];

    for(int c=0;c<n.length;c++){
    System.out.println(palavra);
    System.out.println(rando.nextInt(100));
}

    scanner.close();
   

}    

    
}
