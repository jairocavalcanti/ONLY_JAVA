package POLIMORFISMO.Exercicio1;

public class Ave extends Animal {
     private String corpena;


    @Override
    public void locomover() {
      System.out.println("Voando");
    } 

    @Override
    public void alimentar() {
      System.out.println("Comendo Frutas");  
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de Ave");  
    }
    
    public void fazerNinho(){
        System.out.println("Construindo Ninho");
    }

    public String getCorpena() {
        return corpena;
    }

    public void setCorpena(String corpena) {
        this.corpena = corpena;
    }


    
}
