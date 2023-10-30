package ESTRUTURA_DE_REPETIÇÃO.Exercicio5;
import java.util.Scanner;

/*  
 Altere o programa anterior (Exercicio4) , permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
 Valide a entrada e permita repetir a operação.
*/

public class Principal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int anos = 0;  

      System.out.println("Insira a população do país A:  ");
      double populaçaoA = scanner.nextDouble();

      System.out.println("Insira a população do país B:");
      double populaçaoB = scanner.nextDouble();

      System.out.println("Insira a porcentagem de crescimento populacional do país A: ");
      double porcentagemA = scanner.nextDouble();

      double valorporcentagemA = (populaçaoA * porcentagemA) / 100;

      System.out.println("Insira a porcentagem de crescimento populacional do país B: ");
      double porcentagemB = scanner.nextDouble();

      double valorporcentagemB = (populaçaoB * porcentagemB) / 100;
      

      while(populaçaoA < populaçaoB){
        populaçaoA += populaçaoA * porcentagemA;
        populaçaoB += populaçaoB * porcentagemB;
        anos += 1;
        }



         

      scanner.close();
    }
    
}
