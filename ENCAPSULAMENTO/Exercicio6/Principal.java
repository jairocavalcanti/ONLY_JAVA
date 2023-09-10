package ENCAPSULAMENTO.Exercicio6;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto prod = new Produto("PS5", 2.500, 200);

        System.out.println("------ // ------ // ------ // ------ // ------ // ------ //");

        prod.adicionaraoestoque(2);
        prod.vender(3);
         
        System.out.println("Nome do produto: " + prod.nomedoproduto());
        System.out.printf("Preço unitario do produto: %.3f%n " , prod.consultapreco());
        System.out.println("Quantidade disponivel no estoque: " + prod.consultarquantidadeestoque());
        
    }
}
