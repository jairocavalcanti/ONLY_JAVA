package ARRAY.Exercicio14;
import java.util.Scanner;

public class Maiorelemento {
    
    private Integer maiorelemento = 0;

    public Maiorelemento(){

    }

    public void maiorelemento(int array[], Scanner scanner){
        for(int i = 0; i< array.length; i++){
            System.out.println("Insira o elemento #" + (i + 1) + " :");
            array[i] = scanner.nextInt();
             
            if(array[i] > maiorelemento){
                maiorelemento = array[i];
            }
        }
        System.out.println("Maior elemento presente no vetor: " + maiorelemento);
    }


}
