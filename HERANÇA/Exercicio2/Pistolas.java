package HERANÇA.Exercicio2;

public class Pistolas extends Armas {
    
    private String semiautomatica;
    private String curtoalcance;
    
    private boolean tecando;

    public void tecar() {
        this.tecando =! this.tecando;
    }
    
    public String getSemiautomatica() {
        return semiautomatica;
    }
    public void setSemiautomatica(String semiautomatica) {
        this.semiautomatica = semiautomatica;
    }
    public String getCurtoalcance() {
        return curtoalcance;
    }
    public void setCurtoalcance(String curtoalcance) {
        this.curtoalcance = curtoalcance;
    }

}
