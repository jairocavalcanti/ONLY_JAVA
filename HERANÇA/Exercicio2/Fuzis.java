package HERANÇA.Exercicio2;

public class Fuzis extends Armas {
    
    private String automatico;
    private String medioalcance;
    
    private boolean atirando;
    
    public void atirar() {
      this.atirando = ! this.atirando; 
    }

    
    public String getAutomatico() {
        return automatico;
    }
    public void setAutomatico(String automatico) {
        this.automatico = automatico;
    }
    public String isMedioalcance() {
        return medioalcance;
    }
    public void setMedioalcance(String medioalcance) {
        this.medioalcance = medioalcance;
    }




}
