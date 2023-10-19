package ESTRUTURA_DE_DECISÃO.Exercicio3;
import java.util.Scanner;

/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido */

public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.printf("Insira seu sexo F - feminino // M - masculino : ");
       Character sex = scanner.next().charAt(0);

       if(Character.toUpperCase(sex) == 'F' ){
           System.out.println("sexo identificado: FEMININO");
       }else if(Character.toUpperCase(sex) == 'M'){
           System.out.println("sexo identificado: MASCULINO");
       }else{
           System.out.println("sexo inválido");
       }


       scanner.close();
    }
    
}
