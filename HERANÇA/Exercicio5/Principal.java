package HERANÇA.Exercicio5;

public class Principal {
    
    public static void main(String[] args) {
    

    Mercadorias me = new Mercadorias();    
    Televisoes ele = new Televisoes();
    Consoles con = new Consoles();

    //classe mãe instanciada
    me.setNome("nome do produto");
    me.setNumerodeserie("numero de serie");
    me.setQuantidade("quantidade do produto");

    /*
    forma errada de tentar imprimir um metodo toString
    ele.toString();
    */

    ele.setNome("televisão");
    ele.setNumerodeserie("#3322");
    ele.setQuantidade("30 unidades");
   
    ele.tvligada();
    ele.tvstatus();

    
    //forma correta de imprimir um metodo toString
    System.out.println(ele.toString());

    System.out.println();

    con.setNome("ps5");
    con.setNumerodeserie("#3897");
    con.setQuantidade("80 unidades");
    con.setNomedojogo("Uncharted 4");
    con.ligarvideogame();
    con.videogamestatus();
    con.rodarjogoteste();
    

    System.out.println(con.toString());
    
   }

 }
