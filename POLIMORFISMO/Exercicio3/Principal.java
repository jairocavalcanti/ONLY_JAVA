package POLIMORFISMO.Exercicio3;

public class Principal {
    public static void main(String[] args) {
        
        Computadores comp = new Computadores();
        comp.setTipo("---Desktop---");
        comp.setNome("---pc da nasa---");
        comp.setPreço("--R$ : 1070--");
        comp.setrodarnopc("Fallout 4 rodando");
        comp.ligar();
        comp.rodarumjogo();
        comp.manutençao();

        System.out.println("----------------------");

        Consoles con = new Consoles(); 
        con.setTipo("---Console---");
        con.setNome("---PS3---");
        con.setPreço("--R$ : 1050--");
        con.setrodarnoconsole("The last of us rodando");
        con.ligar();
        con.rodarumjogo();
        con.manutençao();

        System.out.println("---------------------");

        Dellinspiron dell = new Dellinspiron();
        dell.setTipo("---Notebook---");
        dell.setNome("---Dell---");
        dell.setPreço("--R$ : 1080--");
        dell.setrodarnopc("gnehsin rodando");
        dell.ligar();
        dell.rodarumjogo();
        dell.manutençao();
        
        System.out.println("---------------------");

        PS5 ps = new PS5();
        ps.setTipo("---console novo---");
        ps.setNome("---PS5---");
        ps.setPreço("--R$ : 1090--");
        ps.setrodarnoconsole("uncharted rodando ");
        ps.ligar();
        ps.rodarumjogo();
        ps.manutençao();

    }
}
