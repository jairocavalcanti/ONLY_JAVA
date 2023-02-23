package HERANÇA.Exercicio5;

public class Eletrodomesticos extends Mercadorias{
   
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


    public void ligar(){
        if(this.ligar == true){
        System.out.println("Televisões ligadas");
        }else{
        System.out.println("Televisões desligadas");
        }
    }



}
