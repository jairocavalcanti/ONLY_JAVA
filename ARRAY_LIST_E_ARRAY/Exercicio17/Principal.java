package ARRAY_LIST_E_ARRAY.Exercicio17;

import java.util.Scanner;
import java.util.Random;

public class Principal {
   public static void main(String[] args)  {
      int cont = 0;
      ListaContato listaContato = new ListaContato();
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();

      System.out.println();
      System.out.println("LISTA");
      System.out.println("    ///////    /////    //    //    ///// ");
      System.out.println("       //     //   //    //  //    //   //");
      System.out.println("       //     ///////     ////     ///////");
      System.out.println("   //  //     //   //      //      //   //");
      System.out.println("    ////      //   //      //      //   //");
      System.out.println("1 - Iniciar programa // 0 - Encerrar programa");
      int inicio = scanner.nextInt();

       if(inicio == 0){
         System.out.println("Sistema encerrado! ");
      }

      while(inicio != 0){
      System.out.println("Insira a operação que deseja fazer na lista: " +
      " 1 - Cadastro " +
      " // 2 - Mostrar cadastros" +
      " // 3 - Excluir cadastro"  + 
      " // 4 - Buscar cadastro por ID" + 
      " // 5 - Alterar contato por ID" +
      " // 0 - Encerrar lista");
      int escolha = scanner.nextInt();

      if(escolha == 0){
         System.out.println("Sistema encerrado! ");
         break;
      }

      switch (escolha) {
        case 1:
         System.out.println("Insira quantos cadastros deseja fazer: " + "        (Voltar para tela de opçoes - 0)");
         int quantidade = scanner.nextInt();

         for(int i = 0; i< quantidade; i++){
            int id = random.nextInt(1,1000);
            System.out.println("Insira as informações do cadastro #" + (cont++ + 1) + " :");
            System.out.printf("Nome: ");
            String nome = scanner.next();
            System.out.printf("Id: ");
            System.out.println(id);
            System.out.printf("Idade: ");
            Double idade = scanner.nextDouble();
           
            System.out.println("------------------------------------------");
            
            Contato contato = new Contato(nome, id, idade);
           
            listaContato.addcontato(contato); 
         }
         break;
        
         case 2:

         System.out.println("-- CONTATOS PRESENTES NA LISTA --");
         System.out.println();
         listaContato.mostrarcontatos();

         break; 

         case 3:
      
         System.out.println("Insira o ID do contato que deseja remover:         (Voltar para tela de opçoes - 0)");
         int id = scanner.nextInt();

         if(id == 0){
            break;
         }

         listaContato.removecontato(id);         

         break;
        
         case 4:

         System.out.println("Insira o ID do contato que deseja achar na lista:           (Voltar para tela de opçoes - 0)");
         int id2 = scanner.nextInt();

         if(id2 == 0){
            break;
         }

         listaContato.mostrarcontatoporid(id2);
         break;

         case 5:

         System.out.println("Insira o ID do contato que deseja alterar:                  (Voltar para tela de opçoes - 0)");
         int id3 = scanner.nextInt();

         listaContato.alterarcontatoporid(id3, scanner);
         break;


         default:
         
         System.out.println("------------------------------------------");
         System.out.println("Insira uma alternativa válida !");
         System.out.println("------------------------------------------");
        
         break;
      }
   }

   
      scanner.close();
   }
    
}
