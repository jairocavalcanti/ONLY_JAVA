package ARRAY_LIST.Exercicio5;

import java.util.ArrayList;
public class Principal {

  public static void main(String[] args) {
    
    //Array (vetor) -- com um tamanho fixo de 5 posições 
    String[] ArrayEstatico = new String[5];
    ArrayEstatico[0] = "Jairo";
    ArrayEstatico[1] = "Luisa";
    ArrayEstatico[2] = "Sarah";  
    ArrayEstatico[3] = "Mariana";
    ArrayEstatico[4] = "Pedro";
   
    // ArrayList<Tipo> nome = new ArrayList<Tipo>();   
    ArrayList <String> arrayDinamico = new ArrayList<String>();
    arrayDinamico.add("Jairo"); // indice 0
    arrayDinamico.add("Luisa"); // indice 1
    arrayDinamico.add("Sarah"); // indice 2
    arrayDinamico.add("Mariana"); // indice 3
    arrayDinamico.add("Pedro"); // indice 4

    //Imprimir Array Estatico 
    System.out.println("Imprimindo array estático");
    for (int indice = 0; indice < ArrayEstatico.length; indice ++){
        System.out.println(ArrayEstatico[indice]);
    }

    //Removendo elemento do ArrayList
    //DAHORA
    System.out.println("Remover Sarah");
    arrayDinamico.remove(2);
    
    
    //Limpa o arraylist
    //arrayDinamico.clear(); 

    //Tamanho do ArrayList
    System.out.println(arrayDinamico.size());

    //Utiliza-se de metodos para que sejam mostrados os dados
    //.size()
    //.get(variavel)
    System.out.println("Imprimindo ArrayList");
    for (int indice = 0; indice < arrayDinamico.size(); indice ++){
        System.out.println(arrayDinamico.get(indice));
    }
    
    //forma mais facil de mostrar os dados 
    for(String nome : arrayDinamico){
        System.out.println(nome);
    }
    
    

}



}
