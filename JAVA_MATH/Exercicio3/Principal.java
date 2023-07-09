package JAVA_MATH.Exercicio3;

/*
 * Escreva um programa Java para obter partes inteiras e fracionárias de um valor duplo
 */
public class Principal {
    public static void main(String[] args) {
        double valor = 15.35;
        double partefracao = valor % 1;
        double resultado = valor - partefracao;


        System.out.println("Valor original: " + valor);
        System.out.println("Valor arredondado para inteiro: " + resultado);
        System.out.println("Parte fracionaria do valor: " + partefracao);
    }
    
}
