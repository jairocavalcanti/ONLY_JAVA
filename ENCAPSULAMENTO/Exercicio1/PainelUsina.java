package ENCAPSULAMENTO.Exercicio1;


public class PainelUsina implements Reator {

    private boolean ligar;
    private boolean desligar;
    private boolean sirene;

    //metodo
    public PainelUsina(){
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


  

    @Override
    public void ligar() {
    System.out.println("__usina ligada__");
    this.setLigado(true);
        
    }

    @Override
    public void desligar() {
    System.out.println("__usina desligada__");
    this.setDesligado(true);

        
    }

    @Override
    public void sucesso() {
    if(this.getLigado()){
        System.out.println("!!!Sucesso ao ligar usina!!!");
    }else{
        System.out.println("!!!Sem sucesso ao ligar usina!!!");
    }
        
    }

    @Override
    public void sequenciaemergencial() {
    if(this.getSirene()){
        System.out.println("@--SEQUENCIA EMERGENCIAL INICIADA--@");      
    }else{
        System.out.println("[--[sequencia emergencial desativada]--]");
    }
        
    }

    @Override
    public void explosaoiminente() {
       
    }


    @Override
    public void sirene() {
    System.out.println("----SIRENE LIGADA ALERTA DE PERIGO----");
    this.setSirene(true);
        
    }
    



}
