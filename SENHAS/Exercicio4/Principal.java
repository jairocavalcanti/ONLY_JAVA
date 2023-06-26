package SENHAS.Exercicio4;

import java.util.Scanner;
/*Escreva um método Java para verificar se uma string é uma senha válida.
Regras de senha:
Uma senha deve ter pelo menos dez caracteres.
Uma senha consiste apenas em letras e dígitos.
Uma senha deve conter pelo menos dois dígitos.

Saída Esperada: */
public class Principal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 
        String senha = "";
        int caracteresespeciais = 0;
        int letrasenha = 10;
        int numerosnasenha = 0;
        Boolean conftamanhosenha = false;
        Boolean confnumerosnasenha = false;

        do{
        System.out.println("Insira uma senha");
        senha = scanner.next();
        
        caracteresespeciais = 0;
        numerosnasenha = 0;
          for(int i = 0; i<senha.length(); i++){
              if(senha.charAt(i) >= '0' && senha.charAt(i) <='9'){
                numerosnasenha++;
              }else{
                caracteresespeciais++;
              }
        }
        
        caracteresespeciais = 0;
        letrasenha = 0;
        for(int i = 0; i<senha.length(); i++){
            if(senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z'){
               letrasenha++;
            }else{
              caracteresespeciais++;
            }
        }

        conftamanhosenha = letrasenha >= 10;
        confnumerosnasenha = numerosnasenha >= 2;
      
    }   while(!conftamanhosenha || !confnumerosnasenha);
        
        scanner.close();
   
        System.out.println("Caracteres especiais na senha: = " + caracteresespeciais);
        System.out.println("Numeros na senha: = " + numerosnasenha );

    }
}
