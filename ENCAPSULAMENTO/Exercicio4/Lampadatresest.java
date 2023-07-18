package ENCAPSULAMENTO.Exercicio4;

/* Imagine uma lâmpada que possa ter três estados: apagada, acesa e meia-luz */

public class Lampadatresest implements abs {

    private boolean ligado;
    private boolean apagada;
    private String meialuz;
    
    
    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getApagada() {
        return apagada;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }


    public String getMeialuz() {
        return meialuz;
    }


    public void setMeialuz(String meialuz) {
        this.meialuz = meialuz;
    }


    @Override
    public void ligar() {
    this.setLigado(true);
    System.out.println("Lampada ligada");    
    }
   
  
    @Override
    public void desligar() {
    this.setApagada(true);
    if (this.getLigado()) {
    System.out.println("Lampada desligada");
    }else{
    System.out.println("Lampada ja está desligada");
    }
  }
   
    @Override
    public void meialuz() {
    if(this.getLigado()){
    System.out.println("reduzindo a meia luz");
    }if(this.getApagada()){
    System.out.println("impossivel meia luz aqui");
    }
  }
    
}
