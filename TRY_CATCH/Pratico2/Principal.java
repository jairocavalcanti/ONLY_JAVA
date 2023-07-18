package TRY_CATCH.Pratico2;

import java.util.Scanner;

public class Principal {
    
   static String n1 = "jairo";
   static String n2 = "vit";

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
      
        try {
        Source s = new Source(n1, n2);
        System.out.println(s.met());
    
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    
        scanner.close();
    }



}
