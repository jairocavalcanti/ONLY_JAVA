package ARRAY.Exercicio6;

public class Teste3 { 
    public static void main(String[] args) {
    
        int vetor[] = {30,2,50,10,70,80};

        int menornumero = vetor[0];

        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] < menornumero){
                menornumero = vetor[i];
            }
        }
 
         System.out.println("Menor numero do vetor: " + menornumero);
    }
    
}
