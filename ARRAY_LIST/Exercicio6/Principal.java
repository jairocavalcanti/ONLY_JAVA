package ARRAY_LIST.Exercicio6;
import java.util.Scanner;
import java.util.ArrayList;

//Arraylist de 2 itens com funçao de remoçao 

public class Principal{

    public static void main(String[] args) {
    Principal prin = new Principal();
    prin.Array();   
    }
    

  public void Array() {
  String escolha;
  String escolha2;
  Integer esc3 = 0 ;

  Scanner scanner = new Scanner(System.in);

  ArrayList<Animais> lista = new ArrayList<Animais>();


  System.out.println("Deseja acessar a lista?");
  escolha = scanner.next();

  do {
  System.out.println("Insira o nome do animal:");  
  String nome1 = scanner.next();

  lista.add(new Animais(nome1));

   System.out.println("Deseja cadastrar mais algum animal?");
   escolha2 = scanner.next();
   if (escolha2.equals("nao")) {
   break;
   }
   
   } while (escolha.equals("sim"));

    for(Animais list : lista){
       System.out.println("Animal:"+ esc3++ + "--" + list.animal);      
    }

    scanner.close();
  }

  //lista.remove(2)

}
    

 
