package POLIMORFISMO.Exercicio3;

public abstract class Equipamentos {
    
    private String tipo;
    private String nome;
    private String preço;
   
   public abstract void rodarumjogo();
   public abstract void manutençao();
   public abstract void ligar();
   
   
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPreço() {
        return preço;
    }
    public void setPreço(String preço) {
        this.preço = preço;
    }
    
}
