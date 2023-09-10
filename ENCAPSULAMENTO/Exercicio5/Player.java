package ENCAPSULAMENTO.Exercicio5;

public class Player implements Consoles {
     
    private boolean consoleligado;
    private boolean consoledesligado;
    private boolean rodandoumjogo;
    private Integer contador = 0;

  

@Override
    public void ligarconsole() {
     this.setConsoleligado(true);
     System.out.println("Console ligado");   
    }

    @Override
    public void desligarconsole() {
      if(this.consoleligado){
        System.out.println("Desligando console");
        this.setConsoledesligado(true);
        }else{
          System.out.println("Console desligado");
       } 
    }

    @Override
    public void rodarjogo() {
       this.setRodandoumjogo(true);
       if(this.consoleligado){
        System.out.println("Console ligado e rodando um jogo");
       }if(this.consoledesligado){
        System.out.println("Console nao pode rodar um jogo - desligado");
       }
        
    }
   

    public boolean isConsoleligado() {
        return consoleligado;
    }

    public void setConsoleligado(boolean consoleligado) {
        this.consoleligado = consoleligado;
    }

    public boolean isConsoledesligado() {
        return consoledesligado;
    }

    public void setConsoledesligado(boolean consoledesligado) {
        this.consoledesligado = consoledesligado;
    }

    public boolean isRodandoumjogo() {
        return rodandoumjogo;
    }

    public void setRodandoumjogo(boolean rodandoumjogo) {
        this.rodandoumjogo = rodandoumjogo;
    }

    public Integer getContador() {
        return contador;
    }

    public void setContador(Integer contador) {
        this.contador = contador;
    }




}
