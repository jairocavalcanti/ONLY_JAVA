package HERANÇA.Exercicio5;

public class Televisoes extends Mercadorias{
   
    private Double volts;
    private boolean ligar = false;

    public boolean getLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public Double getVolts() {
        return volts;
    }

    public void setVolts(Double volts) {
        this.volts = volts;
    }


    public void tvstatus(){
        if(this.ligar){
        System.out.println("Televisões ligadas");
        }else{
        System.out.println("Televisões desligadas");
        }
    }


    public boolean tvligada(){
        return this.ligar = true;
    }


}
