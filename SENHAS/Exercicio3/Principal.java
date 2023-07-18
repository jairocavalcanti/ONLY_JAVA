package SENHAS.Exercicio3;

import java.util.Scanner;

public class Principal {
    
    static boolean verificaçãodecaracteres = false;
    static boolean verificacaodetamanho = false;
    static String senha;
    static int tamanhodasenha = 5;
    static int caracteresnecessarios = 3;

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        while(!verificacaodetamanho || !verificaçãodecaracteres){
        System.out.println("Insira a senha senhor: ");
        senha = scanner.next();
    

        verificacaodetamanho = senha.length() >= tamanhodasenha;
       
        cont = 0;
        for(int i = 0; i < senha.length(); i++){
            if(senha.charAt(i) >= 'a' && senha.charAt(i)<= 'z'){
                cont++;
            }
        }

        verificaçãodecaracteres = (cont >= caracteresnecessarios);

        System.out.println("Quantidade de caracteres na senha: " + cont); 
    
    }


        scanner.close();
       }

    }