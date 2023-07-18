package POLIMORFISMO.Exercicio9;

public class Fallguys extends Jogos  {
    
    private Double preco;
    private Double taxadaloja;
  
  
    public Fallguys(Double preco, Double taxadaloja) {
        super("Fall_Guys", 10.00);
        this.preco = preco;
        this.taxadaloja = taxadaloja;
    }


    public Double aumentarpreco(){
        return preco + taxadaloja;
    }

    


}
