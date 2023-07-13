package ARRAY.Exercicio8;
import java.util.Scanner;


public class Principal {

    //LISTA DE VALORES TIPO STRING INSERIDOS 

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome [] = new String [10];
 
    for(int c=0; c<5; c++){
    System.out.println("Insira um nome:");
    nome[c] = scanner.next();    
    }
  
    System.out.println("Nomes inseridos:");

    for( int c=0; c<5; c++){
    System.out.println(nome[c]);

    }
    scanner.close();

}
    
}
