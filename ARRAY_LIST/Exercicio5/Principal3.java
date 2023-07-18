package ARRAY_LIST.Exercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class Principal3 {
    
    public static void main(String[] args) {
   
       ArrayList<String> nomes = new ArrayList<String>();
       nomes.add("Jairo");   
       nomes.add("Marcos");  
       nomes.add("Zason");  
      

        //sort -- ordenar -- ordem crescente
        Collections.sort(nomes);

       // ordem decrescente
       //Collections.sort(nomes, Collections.reverseOrder());

       for (String nome : nomes) {
        System.out.println(nome);
       }
     }
}
