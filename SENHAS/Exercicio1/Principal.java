package SENHAS.Exercicio1;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);    

    String senha = "";
    int tamanho = 10;
    int temterletras = 3;
    int qtdeletras = 0;
    boolean tamanhoOK = false;
    boolean letrasOK = false;

    //verificação do tamanho da senha
    do {
        
        System.out.println("Insira sua senha: ");
        senha = scanner.next(); 

        tamanhoOK = senha.length() >= tamanho;

        qtdeletras = 0;

        for(int i = 0 ; i < senha.length() ; i++){
            if( senha.toLowerCase().charAt(i) >= 'a' &&
                senha.toLowerCase().charAt(i) <= 'z'){
                
                qtdeletras++;
                }        
            }

            letrasOK = ( qtdeletras >= temterletras );

    } while ( ! tamanhoOK || ! letrasOK );
   
    scanner.close();
    
   }
}
