package TESTES.Teste4;

import java.util.Scanner;
import java.util.Random;

/*

Fazer uma classe Ex2Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou 

*/

public class Principal {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer palpite;
    Integer tentativas = 0;

    Random rando = new Random();
    int valor = rando.nextInt(100, 150);  
   
    do {
    System.out.println("Insira um palpite, usuario:");
    palpite = scanner.nextInt();
   
    if(palpite < valor) {
    System.out.println("Palpite menor que valor sorteado");   
    }
    if(palpite > valor){
    System.out.println("Palpite maior que o numero sorteado");
    } 
     
    tentativas++;
      
    } while (valor != palpite);

    scanner.close();

    System.out.println("Tentativas:" + tentativas);
   
    System.out.println(valor);
   
    }
 }
