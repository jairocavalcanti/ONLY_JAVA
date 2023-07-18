package SENHAS.Exercicio5;

import java.util.Scanner;

public class Principal {

    public static final int PASS_LENGTH = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Insira uma senha:");
        String senha = scanner.next();
   
        if(senhavalida(senha)){
            System.out.println("Senha valida: " + senha);
        }else{
            System.out.println("Senha invalida: " + senha);
        }
    
        scanner.close();
    }
    


    public static boolean senhavalida(String password){

        if(password.length() < PASS_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for(int i = 0; i < password.length(); i++){

            char ch = password.charAt(i);

            if(numeros(ch)) numCount++;
            else if(letras(ch)) charCount++;
            else return false;
        }


        return(charCount >= 2 && numCount >= 2);
    }


    public static boolean letras(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');   
    }


    public static boolean numeros(char ch){
        return(ch >= '0' && ch <= '9');
    }


}
