package POLIMORFISMO.Exercicio2;

public class Principal {
    
    public static void main(String[] args) {
        
        Fuzil f = new Fuzil();
        Pistolas p = new Pistolas();
        CurtoAlcance ca = new CurtoAlcance();
        AK47 AK = new AK47();

        p.setNome(".40");
        p.mostrarnome();
        p.atirar();
        p.mostrarclasse();

        System.out.println("------------------------");

        f.setNome("lald");
        f.mostrarnome();
        f.atirar();
        f.mostrarclasse();

        System.out.println("-------------------------");

        ca.setNome("Calibre -- 12");
        ca.mostrarnome();
        ca.atirar();
        ca.mostrarclasse();

        AK.atirar();


    }
    
}
