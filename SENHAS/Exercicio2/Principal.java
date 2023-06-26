package SENHAS.Exercicio2;
import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String senha;    
    int tamanho = 5;
    int temterletras = 3;
    int qtdeletras = 0;
    boolean tamanhoOK = false;
    boolean letrasOK = false;


    do {
        System.out.println("Insira sua senha:");
        senha = scanner.next();

        //tipo booleano sera falso ate que a senha exceda o tamanho da variavel 'tamanho';
        tamanhoOK = senha.length() >= tamanho;
        
        qtdeletras = 0;

        //Estrutura para verificação dos caracteres 
        for(int i = 0 ; i < senha.length() ; i++){
            if(senha.charAt(i) >= 'a' &&
               senha.charAt(i) <= 'z'){

                qtdeletras++;
               }
            }
       
        } while ( ! tamanhoOK);

        System.out.println(senha);
        System.out.println(tamanhoOK);
        System.out.println(qtdeletras);

        scanner.close();
    
        //so pra utiizar
        System.out.println(temterletras);
        System.out.println(letrasOK);
    
    }
}
