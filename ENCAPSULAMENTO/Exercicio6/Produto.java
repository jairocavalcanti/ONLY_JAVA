package ENCAPSULAMENTO.Exercicio6;

public class Produto {
    
   private String nome;
   private Double preco;
   private Integer quantidade_estoque;
   
   
    public Produto(String nome, Double preco, Integer quantidade_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
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


    public Integer getQuantidade_estoque() {
        return quantidade_estoque;
    }


    public void setQuantidade_estoque(Integer quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }


    public Integer adicionaraoestoque(Integer quantidade){
          return this.quantidade_estoque += quantidade;
    }


    public Integer vender(Integer venda){
        int ven = 0;
        if(venda <= quantidade_estoque){
            ven = quantidade_estoque - venda;
            quantidade_estoque = ven;
        }else{
            System.out.println(" !!Quantidade indisponivel no estoque!! ");
            return -1;
        }   
        return ven ;   
    }
    
    public String nomedoproduto(){
        return this.nome;
    }

    public Double consultapreco(){
        return this.preco;
    }

    public Integer consultarquantidadeestoque(){
        return this.quantidade_estoque;
    }

}
