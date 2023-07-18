package JAVA_MATH.Exercicio1;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      
    int raio = 0;
    float area;

    float area2;

    System.out.println("Informe o valor do raio:");
    raio = scanner.nextInt();

    //a = pi*r2.
    //calculo com tipos diferentes a partir do cast '(float)'. 
    //util para armazenar valores do tipo float.
   
    area = (float) (Math.PI * raio * raio);
     
    //Math.pow : funçao para potencia, 
    //sendo  primeiro valor a base, 
    //e o segundo a potencia.
 
    area2 = (float) (Math.PI * Math.pow(raio,2));
   
    System.out.println("Area 1 é:" + area);

    System.out.println("Area 2 é:" + area2);

    scanner.close();
    }

}
