package POLIMORFISMO.Exercicio2;

public class AK47 extends Fuzil {

    public void atirar() {
        System.out.println("Fuzil - " + getNome() + " - atirando");   
    }

    public void mostrarpeso(){
         System.out.println("Peso do AK47: " + getPeso() + "KG"); 
    }

}
