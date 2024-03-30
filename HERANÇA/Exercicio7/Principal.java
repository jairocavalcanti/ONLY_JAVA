package HERANÇA.Exercicio7;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Biblioteca bibli = new Biblioteca();

        while(true){
        System.out.println("Insira qual operação deseja efetuar: 1 - Cadastro_de_DVD // 2 - Visualizar_Lista");
        String opcao = scanner.next();

        
        switch (opcao) {
            case "1":
            
            System.out.println("Insira o titulo do produto: ");
            String titulo = scanner.next();

            Integer id = rand.nextInt(100);

            System.out.println("Insira o nome do diretor do filme: ");
            String nome = scanner.next();

            System.out.println("Insria a quantidade de minutos que possui o filme:");
            Integer minutos = scanner.nextInt();

            System.out.println("Insira a classificação indicativa do filme:");
            Integer classificação = scanner.nextInt();
            
            DVD dv = new DVD(titulo, id, false, nome, minutos, classificação);

            bibli.adicionar_na_lista(dv);
            break;
        
            case "2":

            bibli.mostrar_lista();
            break;

            case "0":

            System.out.println("Programa encerrado...");
            return;

            default:
            System.out.println("--- INSIRA UMA OPÇÃO VÁLIDA ---");
            return;
        
        }
       
        scanner.close();
    }
    
  }
  
}
