package POLIMORFISMO.Exercicio2;

public class CurtoAlcance extends Armas {
    

    @Override
    public void atirar() {
        System.out.println("Arma de curto alcance atirando");
    }

    @Override
    public void mostrarnome() {
        System.out.println("Nome do balute: " + getNome());
    }

    @Override
    public void mostrarclasse() {
        System.out.println("Arma de curto alcance");
    }
       
        

    }

