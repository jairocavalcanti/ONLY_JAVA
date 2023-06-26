package POLIMORFISMO.Exercicio6;

public class AppContabilidade extends Softwares {
    
    private Double aluguel;

 

    public AppContabilidade(String nome, Double preco, Double aluguel) {
        super(nome, preco);
        this.aluguel = aluguel;
    }



    public Double aluguel(){
        return aluguel * 2;
    }


    
}
