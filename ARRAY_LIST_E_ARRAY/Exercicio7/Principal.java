package ARRAY_LIST_E_ARRAY.Exercicio7;
import java.util.Scanner;

import java.util.ArrayList;

public class Principal {
    
    String item1;
    String item2;
    String escolha;
    

    public static void main(String[] args) {
    
    int tammanhonece = 5;
    String senha;
    boolean verifsenha = false;
    boolean verifsenha2 = false;
    String senha2 = "";

    Principal prin = new Principal();
    Scanner scanner = new Scanner(System.in);

    do {

    System.out.println("P4r4 3ntr4r 1ns1r4 a s3nh4: ");
    senha = scanner.next();
     
    verifsenha = senha.length() >= tammanhonece;

    if(!verifsenha){
        System.out.println("senha muito curta");
        }
  
     }while (!verifsenha);

     verifsenha2 = senha.equals(senha2);

    do {
        
    System.out.println("Senha inserida:" + senha);
    System.out.println("Por favor confirme sua senha para entrar:");
    senha2 = scanner.next();

    if(senha.equals(senha2)){
        System.out.println("Senha validada com sucesso!");
        break;
    }else{
        System.out.println("Senha invalida!");
    }
      
     } while (!verifsenha2);

    prin.rpg();

    scanner.close();
    }

    public void rpg() {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Itens> lista = new ArrayList<Itens>();

    System.out.println("Deseja inserir seus itens na lista?");
    String esc1 = scanner.next();

    do {
    
    System.out.println("Insira o nome da sua espada");
    item1 = scanner.next();

    System.out.println("Insira o nome do seu arco");
    item2 = scanner.next();
    
    lista.add(new Itens(item1, item2));

    System.out.println("Deseja inserir mais itens?");
    escolha = scanner.next();

    if(escolha.toLowerCase().equals("nao")){
    System.out.println("Saindo da inserção de itens...");
    break;
    }
    
    } while (esc1.toLowerCase().equals("sim"));

     for( Itens it : lista ){
         System.out.println("ITENS INSERIDOS:" + it.espada + "  " + it.arco);
     }

     scanner.close();
    }
 }
