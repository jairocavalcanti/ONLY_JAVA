package HERANÇA.Exercicio7;

import java.util.Scanner;
import java.util.Random;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Biblioteca bibli = new Biblioteca();
    DVD dvd = new DVD();
    Livros livros = new Livros();
    Random rand = new Random();

    while (true) {
      System.out.println("Insira a operação que deseja realizar: \n" +
          "1 - Cadastrar itens \n" +
          "2 - Visualizar listas \n" +
          "3 - visualizar itens separadamente \n" +
          "4 - Emprestar item \n" +
          "5 - Adicionar na lista comum");
      System.out.printf(": ");
      String escolha = scanner.next();

      switch (escolha) {
        case "1":

          System.out.println("Insira a o item que deseja cadastrar: 1 - DVD // 2 - Livros");
          String escolha_de_item = scanner.next();

          if (escolha_de_item.equals("1")) {

            System.out.println("---- CADASTRO DVD'S ----");

            System.out.printf("Insira o titulo do item: ");
            String titulo = scanner.next();

            int id = rand.nextInt(1000);

            System.out.printf("Insira o nome do direto do filme: ");
            String diretor = scanner.next();

            System.out.printf("Insira os minutos: ");
            Integer minutos = scanner.nextInt();

            System.out.printf("Insira a classificação indicativa: ");
            Integer classificação = scanner.nextInt();

            DVD dvd_1 = new DVD(titulo, id, false, diretor, minutos, classificação);
            dvd.adicionar_na_lista(dvd_1);
            bibli.adicionar_na_lista(dvd_1);
            System.out.println(" -- DVD CADASTRADO! -- \n");
          } else if (escolha_de_item.equals("2")) {

            System.out.println("---- CADASTRO LIVROS ----");

            System.out.printf("Insira o titulo do item: ");
            String titulo = scanner.next();

            int id = rand.nextInt(1000);

            System.out.println("Insira o autor do livro: ");
            String autor = scanner.next();

            System.out.println("Insiro o numero de paginas do livro: ");
            Integer numero_de_paginas = scanner.nextInt();

            System.out.println("Insira o genero do livro: ");
            String genero = scanner.next();

            Livros livros_1 = new Livros(titulo, id, false, autor, numero_de_paginas, genero);
            livros.adicionar_na_lista(livros_1);
            bibli.adicionar_na_lista(livros_1);
            System.out.println(" -- LIVRO CADASTRADO! -- \n");
          }

          System.out.println("---------------------------------------------");

          break;

        case "2":
          System.out.println("Insira qual lista deseja visualizar: 1 - emprestados // 2 - lista comum");
          String esc = scanner.next();

          if (esc.equals("1")) {
            bibli.mostrar_lista_de_emprestados();
          } else {
            bibli.mostrar_lista_de_itens();
          }

          break;

        case "3":
          dvd.mostrar_lista_de_dvds();
          livros.mostrar_lista_de_livros();
          break;

        case "4":
          bibli.escolher_item_emprestados(scanner);
          break;

        case "5":
          bibli.escolher_item_lista(scanner);
          break;

        case "0":
          System.out.println("Programa encerrado...");
          scanner.close();
          return;

        default:
          System.out.println("Insira uma opção válida");
          break;
      }
    }
  }
}
