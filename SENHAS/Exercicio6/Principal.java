package SENHAS.Exercicio6;

import java.util.Scanner;

public class Principal {
    
    public static final int TAMANHO_SENHA = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma senha:");
        String senha = scanner.next();

        if(senhavalida(senha)){
            System.out.println("senha valida");
        }else{
            System.out.println("senha invalida");
        }

        scanner.close();

    }

    public static boolean senhavalida(String senha){
        if(senha.length() < TAMANHO_SENHA) return false;

        int contadordenumeros = 0;
        for(int i = 0; i<senha.length();i++){

            char ch = senha.charAt(i);

            if(numeros(ch) == true) contadordenumeros++;
            else return false;
        }
         return contadordenumeros != 0;
    }


    public static boolean numeros(char ch){
        return(ch >= '0' && ch <= '9');
    }


}
