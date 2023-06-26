package POLIMORFISMO.Exercicio5;

public abstract class Computadores {
    
    private String nome;
    private Double preco;
  
    
     public abstract void ligarpc();
     public abstract void desligarpc();
     public abstract void informarpreco();
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }    



}
