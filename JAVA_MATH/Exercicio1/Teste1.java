package JAVA_MATH.Exercicio1;

import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira o primeiro numero:");
    Integer numero1 = scanner.nextInt();

    System.out.println("Insira o segundo numero:");
    Integer numero2 = scanner.nextInt();

    System.out.println("Insira o terceiro numero:");
    float numero3 = scanner.nextFloat();

    System.out.println( Math.PI + numero1 + numero2 + numero3);

    System.out.println(numero3);

    

    scanner.close();
    }
    
}
