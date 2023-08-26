package TESTES.Teste5;

//"%" retorna a sobra da divisão;
  
import java.util.Scanner;

public class Principal {
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

    System.out.println("Escreve ai:");
    String one = scanner.next();
   
    System.out.println(one.length() / 2 );
    System.out.println(one.length() % 2 );
 
    if(one.length() % 2 == 0 ){
        System.out.println("olá seu pobre");
    }
   
    scanner.close();

}
 
  

/*  
        public static String middle(String str)
     {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
     }
*/

}