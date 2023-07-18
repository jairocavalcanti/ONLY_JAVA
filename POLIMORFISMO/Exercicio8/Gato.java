package POLIMORFISMO.Exercicio8;

public class Gato extends Animal {

    private String som;

    public Gato(String nome, String som) {
        super(nome, som);
        this.som = som;
    }
   
    public void someemitido(){
       System.out.println("Som de gato: " + som);
    }

}
