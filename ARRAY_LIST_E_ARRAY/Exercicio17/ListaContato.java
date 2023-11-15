package Exercicio1;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ListaContato {

     private List<Contato> lista = new ArrayList<Contato>();

     
     public ListaContato(){

     }

     public List<Contato> getLista() {
          return lista;
     }
    
     public void addcontato(Contato cont){
          lista.add(cont);
     }


     // Método para remover um contato da lista com base no ID fornecido.
     public void removecontato(int id){
          // Cria um Iterator para percorrer os elementos da lista.
          Iterator<Contato> iterator = lista.iterator();
      
        // Loop enquanto houver elementos na lista.
        while(iterator.hasNext()){ 

          // Obtém o próximo contato da lista.
          Contato contato = iterator.next();
          
          // Verifica se o ID do contato atual corresponde ao ID fornecido.
          int ident = contato.getId();
     
           
          if(id == ident){
              
               // Remove o contato da lista usando o Iterator.
               iterator.remove();
               System.out.println("------------------------------------------");
               // Imprime uma mensagem indicando que o contato foi excluído com sucesso.
               System.out.println("Contato excluido com sucesso !");
               System.out.println("--- Informações do contato excluido ---");
               System.out.println(contato.getNome());
               System.out.println(contato.getIdade());
               System.out.println("------------------------------------------");     
               // Encerra o método, pois o contato foi removido.
               return; 
              
               }           
          }

          System.out.println("ID inserido não existente na lista!");


     }


     public void mostrarcontatoporid(int id){
          Iterator<Contato> iterator2 = lista.iterator();

          while(iterator2.hasNext()){

               Contato contato = iterator2.next();

               int ident2 = contato.getId();

               if(id == ident2){
                    System.out.println("------------------------------------------");
                    System.out.println("Dados do contato de ID: " + id);
                    System.out.println("Nome: " + contato.getNome());
                    System.out.println("Idade: " + contato.getIdade());
                    System.out.println("------------------------------------------");   
                    return;
               }
          }

          System.out.println("ID inserido nao existente! ");

     }




     public void mostrarcontatos(){
        for(Contato contato: lista){
          System.out.println(contato);
        }
     }


     /*
     public void removeContato(int id) {
     Iterator<Contato> iterator = lista.iterator();

    while (iterator.hasNext()) {
        Contato contato = iterator.next();
        if (id == contato.getId()) {
            iterator.remove();
            System.out.println("Contato excluído com sucesso!");
            return; // Termina a execução após encontrar e remover o contato
          }
     }

    System.out.println("ID inserido não corresponde a nenhum contato na lista!");
 }  
      */


     
     /*
     public void removecontato(Contato cont, int id){
          if(id == cont.getId()){
          lista.remove(cont);
          System.out.println("Contato excluido com sucesso!"); 
        }else{
          System.out.println("ID inserido nao corresponde a nenhum contato na lista!");
        }
     }
     */


     
}
