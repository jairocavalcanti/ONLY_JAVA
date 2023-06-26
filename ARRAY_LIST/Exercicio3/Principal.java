package ARRAY_LIST.Exercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
 
String nome;
String pais_de_origem;
Double calibre;
String esc3;


ArrayList <Armas> lista = new ArrayList<>();

public static void main(String[] args) {
Principal prin = new Principal();

prin.METODO();

}

public void METODO(){
String nome = this.nome;
String pais_de_origem = this.pais_de_origem;
Double calibre = this.calibre;


Scanner scanner = new Scanner (System.in); 

System.out.println("Deseja cadastrar arma?");
String esc1 = scanner.next();

do {
System.out.println("Insira o nome da arma:");
nome = scanner.next();

System.out.println("Insira o país de origem:");
pais_de_origem = scanner.next();

System.out.println("Insira o calibre da arma:");
calibre = scanner.nextDouble();

lista.add(new Armas(nome, pais_de_origem, calibre));
 
System.out.println("Deseja cadastrar mais armas?");
String esc2 = scanner.next();

if (esc2.equals("nao")) {
   break;  
}

} while (esc1.equals("sim") || esc1.equals("SIM") || esc1.equals("Sim"));


System.out.println("----ARMAS_CADASTRADAS-----");

for(Armas list2 : lista){
   System.out.println("Nome da arma:" + list2.nome + "  //  " + "País de origem:" + list2.pais_de_origem +"  //  " + "Calibre:" + list2.calibre);
}
    do {
    System.out.println("Deseja visualizar alguma informaçao sobre as armas cadastradas? 1 - nome // 2 - calibre // 3 - país de origem // 4 - sair");
    esc3 = scanner.next();
    switch (esc3) {
    
      case "1":
      System.out.println("------NOMES DAS ARMAS CADASTRADAS------");
      for(Armas list2 : lista){
      System.out.println("Nomes:" + list2.nome);
      }
      break;

      case "2":
      System.out.println("------CALIBRE DAS ARMAS CADASTRADAS------");
      for(Armas list2 : lista){
      System.out.println("Calibres:" + list2.calibre);
      }
      break;

      case "3":
      System.out.println("------PAÍS DE ORIGEM DAS ARMAS CADASTRADAS------");
      for(Armas list2: lista){
      System.out.println("Países de origem:" + list2.pais_de_origem);
      }
      break;
      
      default:
      System.out.println("Insira uma informaçao valida");
      
      case "4":
      System.out.println("Programa finalizado....");
      return;
      


       } } while  (esc1.equals("sim") || esc1.equals("SIM") || esc1.equals("Sim"));
 
  
   scanner.close();
   }
 }
  
