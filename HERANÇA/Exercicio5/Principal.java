package HERANÇA.Exercicio5;

public class Principal {
    
    public static void main(String[] args) {
    

    Mercadorias me = new Mercadorias();    
    Eletrodomesticos ele = new Eletrodomesticos();
   
    //classe mãe instanciada
    me.setNome("nome do produto");
    me.setNumerodeserie("numero de serie");
    me.setQuantidade("quantidade do produto");

    //forma errada de tentar imprimir um metodo toString
    ele.toString();

    ele.setNome("televisão");
    ele.setNumerodeserie("#3322");
    ele.setQuantidade("30 unidades");
    //atributos únicos da classe eletrodomesticos 
    ele.setVolts(10.80);
    ele.setLigar(true);
    ele.ligar();
    
    //forma correta de imprimir um metodo toString
    System.out.println(ele.toString());

   
   }

 }
