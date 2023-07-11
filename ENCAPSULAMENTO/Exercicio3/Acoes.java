package ENCAPSULAMENTO.Exercicio3;

public class Acoes implements metodos {


    @Override
    public void atacar() {
    System.out.println("Atacando!");
    }

    @Override
    public void defender() {
    System.out.println("Defendendo!");        
    }

    @Override
    public void miss() {
    System.out.println("Miss!"); 
    }
    
}
