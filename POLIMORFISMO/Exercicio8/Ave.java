package POLIMORFISMO.Exercicio8;

public class Ave extends Animal {
        
    private String som;
    

    public Ave(String nome, String som) {
        super(nome, som);
        this.som = som;
    }


    public void someemitido(){
        System.out.println("Som de ave: " + som);
      }

}
