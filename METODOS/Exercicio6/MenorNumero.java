package METODOS.Exercicio7;

public class MenorNumero {
    

    public void menornumero(Double numero1, Double numero2, Double numero3){
     
        double vetor[] = {numero1,numero2,numero3};
        double position = vetor[0];
       
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] < position){
               position = vetor[i];
            }
        }

        System.out.println("Menor numero inserido: " + position);
    } 

}
