package ENCAPSULAMENTO.Exercicio1;


public class PainelUsina implements Reator {

    private boolean explosaoiminente;
    private boolean ligar;
    private boolean desligar;
    private boolean sirene;

    //metodo
    public PainelUsina(){
        this.explosaoiminente = false;
        this.ligar = false;
        this.desligar = false;
        this.sirene = false;
        }
           
    
    public boolean getSirene() {
        return sirene;
    }


    public void setSirene(boolean sirene) {
        this.sirene = sirene;
    }


    //getters e setters para variaveis 'funcionais'    
    public boolean getLigado() {
        return ligar;
    }


    public boolean setLigado(boolean ligar) {
        return this.ligar = ligar;
    }


    public boolean getDesligado() {
        return desligar;
    }


    public void setDesligado(boolean desligar) {
        this.desligar = desligar;
    }
  

    public boolean getExplosaoiminente() {
        return explosaoiminente;
    }


    public void setExplosaoiminente(boolean explosaoiminente) {
        this.explosaoiminente = explosaoiminente;
    }


    @Override
    public void ligar() {
        System.out.println("__usina ligada__");
        this.setLigado(true);   
    }

    @Override
    public void desligar() {
    if(this.getLigado() == false){
       System.out.println("__usina ja desligada__");   
        this.setDesligado(true);
    }else{
      System.out.println("__usina desligada__");
      this.setDesligado(true);
    }
   
    }

   
    @Override
    public void sequenciaemergencial() {
        if(this.getSirene() && this.getDesligado() == false){
            System.out.println("@--SEQUENCIA EMERGENCIAL INICIADA--@");  
            this.setExplosaoiminente(true);
        }
        else{
            System.out.println("[--[sequencia emergencial desativada]--]");
        }    
    }


    @Override
    public void sirene() {
    if(this.getDesligado() == false){
      System.out.println("----SIRENE LIGADA----");
       this.setSirene(true);
    }else{
        System.out.println("--USINA DESLIGADA SIRENE DESATIVADA--");
    }
    }


    @Override
    public void evacuarusina() {
        if(this.getExplosaoiminente()){
            System.out.println("--Evacuar usina IMEDIATAMENTE--");
        }else{
            System.out.println("-Sem perigos existentes para evacuação-");
        }
    }
    



}
