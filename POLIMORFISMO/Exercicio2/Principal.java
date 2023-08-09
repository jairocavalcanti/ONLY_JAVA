package POLIMORFISMO.Exercicio2;

public class Principal {
    
    public static void main(String[] args) {
        
        Fuzil f = new Fuzil();
        Pistolas p = new Pistolas();
        CurtoAlcance ca = new CurtoAlcance();
        Armas AK = new AK47();
        Ponto40 P = new Ponto40();
        Spas_ sp = new Spas_();

        p.setNome("Pistola");
        p.setPeso(2);
        p.mostrarnome();
        p.atirar();
        p.mostrarclasse();
        p.mostrarpeso();

        System.out.println("------------------------");

        f.setNome("Fuzil");
        f.setPeso(7);
        f.mostrarnome();
        f.atirar();
        f.mostrarclasse();
        f.mostrarpeso();

        System.out.println("-------------------------");

        ca.setNome("Calibre -- 12");
        ca.setPeso(6);
        ca.mostrarnome();
        ca.atirar();
        ca.mostrarclasse();
        ca.mostrarpeso();

        System.out.println("-------------------------");


        System.out.println("---- TIPOS DE ARMAS ----");

    
        System.out.println("-------------------------");

        P.setNome("Ponto40");
        P.setPeso(p.getPeso());
        P.mostrarnome();
        P.atirar();
        P.mostrarclasse();
        P.mostrarpeso();
       
        System.out.println("-------------------------");

        AK.setNome("AK47");
        AK.setPeso(f.getPeso());
        AK.mostrarnome();
        AK.atirar();
        AK.mostrarclasse();
        AK.mostrarpeso();

        System.out.println("-------------------------");

        sp.setNome("Spas");
        sp.setPeso(ca.getPeso());
        sp.mostrarnome();
        sp.atirar();
        sp.mostrarclasse();
        sp.mostrarpeso(); 
   
    }
    
}
