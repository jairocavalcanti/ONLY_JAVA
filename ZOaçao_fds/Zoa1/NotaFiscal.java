package ZOaçao_fds.Zoa1;


import java.util.Random;
import java.util.Scanner;
/*
Faça um programa que peça ao usuario um preço e id do produto de acordo com uma tabela criada por voce mesmo, 
como um mercado,
e depois imprima uma nota fiscal
*/ 
public class NotaFiscal {

Random gerador = new Random(200);

Double taxagold = 5.00;
Double taxapaypal = 4.0;
Double precofinal;

Integer precofinal2;
Integer esc2;

Double gramas;
Integer unidades;

Integer precomaconha = 2;
Integer precoak47 = 430;


public void metodoCartaz(){
   
    System.out.println("---BEM VINDO AO MERCADO NEGRO CYBERSETT---");
    System.out.println("||||||LISTA DE COISAS A VENDA||||||");
    System.out.println("Produto 1: ---Maconha // 2$ a grama");
    System.out.println("Produto 2: ---Arma AK47 // 430$ unidade");
    System.out.println("----------------------------------------");
}


public void escolhas(){

Scanner scanner = new Scanner(System.in);

System.out.println("Deseja comprar algum dos produtos?");
String esc = scanner.next();
if (esc.equals("sim") || esc.equals("SIM") || esc.equals("Sim") ) {

do {
    
System.out.println("Digite o numero equivalente do produto na lista");
esc2 = scanner.nextInt();

switch (esc2) {
    
    case 1:
    
    System.out.println("Produto selecionado: MACONHA" + " /// " + "ID da compra:" +  gerador.nextInt(100));
    System.out.print("Insira as gramas:");
    gramas = scanner.nextDouble();
    
    System.out.println("--- w_PRICE ---");
    System.out.println("Gramas de maconha escolhidas:" + gramas);
    precofinal = precomaconha*gramas;
    System.out.println("Preço a pagar:" + precofinal + "----" + "Dolares$");
   
    return;

    case 2:

    System.out.println("Produto selecionado: AK47" + " /// " + "ID da compra:" + gerador.nextInt(200));
    System.out.print("Insira a quantidade:");
    unidades = scanner.nextInt();
    
    System.out.println("--- a_PRICE ---");
    System.out.println("Unidades do AK47 escolhidas:" + unidades);
    precofinal2 = precoak47*unidades; 
    System.out.println("Preço a pagar:" + precofinal2 + "----" + "Dolares$");
    
    return;

    default:
    
    System.out.println("!!!Insira uma informação válida, não somos palhaços e levamos nosso trabalho a sério!!!");
       
    break;
    }  

}while (esc.equals("sim"));
   

} else {
    
    System.out.println("Programa encerrado");
    return;
    } 

    }

   public void formadepagamento() {
    Scanner scanner = new Scanner(System.in);


    System.out.println("Como deseja efetuar o pagamento?");
    System.out.println("Formas: PayPal // Goldman");
    String pagamento = scanner.next();

    if (pagamento.equals("paypal")) {
        System.out.println("Escolha do serviço efetuada com sucesso!");
        System.out.println("---PAYPAL---");
        
       
        System.out.println("---NOTA---");
        
       
        if(esc2.equals(1)){
            System.out.println("preco final da maconha:" + (precofinal + taxapaypal));
            System.out.println("Valor pago pelo cliente:" + " " + precofinal + "(taxa paypal adicionada $4,00)");
        }else if(esc2.equals(2)){
             System.out.println("preco final dos AK47:" + (precofinal2 + taxapaypal));
             System.out.println("Valor pago pelo cliente:" + " " + precofinal2 + "(taxa paypal adicionada $4,00)");
            }
         
        
     }else if(pagamento.equals("goldman")) {
        System.out.println("Escolha do serviço efetuada com sucesso!");
        System.out.println("---GOLDMANSACHS---");

        System.out.println("---NOTA---");
      

        if(esc2.equals(1)){
            System.out.println("preco final da maconha:" + (precofinal + taxagold));
            System.out.println("Valor pago pelo cliente:" + " " + precofinal + "(taxa goldmansachs adicionada $5,00)");
        }else if(esc2.equals(2)){
             System.out.println("preco final dos AK47:" + (precofinal2 + taxagold));
             System.out.println("Valor pago pelo cliente:" + " " + precofinal2 + "(taxa goldmansachs adicionada $5,00)");
        }
    }
  
    
   }
  
}




