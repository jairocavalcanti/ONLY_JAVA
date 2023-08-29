package ARRAY_LIST_E_ARRAY.Exercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
        ArrayList<Atcontatos> lista = new ArrayList<Atcontatos>();

         System.out.println("insira a quantidade de cadastros que deseja realizar: ");      
         Integer iconal = scanner.nextInt();

         int i = 0;
         while(i < iconal){
        
         System.out.println("// --- CADASTRO --- //");

         System.out.println("!! -- Insira o ID: ");
         String id = scanner.next();

         System.out.println("Insira o nome do cadastro: ");
         String nome = scanner.next();


         lista.add(new Atcontatos(nome, id));
         i++; 
         }

        
        for(Atcontatos lis :  lista){
          System.out.println(" -- ID do cadastro -- " + "[" + lis.getId() + "]" + "--");
          System.out.println("Nome cadastrado: " + lis.getNome());  
         }

         String alternativa = "" ;
         while(alternativa != "0"){
         System.out.println("Operaçoes disponiveis: 1 - Remover Elemento // 2 - Visualizar Lista // 3 - Adicionar novo contato  // 0 - Sair");
         alternativa = scanner.next();
         
         if(alternativa.equals("1")){
          
          System.out.println("Insira o ID que deseja remover: ");
          String id2 = scanner.next();
          
          //Removendo contato especifico da lista atraves do ID 
          for (Atcontatos contato : lista) {
            if (contato.getId().equals(id2)) {
                lista.remove(contato);
                System.out.println("Contato removido com sucesso.");
                break;
              }
           }
        }
  
        //Mostrando lista com seus dados preenchidos, caso ja tenham sido todos removidos, a mensagem "LISTA VAZIA" será exibida
        if(alternativa.equals("2")){
          if(lista.isEmpty()){
            System.out.println("(((((LISTA VAZIA)))))");
          }else{
            for(Atcontatos lis :  lista){
            System.out.println(" -- ID do cadastro -- " + "[" + lis.getId() + "]" + "--");
            System.out.println("Nome cadastrado: " + lis.getNome());  
          }
        }
   }

        if(alternativa.equals("3")){
         System.out.println("// --- ADIÇÃO DE CADASTRO --- //");
         System.out.println("!! -- Insira o ID: ");
         String id = scanner.next();

         System.out.println("Insira o nome do cadastro: ");
         String nome = scanner.next();
         
         System.out.println("!! CONTATO ADICIONADO COM SUCESSO !!");

         lista.add(new Atcontatos(nome, id));
        }


        if(alternativa.equals("0")){
           System.out.println("Saindo do programa...");
           
           return;
          }
        }
      }
    }
  }    


