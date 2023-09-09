package ARRAY.Exercicio13;

public class Uniao {
     

    public Uniao(){

    }


    public void uni(int array1[], int array2[], int array3[]){
       
        System.out.println("Array 1: ");
         for(int i = 0; i < array1.length; i++){
            System.out.print("[" + array1[i] + "]");
            array3[i] += array1[i];
        }

         System.out.println("\n");

         System.out.println("Array 2: ");
         for(int i = 0; i < array2.length; i++){
            System.out.print("[" + array2[i] + "]");
            array3[array1.length + i] = array2[i];         
        }
    
        System.out.println("\n");
    
        System.out.println("Array 3: ");
         for(int i = 0; i < array3.length; i++){
            System.out.print("[" + array3[i] + "]" );          
        }   
    
    }
}
