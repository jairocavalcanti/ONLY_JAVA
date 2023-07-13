package METODOS.Exercicio3;
import java.util.Scanner;

public class Metodo {   
// Escreva um método Java que verifique se todos os caracteres em uma determinada string são vogais (a, e,i,o,u) ou não. 
//Retorne true se cada caractere da string for uma vogal, caso contrário, retorne false


String select = "";
Integer contador = 0;
boolean decisao;


public void verificaçao(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva uma palavra ou frase qualquer:");
    select = scanner.next();

    for(int i=0; i <select.length(); i++){
        if(select.charAt(i) == 'a' ||
        select.charAt(i) == 'e' ||
        select.charAt(i) == 'i' ||
        select.charAt(i) == 'o' || 
        select.charAt(i) == 'u' ){
       
        decisao = true;
        contador++;
    
    }else{
          
        decisao = false;
        
    }
    
}
     
       System.out.println("ha apenas vogais na palavra: " + decisao);


        System.out.println("numero de vogais na escrita:" + contador);    
    if(contador >= 5){
        System.out.println("mais de 5 caracteres do tipo 'vogal' incluidos");
        }
    if(contador <= 0){
        System.out.println("Nenhuma vogal incluida");
        }

   
     scanner.close();
    
  }
}
