package POLIMORFISMO.Exercicio10;

/*
 * Escreva um programa Java para criar uma classe base Sports com um método chamado play(). 
 * Crie três subclasses: Football, Basketball e Rugby. 
 * Substitua o método play() em cada subclasse para reproduzir uma instrução específica para cada esporte.
 */
public class Principal {
    public static void main(String[] args) {
     
        Sports sport1 = new Sports("sports");
        System.out.println("Nome do esporte:  " + sport1.getNomedoesporte());

        System.out.println("--------------------------------------------------");

        Sports sport2 = new Futebol("Chutar ao gol");
        System.out.println("Nome do esporte:  " + sport2.getNomedoesporte());
        System.out.println("Instruçao:  " + sport2.instrução());

        System.out.println("--------------------------------------------------");

        Sports sport3 = new Basqueteball("Arremesso de 3");
        System.out.println("Nome do esporte:  " + sport3.getNomedoesporte());
        System.out.println("Instruçao:  " + sport3.instrução());

        System.out.println("--------------------------------------------------");

        Sports sport4 = new Rugby( "Manter corpo firme ao solo");
        System.out.println("Nome do esporte:  " + sport4.getNomedoesporte());
        System.out.println("Instrução:  " + sport4.instrução());



    }
    
}
