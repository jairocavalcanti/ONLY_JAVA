package METODOS.Exercicio4;
import java.util.Scanner;
// Escreva métodos Java para calcular a área de um triângulo

public class Matematics {
    
    Double base;
    Double altura;
    Double formula = base*altura/2;

    public void calculartriangulo(){
    Scanner scanner = new Scanner(System.in);    
     
    //Formula: A = b*h/2

    System.out.println("---CALCULO TRIANGULAR---");
      
    System.out.println("Insira a medida da base do triangulo:");
    base = scanner.nextDouble();

    System.out.println("Insira a medida da altura do triangulo:");
    altura = scanner.nextDouble();

    System.out.println("Resultado do calculo:" + formula);
   
    scanner.close();
    }


}
