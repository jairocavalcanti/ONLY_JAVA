package ENCAPSULAMENTO.Exercicio3;

public class Acoes implements metodos {

    private boolean defesa;
    private Integer cura;
    private Integer hp;
    private Integer ataquepesado;
    private Integer ataqueleve;


    public Acoes(){
         this.defesa = false;
         this.cura = 100;
         this.hp = 100;
         this.ataquepesado = 25;
         this.ataqueleve = 15;    
    }
  
    

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtaquepesado() {
        return ataquepesado;
    }

    public void setAtaquepesado(Integer ataquepesado) {
        this.ataquepesado = ataquepesado;
    }

    public Integer getAtaqueleve() {
        return ataqueleve;
    }

    public void setAtaqueleve(Integer ataqueleve) {
        this.ataqueleve = ataqueleve;
    }


    public Integer getCura() {
        return cura;
    }


    public void setCura(Integer cura) {
        this.cura = cura;
    }

    
    public boolean isDefesa() {
        return defesa;
    }



    public void setDefesa(boolean defesa) {
        this.defesa = defesa;
    }




    @Override
    public void ataqueleve() {
     if(this.defesa){
        System.out.println("Ataque leve defendido");
        }else{
        System.out.println("Ataque leve, -15 hp");
         this.setHp(hp - ataqueleve);
        }
    }

    @Override
    public void ataquePesado() {
    if(this.defesa){
        System.out.println("Ataque pesado defendido");
    }else{
        System.out.println("Ataque pesado, -25 hp");
        this.setHp(hp - ataquepesado);
      }
    }

    @Override
    public void defender() {
       this.setDefesa(true);
    }

    @Override
    public void cura() {
      System.out.println("-- HP restaurado --");
      this.setHp(100);
    }



    @Override
    public void HPSTATUS() {
    if(this.getHp() <= 0){
        System.out.println("HP restante: " + this.getHp() + " PERSONAGEM MORTO");
    }else{
        System.out.println("HP restante: " + this.getHp());
    }
      
    }
 
}
