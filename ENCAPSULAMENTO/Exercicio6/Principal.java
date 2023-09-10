package ENCAPSULAMENTO.Exercicio6;

import java.util.Locale;

/*
  Programa para pratica de encapsulmento.
  Gerenciamento de estoque de produto com as seguintes informações: 
  Nome , preço e quantidade de estoque, apenas o atributo quantidade de estoque será alterado.
 */

 public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto prod = new Produto("PS5", 2500.00, 200);

        System.out.println("------ // ------ // ------ // ------ // ------ // ------ //");

        prod.adicionaraoestoque(2);
        prod.vender(3);
         
        System.out.println("Nome do produto: " + prod.nomedoproduto());
        System.out.printf("Preço unitario do produto: %.2f%n " , prod.consultapreco());
        System.out.println("Quantidade disponivel no estoque: " + prod.consultarquantidadeestoque());
        
    }
}
