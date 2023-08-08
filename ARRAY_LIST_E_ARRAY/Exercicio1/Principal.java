package ARRAY_LIST_E_ARRAY.Exercicio1;

import java.util.ArrayList;

public class Principal {
    
      public static void main(String[] args) {

        ArrayList <Consoles> console = new ArrayList<>();

        Consoles con2 = new Consoles("PlayStation 5", "Branco", "Digital Media",9090);

        Consoles con3 = new Consoles("PlayStation 4", "Preto", "Pro",8080);

        Consoles con4 = new Consoles("PlayStation 3", "Preto", "Slim",7070);

        Consoles con5 = new Consoles("PlayStation 2", "Prata", "Fat",6060);


        console.add(con2);
        console.add(con3);
        console.add(con4);
        console.add(con5);


        for (Consoles con : console ){
         
          System.out.println(con);
        }

        System.out.println("Total de itens da lista:" + console.size());

        console.remove(con2);

        System.out.println(console.contains(con2));
        
        


      }
    

}
