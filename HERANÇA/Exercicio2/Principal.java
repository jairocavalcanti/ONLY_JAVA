package HERANÇA.Exercicio2;

public class Principal {
    public static void main(String[] args) {
    
    Armas a1 = new Armas();
    Fuzis a2 = new Fuzis();
    Lançadores a3 = new Lançadores();
    Pistolas a4 = new Pistolas();
        
    //HERANÇAS HERDADAS DA CLASSE ARMAS.JAVA//

    a1.setNome("Guns");
    a2.setNome("AK-47");
    a3.setNome("Bazuca");
    a4.setNome("Glock-18");

    
    a1.setPais_de_origem("Country");
    a2.setPais_de_origem("Rússia");
    a3.setPais_de_origem("Israel");
    a4.setPais_de_origem("EUA");
   

    a1.setCalibre(0);
    a2.setCalibre(762);
    a3.setCalibre(800);
    a4.setCalibre(18);
  

    System.out.println(a1.toString());
    System.out.println(a2.toString());
    System.out.println(a3.toString());
    System.out.println(a4.toString());
  

    }

}
