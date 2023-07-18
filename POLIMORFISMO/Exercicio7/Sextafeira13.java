package POLIMORFISMO.Exercicio7;

public class Sextafeira13 extends Locadora {


    public Sextafeira13(String nomedofilme, Double precodealuguel) {
        super(nomedofilme, precodealuguel);
    }

    public Double precodecompra(){
        return getPrecodealuguel()*3;
    }
    

}
