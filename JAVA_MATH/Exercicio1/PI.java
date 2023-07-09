package JAVA_MATH.Exercicio1;

import java.util.Scanner;

public class PI {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro numero:");
    Integer numero1 = scanner.nextInt();

    System.out.println("Insira o segundo numero:");
    Integer numero2 = scanner.nextInt();

    System.out.println("Insira o terceiro numero:");
    float numero3 = scanner.nextFloat();

    //'Math.PI' armazena valor de pi = 3,14
    System.out.println(Math.PI + numero1 + numero2 + numero3);

    System.out.println(numero3);

    

    scanner.close();
    }
    
}
