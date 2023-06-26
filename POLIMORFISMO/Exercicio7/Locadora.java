package POLIMORFISMO.Exercicio7;

public class Locadora {

    private String nomedofilme;
    private Double precodealuguel;
  
    public Locadora(String nomedofilme, Double precodealuguel) {
        this.nomedofilme = nomedofilme;
        this.precodealuguel = precodealuguel;
    }

    public String getNomedofilme() {
        return nomedofilme;
    }

    public void setNomedofilme(String nomedofilme) {
        this.nomedofilme = nomedofilme;
    }

    public Double getPrecodealuguel() {
        return precodealuguel;
    }

    public void setPrecodealuguel(Double precodealuguel) {
        this.precodealuguel = precodealuguel;
    }
    
    public Double precodecompra(){
        return 0.0;
    }

    
}
