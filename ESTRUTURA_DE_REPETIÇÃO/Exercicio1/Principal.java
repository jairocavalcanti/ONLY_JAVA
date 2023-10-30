package ESTRUTURA_DE_REPETIÇÃO.Exercicio1;
import java.util.Scanner;

  /*
  Faça um programa que peça uma nota, entre zero e dez. 
  Mostre uma mensagem caso o valor seja inválido e continue 
  pedindo até que o usuário informe um valor válido
  */

public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int limite = 1000;

      for(int i = 0; i<limite; i++){
          System.out.println();
          System.out.println("Insira um numero entre 0 e 10: ");
          int numero = scanner.nextInt();

        if(numero >=0 && numero <= 10){
          System.out.println("Numero inserido esta entre 0 e 10: " + numero);
          break;
        }else{
            System.out.println("Por favor, informe um valor valido!");
          }
      }
      scanner.close();
    } 
}
