package ENCAPSULAMENTO.Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    
   private List<Conta> lista_jogadores = new ArrayList<>();

   public BancoDeDados(){

   }

   public void adicionarusuario(String id, String nome_do_jogador, Integer créditos){
     for(Conta lis : lista_jogadores){
       if(lis.getId().equals(id)){
        System.out.println("Conta já registrada!");
        return;
       }
     }
   
     Conta novaconta = new Conta(id, nome_do_jogador, créditos);
     lista_jogadores.add(novaconta);
     System.out.println(" -- Conta criada com sucesso! --");
    }


    public void removerconta(String id){
        for(Conta lis: lista_jogadores){
          if(lis.getId().equals(id)){
            lista_jogadores.remove(lis);
            System.out.println("-- Conta fechada com sucesso! --");
            System.out.println("A conta registrada no ID: " + lis.getId() + " não é mais existente.");
            return;
          }
        }
      System.out.println("ID inserido não existente, conta não encontrada.");
      }


   public void sacarcreditos(String id, Integer valor){
     for(Conta lis: lista_jogadores){
      if(lis.getId().equals(id)){
        lis.sacarcreditos(valor);
        return;
      }
     }
     System.out.println("ID inserido não existente, conta não encontrada.");
    }
    

    public void depositarcreditos(String id, Integer valor){
      for(Conta lis: lista_jogadores){
        if(lis.getId().equals(id)){
          lis.depositarcreditos(valor);
          return;
        }
      }
     System.out.println("ID inserido não existente, conta não encontrada.");
    }


   public void ConsultarCreditos(String id){
      for(Conta lis: lista_jogadores){
          if(lis.getId().equals(id)){
            lis.verificarcreditos();
            return;
          }
      }
    System.out.println("ID inserido não existente, conta não encontrada.");
    }

}
