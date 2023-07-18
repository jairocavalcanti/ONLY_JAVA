package POLIMORFISMO.Exercicio3;

public class Computadores extends Equipamentos {
 
    private String rodarnopc;


    @Override
    public void rodarumjogo() {
        System.out.println("PC rodando um jogo" + getNome());
    }

    @Override
    public void manutençao() {
        System.out.println("Pc em manuntenção" + getPreço()); 
    }

    @Override
    public void ligar() {
        System.out.println("Pc ligado" + getTipo() + getrodarnopc());
    }
    
    public String getrodarnopc() {
        return rodarnopc;
    }

    public void setrodarnopc(String rodarnopc) {
        this.rodarnopc = rodarnopc;
    }
   

}
