package SENHAS.Exercicio2;

import java.util.Scanner;

public class Testes2 {
   

    //VERIFICAÇAO DO TAMANHO DA SENHA SEMPRE COM BOOLEANO CARALHOO!!!

    public static void main(String[] args) {
    Integer quantidade = 0;
    boolean parametro;
    Integer t = 5;
    String senha;
    Scanner scanner = new Scanner(System.in); 

    do {
     
    System.out.println("Insira a senha:");
    senha = scanner.next();

    parametro = senha.length() >= t ;
    
    for (int i = 0; i < senha.length(); i++){
        if(senha.charAt(i) >='a' && senha.charAt(i) <= 'z' && senha.length() >= t){
        quantidade++;
         }
       }
    
   
    } while ( ! parametro);

    System.out.println("Quantidade de algarismos na senha:" + quantidade);
  
    scanner.close();
  }
    
}