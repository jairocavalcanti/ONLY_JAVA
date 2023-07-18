package JAVA_MATH.Exercicio2;

/*
Escreva um programa Java 
para arredondar os resultados da divisão inteira 
para o formato de porcentagem.
*/

public class Principal {
    public static void main(String[] args) {
        int numero1 = 60, numero2 = 60, numero3 = 150;
        int soma = numero1 + numero2;
        //variavel 'porcentagem' recebendo formula para se obter porcentagem
        int porcentagem = ((soma*100))/numero3;
        
        System.out.println("Soma do numero1 + numero2: " + soma);

        
        System.out.println("Porcentagem de " + numero3 + ": " + porcentagem + "%");

    }
}
