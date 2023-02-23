package HERANÇA.Exercicio2;

public class Lançadores extends Armas {
    
    private String lançador;
    private String baixoalcance;
   
    private boolean lançando;

    public void lançar() {
       this.lançando =! this.lançando;    
    }

    public String getLançador() {
        return lançador;
    }
    public void setLançador(String lançador) {
        this.lançador = lançador;
    }
    public String getBaixoalcance() {
        return baixoalcance;
    }
    public void setBaixoalcance(String baixoalcance) {
        this.baixoalcance = baixoalcance;
    }

}
