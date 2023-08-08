package ARRAY_LIST_E_ARRAY.Exercicio2;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

ArrayList<Control> list = new ArrayList<>();

System.out.println("Deseja iniciar lista?");
String add = scanner.next();

do {

System.out.println("Insira um nome:");
String nome = scanner.next();
    
list.add(new Control(nome));

System.out.println("Deseja adicionar mais  algum nome?");
String add2 = scanner.next();
if (add2.equals("nao")) {

break;
}

} while (add.equals("sim"));


for(Control l: list){
  System.out.println("Nomes na lista:" + l.nome);
   }
  scanner.close();
  } 
 } 