package ESTRUTURA_DE_REPETIÇÃO.Exercicio4;
import java.util.Scanner;

/*
  Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual 
  de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
  Faça um programa que calcule e escreva o número de anos 
  necessários para que a população do país A ultrapasse ou iguale a população do país B, 
  mantidas as taxas de crescimento
*/

public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int anos = 0;
      double A = 80000.00;
      double B = 200000.00;
     
      //Para calculos que envolvam porcentagem, nos criamos valores correspondentes aos valores que representam a porcentagem, 
      //Nao aos valores que a porcentagem possui
      double crescimentoA = 0.03;
      double crescimentoB = 0.015;

   
     
        while(A < B){
         // A = A + (A * crescimentoA)
          A += (A * crescimentoA);
          B += (B * crescimentoB);
          anos += 1;
        }
         
          System.out.println();
          System.out.println("População A superou a população B em " + anos + " anos!");
          System.out.printf("Populaçao cidade A: %.2f" , A);
          System.out.println();
          System.out.printf("População cidade B: %.2f" , B); 
          
        
      



      scanner.close();
  }
}
