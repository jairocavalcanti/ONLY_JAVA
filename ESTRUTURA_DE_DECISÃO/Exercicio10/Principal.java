package ESTRUTURA_DE_DECISÃO.Exercicio10;
import java.util.Scanner;

  /* 
  Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
  Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", 
  conforme o caso  
  */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String turno = "";

        System.out.println("Insira o turno em que voce estuda: M - matutino // V - Vespertino // N - Noturno");
        turno = scanner.next();

        if(turno.toUpperCase().equals("M")){
            System.out.println("Bom dia aluno!");
        }else if(turno.toUpperCase().equals("V")){
            System.out.println("Boa tarde aluno!");
        }else if(turno.toUpperCase().equals("N")){
            System.out.println("Boa noite aluno!");
        }else{
            System.out.println("Valor inválido !");
        }
      
       scanner.close();
    }
    
}
