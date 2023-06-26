package POLIMORFISMO.Exercicio5;

public class Principal {
    public static void main(String[] args) {
       
        Dell dell = new Dell();
        dell.setNome("dell");
        dell.setPreco(1990.00);
        dell.ligarpc();
        dell.informarpreco();
        dell.desligarpc();
   
        System.out.println("--------------------------------");

        Samsung sam = new Samsung();
        sam.setNome("samsung");
        sam.setPreco(2000.00);
        sam.ligarpc();
        sam.informarpreco();
        sam.desligarpc();
    }
}
