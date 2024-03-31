package HERANÇA.Exercicio7;

import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Biblioteca bibli = new Biblioteca();

        while(true){
        System.out.println("Insira qual operação deseja efetuar:" + 
        "\n// 1 - Cadastro_de_DVD \n" + 
        "// 2 - Visualizar_Lista \n" +
        "// 0 - finalizar programa \n" + 
        ":");
        String opcao = scanner.next();
        
        switch (opcao) {
            case "1":
            
            Integer id = rand.nextInt(100);
            DVD dv = new DVD("o alto", id, false, "cumpadi", 122, 12);

            bibli.adicionar_na_lista(dv);
            System.out.println("Livro cadastrado com sucesso!");
            System.out.println("-------------------------------");
            break;
        
            case "2":

            bibli.mostrar_lista();
            System.out.println("-------------------------------");
            break;

            case "0":

            System.out.println("Programa encerrado...");
            scanner.close();
            return;

            default:
            System.out.println("--- INSIRA UMA OPÇÃO VÁLIDA ---");
            break;
        }
    }
    
  }
  
}
