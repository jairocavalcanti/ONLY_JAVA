package ESTRUTURA_DE_DECISÃO.Exercicio5;
import java.util.Scanner;

/* Faça um programa para a leitura de duas notas parciais de um aluno. 

O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.  */

public class Principal {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double media = 0;
     double nota1 = 0;
     double nota2 = 0;

     System.out.println("Insira a primeira nota do aluno: ");
     nota1 = scanner.nextDouble();

     System.out.println("Insira a segunda nota do aluno: ");
     nota2 = scanner.nextDouble();

     media = (nota1 + nota2) / 2;

     System.out.println("Media obtida: " + media);
     if(media == 10){
        System.out.println("Aprovado com distinção");
     }else if(media < 7){
        System.out.println("Reprovado");
     }else{
        System.out.println("Aprovado ");
     }
    


     scanner.close();
  }   
}
