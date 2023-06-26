package LAMBDA.Pratico1;

import java.util.Scanner;
import java.util.ArrayList;
//import java.util.function.Consumer; 

public class Principal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

     ArrayList<Integer> valores = new ArrayList<>(); 
     ArrayList<Integer> dobro = new ArrayList<>();  
     ArrayList<Integer> par = new ArrayList<>(); 
     ArrayList<Integer> impar = new ArrayList<>(); 

     valores.add(1);
     valores.add(2);
     valores.add(3);
     valores.add(4);
     valores.add(5);
     valores.add(6);                   

     /* operação LAMBDA, associada a um consumer */
     //consumer precisa ser importado

     //Consumer<Integer> dobrar = (v) ->{dobro.add(v*2);};
     //valores.forEach(dobrar);

     /* operação lambda adicionando elementos nas diversas coleções em decorrencia dos valores da primeira coleção*/
     valores.forEach((v) -> {
        dobro.add(v*2);
         if(v%2 == 0){
            par.add(v); 
         }else{
            impar.add(v);
         }
    });
     
     System.out.println(valores);
     System.out.println(dobro); 
     System.out.println(par);
     System.out.println(impar);
     

     scanner.close();
}
    
}
