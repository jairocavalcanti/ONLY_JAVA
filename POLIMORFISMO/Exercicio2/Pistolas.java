package POLIMORFISMO.Exercicio2;

public class Pistolas extends Armas {


    @Override
    public void atirar() {
       System.out.println("Pistola atirando");
    }

    @Override
    public void mostrarnome() {
       System.out.println("Nome da arma: " + getNome());    
    }

    @Override
    public void mostrarclasse() {
       System.out.println("Pistola");
    }


}
