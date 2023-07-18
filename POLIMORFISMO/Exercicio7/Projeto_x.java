package POLIMORFISMO.Exercicio7;

public class Projeto_x extends Locadora {

    public Projeto_x(String nomedofilme, Double precodealuguel) {
        super(nomedofilme, precodealuguel);
    }
    
    public Double precodecompra(){
        return getPrecodealuguel()*3;
    }

}
