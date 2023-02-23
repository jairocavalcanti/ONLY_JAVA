package POLIMORFISMO.Exercicio3;

public class Consoles extends Equipamentos {

private String rodarnoconsole;

    @Override
    public void rodarumjogo() {
       System.out.println("Console rodando um jogo" + getNome());
    }

    @Override
    public void manutençao() {
       System.out.println("Console em manuntenção" + getPreço());
    }

    @Override
    public void ligar() {
        System.out.println("Console ligado" + getTipo() + getrodarnoconsole()); 
    }
    
   
    public String getrodarnoconsole() {
        return rodarnoconsole;
    }
    
    public void setrodarnoconsole(String rodarnoconsole) {
        this.rodarnoconsole = rodarnoconsole;
    }


}
