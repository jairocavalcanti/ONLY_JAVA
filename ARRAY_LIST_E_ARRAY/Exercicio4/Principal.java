package ARRAY_LIST_E_ARRAY.Exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
Integer numero1;
Integer numero2;

ArrayList <Numeros> lista333 = new ArrayList<>();

public static void main(String[] args) {
    Principal prin2  = new Principal();
    prin2.numeros();

}

public void numeros() {
 
 Integer numero1 = this.numero1;
 Integer numero2 = this.numero2;

Scanner scanner = new Scanner(System.in);
 
System.out.println("Insira sim");
String sim = scanner.next();

do {

System.out.println("Insira o primeiro numero:");
numero1 = scanner.nextInt();

System.out.println("Insira o segundo numero:");
numero2 = scanner.nextInt();

lista333.add(new Numeros(numero1, numero2));

System.out.println("nao para sair");
String nao = scanner.next();

if (nao.equals("nao")) {
   break; 
   }

} while (sim.equals("sim")); 


for(Numeros list2 : lista333){
    System.out.println(" Numero 1: " + list2.numero1 + " Numero 2: " + list2.numero2);
}
   
    scanner.close();
   }

}
