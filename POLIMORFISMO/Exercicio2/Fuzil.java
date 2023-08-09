package POLIMORFISMO.Exercicio2;

public class Fuzil extends Armas {


    @Override
    public void atirar() {
        System.out.println("Fuzil atirando");   
    }

    @Override
    public void mostrarnome() {
       System.out.println("Nome do fuzil: " + getNome());
    }

    @Override
    public void mostrarclasse() {
        System.out.println("Fuzil de médio alcance");
    }

    @Override
    public void mostrarpeso() {
        System.out.println("Peso do fuzil: " + getPeso());
    }

   
    
    



}
