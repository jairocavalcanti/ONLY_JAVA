package POLIMORFISMO.Exercicio6;

public class Softwares {
    
    private String nome;
    private Double preco;
    
   
    public Softwares(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    

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

    public Double aluguel(){
        return 0.0;
    }
    

}
