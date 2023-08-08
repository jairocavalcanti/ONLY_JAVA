package ARRAY_LIST_E_ARRAY.Exercicio8;

public class Principal {
//Escreva um programa Java para somar valores de uma matriz 
// '+=' operador de atribuição de adição 
//  O código x+=y é equivalente a x=x+y


     public static void main(String[] args) {
     int myarray[] = {1,2,3,4,5,6,7,8,9,10};
     int num = 0;

     for(int i : myarray)
     num += i;
    
     //soma dos elementos do vetor
     System.out.println("The num is:" + num);
      

        

   }
}