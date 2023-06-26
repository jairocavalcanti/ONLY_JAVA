package POLIMORFISMO.Exercicio9;

public class Reddeadredemption2 extends Jogos {

    private Double preco;
    private Double taxadaloja;
    

    public Reddeadredemption2(Double preco, Double taxadaloja) {
        super("RED_DEAD", 18.00);
        this.preco = preco;
        this.taxadaloja = taxadaloja;
      
    }
  
    public Double aumentarpreco(){
        return preco + taxadaloja;
    }



}
