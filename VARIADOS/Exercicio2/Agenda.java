package VARIADOS.Exercicio2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;



public class Agenda {

ArrayList<Pessoa1> lista = new ArrayList<Pessoa1>();

String nome;
Integer idade;
Integer id;

public void criapessoa() {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

String nome = this.nome;
Integer idade = this.idade;
Integer id = this.id;

System.out.println("Adicionar nome na lista:");
nome = scanner.next();

System.out.println("Adicionar idade na lista:");
idade = scanner.nextInt();

id = random.nextInt(100);
System.out.println("--ID do cadastrado:--" + id);
System.out.println("|||||||||||||||||||||||");

lista.add(new Pessoa1(nome,idade,id));

scanner.close();
}


//mostrando cadastro posto na lista
public void mostrarcadastro(){
System.out.println("----CADASTROS REALIZADOS----");

for(Pessoa1 Pessoa : lista){

  System.out.println( "Nome do individuo:" + "  " + Pessoa.nome + "  <<>>  "  + "Idade do individuo:" + " " + Pessoa.idade + " <<>> " +"ID do individuo:" + Pessoa.id);
  System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
  }
}  

    //mostrando posicao do cadastro na lista
    public void posiçao(){

    for(Pessoa1 Pessoa : lista){
    
    int n = lista.size();
  
    for (int i=0; i<n;){
    System.out.printf("\n:----POSITION----:" + n + "\n");
    System.out.println("-----------------------------------");
    break;
    }
    System.out.println("Posição do contato:" + Pessoa.nome);
    System.out.println("ID do contato:");
  
  }

}

/* 
System.out.println("----ID DO CADASTRO----");
System.out.println("ID de " + Pessoa.nome + ":" + id);
System.out.println("//////////////////////////////");
*/


}
 



 