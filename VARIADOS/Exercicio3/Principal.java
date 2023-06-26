package VARIADOS.Exercicio3;
import java.util.Scanner;
/*Crie uma classe MediaAluno que contenha um atributo do tipo vetor de
inteiros com o nome de notas. Essa classe deve ter um método para adicionar
as notas nesse vetor (os valores que podem ser adicionados no vetor são os
inteiros entre 0 e 100, caso contrário imprime uma mensagem de erro e não
adiciona) e outro método que calcule a média de um aluno e imprima essa
média.  */

public class Principal {
    public static void main(String[] args) {
     try (Scanner scanner = new Scanner (System.in)) {
      MediaAluno al = new MediaAluno();
      String nome;
       
      

      System.out.println("Digite 'sim' para acessar painel");
      String s = scanner.next();
      
      if(s.equals("nao")){
      System.out.println("Programa encerrado");
      return;
      
  }else{  

      do {
      System.out.println("Deseja começar operaçoes?");
      String esc = scanner.next();

      if (esc.equals("nao")) {
      System.out.println("encerrado");
      break;
      }
      
      System.out.println("Insira o nome do aluno:");
      nome = scanner.next();
      System.out.println("NOME DO ALUNO:" + nome);
      al.INSERIR_NOTAS();
      
      System.out.println("Deseja visualizar notas do aluno: " + nome + "?");
      String esc3 = scanner.next();
      if(esc3.equals("sim")){
      al.calcularmedia();
      }else{
      System.out.println("ENCERRANDO...");
      return;
      }
 

    } while (s.equals("sim"));
  
       }   
    scanner.close();
      }
   }
 } 

