package ESTRUTURA_SEQUENCIAL.Exercicio8;
import java.util.Scanner;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês. */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ganho_por_hora = 0;
        int horas_por_mes = 0;

        System.out.println("Insira o ganho por hora: ");
        ganho_por_hora = scanner.nextDouble();

        System.out.println("Insira o numero de horas trabalhadas no mes: ");
        horas_por_mes = scanner.nextInt();

        double salario = ganho_por_hora * horas_por_mes;

        System.out.println("Salario do mes com base nas informações inseridas: " + salario + "R$");



        scanner.close();
    }
    
}
