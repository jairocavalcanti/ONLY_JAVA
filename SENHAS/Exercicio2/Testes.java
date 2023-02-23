package SENHAS.Exercicio2;
import java.util.Scanner;

public class Testes {


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
   
    boolean ok = false;
    int tamanho = 5;
    String palavra = "";
    int letras = 0;

    do {
        
    System.out.println("Escreva uma palavra:");
    palavra = scanner.next();
   
    ok = palavra.length() >= tamanho;
   
    //Verificaçao de caracteres na senha 
    //Tipo i vai percorrer todoso os caracteres e procurar de 'A' a 'Z'
    for(int i = 0 ; i < palavra.length() ; i++){
        if( palavra.charAt(i) >= 'a' && 
            palavra.charAt(i) <= 'z'){
           
                letras++;
        }
    }
   
    if(letras < tamanho){
        System.out.println("!!Faltam letras nessa senha!!");
    }else{
        System.out.println("Senha aceita com sucesso!");
    }


    //Uso do charAt
    System.out.println(palavra.charAt(0));


    System.out.println(ok);
    System.out.println("Letras na senha:" + letras);


    } while ( ! ok || letras < tamanho );



    scanner.close();
    }
    
}
