package ESTRUTURA_DE_DECISÃO.Exercicio8;
import java.util.Scanner;

/*  
Faça um programa que pergunte o preço de três produtos 
e informe qual produto você deve comprar, 
sabendo que a decisão é sempre pelo mais barato.
*/

public class Principal {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     double produto_mais_barato = 0.0;

     System.out.println("Insira o preço do produto #1: ");
     double preco1 = scanner.nextDouble();

     System.out.println("Insira o preço do produto #2: ");
     double preco2 = scanner.nextDouble();

     System.out.println("Insira o preço do produto #3: ");
     double preco3 = scanner.nextDouble();

     if(preco1 < preco2 && preco1 < preco3){
        produto_mais_barato = preco1;
     }
     if(preco2 < preco1 && preco2 < preco3){
        produto_mais_barato = preco2;
     }
     if( preco3 < preco1 && preco3 < preco2){
        produto_mais_barato = preco3;
     }

     // "%.2f" usado para formatação do valor 'produto_mais_barato' para 2 casas decimais
     System.out.printf("Preço do produto a ser comprado: %.2f R$" , produto_mais_barato);


     scanner.close();
    }
    
}
