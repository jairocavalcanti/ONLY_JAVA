package ARRAY_LIST.Exercicio5;

import java.util.ArrayList;
import java.util.Collections;

public class Principal2 {

    public static void main(String[] args) {
      
        /*
         Tipo Primitivo ---- Wrapper Class
         int             --   Integer
         float           --   Float
         double          --   Double
         char            --   Character 
       */

       ArrayList<Integer> numeros = new ArrayList<Integer>();
       numeros.add(50);   
       numeros.add(34);  
       numeros.add(56);  
       numeros.add(21);  
       numeros.add(5);  
       numeros.add(-2);  
       numeros.add(3);  
       numeros.add(234);  

       // sort -- ordenar -- ordem crescente
       //Collections.sort(numeros);

       // ordem decrescente
       Collections.sort(numeros, Collections.reverseOrder());

       for (Integer numero : numeros) {
        System.out.println(numero);
       }
     }
  }
    

       /*Pessoa joao = new Pessoa("JOAO", 20);
       Pessoa maria = new Pessoa("Maria", 22);
       Pessoa pedro = new Pessoa("Pedro", 75);
    
       ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
       pessoas.add(joao);
       pessoas.add(maria);

       for (Pessoa pessoa : pessoas) {
           System.out.println(pessoa.getNome());
       }
           */
       

    
    

