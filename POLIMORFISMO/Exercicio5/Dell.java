package POLIMORFISMO.Exercicio5;

public class Dell extends Computadores {

    @Override
    public void ligarpc() {
       System.out.println("PC modelo: " + getNome() + " -- " + "Ligado" );
    }

    @Override
    public void desligarpc() {
     System.out.println("PC modelo: " + getNome() + " -- " + "Desligado");
    }

    @Override
    public void informarpreco() {
       System.out.println("Preco do pc: R$ -- " + getPreco());
    }
    
}
