package HERANÇA.Exercicio5;

public class Consoles extends Mercadorias {
    
    private boolean jogorodando = false;
    private boolean ligar = false;
    private String nomedojogo;


    public boolean getJogorodando() {
        return jogorodando;
    }
   
    public void setJogorodando(boolean jogorodando) {
        this.jogorodando = jogorodando;
    }
  
    public boolean getLigar() {
        return ligar;
    }
  
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public String getNomedojogo() {
        return nomedojogo;
    }
    
    public void setNomedojogo(String nomedojogo) {
        this.nomedojogo = nomedojogo;
    }


    public void videogamestatus(){
        if(this.ligar){
           System.out.println("-Videogame ligado-");
        }else{
            System.out.println("-Videogame desligado-");
        }
    }
  
    public void rodarjogoteste(){
        if(this.ligar){
            System.out.println("Jogo teste inserido: " + this.getNomedojogo()) ;
        }else{
            System.out.println("-- Videogame impossibilitado para teste --");
        }
    }


    public boolean ligarvideogame(){
        return this.ligar = true;
    }



}
