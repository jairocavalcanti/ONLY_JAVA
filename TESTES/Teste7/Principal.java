package TESTES.Teste7;

import java.util.Scanner;

public class Principal { 
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira o primeiro numero: ");
       Integer n1 = scanner.nextInt();

       System.out.println("Insira o segundo numero: ");
       Integer n2 = scanner.nextInt();

       System.out.println("Insira o terceiro numero: ");
       Integer n3 = scanner.nextInt();

       boolean todosiguais = n1.equals(n2) &&
                             n1.equals(n3);

        if(todosiguais){
            System.out.println("Todos numeros inseridos sao iguais !");
        }else{
            System.out.println("Numeros nao sao iguais !");
        }


       scanner.close();


    
    }
}
