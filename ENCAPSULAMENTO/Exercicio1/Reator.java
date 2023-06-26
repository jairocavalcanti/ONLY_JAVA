package ENCAPSULAMENTO.Exercicio1;

/*O conceito de pedido de vendas será abstraído em uma classe que você irá chamar de Pedido. Essa classe terá 4 atributos:
 código, subtotal, desconto e total.

No método main do programa você vai criar uma variável que poderá chamar de pedido, do tipo Pedido, e instanciar ela.
 Coloque os valores de cada atributo, da variável pedido, como achar melhor. */

 public interface Reator {
     
    public abstract void sirene();
    public abstract void ligar();
    public abstract void desligar();
    public abstract void sucesso();
    public abstract void sequenciaemergencial();
    public abstract void explosaoiminente();

}
    
    
