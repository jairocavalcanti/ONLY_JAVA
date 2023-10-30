package ESTRUTURA_DE_REPETIÇÃO.Exercicio2;
import java.util.Scanner;

 /*
 Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
 mostrando uma mensagem de erro e voltando a pedir as informações  
 */

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int limite = 1000;

      for(int i = 0; i< limite; i++){
       
        System.out.println("Insira o nome de usuario: ");
        String nome_de_usuario = scanner.next();

        System.out.println("Insira a senha: ");
        String senha = scanner.next();

        
        if(nome_de_usuario.equals(senha)){
            System.out.println("ERRO: nome de usuario é igual a senha!");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Registrado!");
            System.out.println("Nome de usuario: " + nome_de_usuario);
            System.out.println("Senha: " + senha);
            break;
        }

      }
      scanner.close();
    }
    
}
