package LAMBDA.Pratico1;

import java.util.ArrayList;

public class Principal2 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(2);
        list.add(3);
       
        //ArrayList 'list2' tem como função principal multiplicar por 2 os elementos do arraylist 'list'
        //Operação essa que acontecerá através da função lambda abaixo
        ArrayList<Integer> list2 = new ArrayList<>();
        
        //Função lambda responsavel pela operaçao de multiplicação por 2 dos elementos do arraylist 'list'
        //Responsavél tambem por inserir os elementos modificados no arraylist 'list2'
        list.forEach(((G) -> {list2.add(G*2);}));

        System.out.println();

        System.out.println("Elementos do ArrayList:");
        System.out.println(list);

        System.out.println();

        System.out.println("Elementos multiplicados por 2:");
        System.out.println(list2);


    }
}
