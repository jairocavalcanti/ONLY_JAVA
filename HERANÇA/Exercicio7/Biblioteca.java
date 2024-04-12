package HERANÇA.Exercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {

    private String titulo;
    private Integer ID;
    private boolean emprestado;

    protected ArrayList<Biblioteca> listaBiblioteca = new ArrayList<>();
    protected ArrayList<Biblioteca> emprestados = new ArrayList<>();

    public Biblioteca() {

    }

    public Biblioteca(String titulo, Integer iD, boolean emprestado) {
        this.titulo = titulo;
        ID = iD;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void adicionar_na_lista_emprestados(Biblioteca item) {
        item.setEmprestado(true);
        emprestados.add(item);
        listaBiblioteca.remove(item);
    }

    public void adicionar_na_lista(Biblioteca item) {
        item.setEmprestado(false);
        listaBiblioteca.add(item);
        emprestados.remove(item);
    }

    public void escolher_item_emprestados(Scanner scanner) {
        System.out.println("Insira o ID do item que deseja adicionar a lista de emprestados: ");
        int idDesejado = scanner.nextInt();

        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca item = listaBiblioteca.get(i);
            if (item.getID() == idDesejado) {
                adicionar_na_lista_emprestados(item); // Adiciona o item à lista de emprestados
                System.out.println("Item " + item.getTitulo() + " adicionado á lista de emprestados !");
                return; // Sai do método após adicionar o item
            }
        }
        System.out.println("Item não encontrado na lista de Biblioteca.");
    }

    public void escolher_item_lista(Scanner scanner) {
        System.out.println("Insira o ID do item que deseja adicionar a lista da biblioteca: ");
        int idDesejado = scanner.nextInt();

        for (int i = 0; i < listaBiblioteca.size(); i++) {
            Biblioteca item = listaBiblioteca.get(i);
            if (item.getID() == idDesejado) {
                adicionar_na_lista(item); // Adiciona o item à lista de emprestados
                System.out.println("Item " + item.getTitulo() + " adicionado a lista da biblioteca !");
                return; // Sai do método após adicionar o item
            }
        }
        System.out.println("Item não encontrado na lista de Biblioteca.");
    }

    public void mostrar_lista_de_itens() {
        int cont = 0;
        StringBuilder sb = new StringBuilder();
        if (listaBiblioteca.isEmpty()) {
            System.out.println("-- Impossivel visualizar lista de itens: vazia --");
        } else {
            for (Biblioteca bibli : listaBiblioteca) {
                cont++;
                sb.append(" -- ITEM DE NUMERO -- #").append(cont).append("\n");
                sb.append("Titulo do produto: ").append(bibli.getTitulo() + "\n");
                sb.append("ID do produto: ").append(bibli.getID() + "\n");
                sb.append("Situação: ").append(bibli.getEmprestado() + "\n");
                sb.append("------------------------------------------------------------- \n");

            }
        }
        System.out.println(sb.toString());
    }

    public void mostrar_lista_de_emprestados() {
        StringBuilder sb = new StringBuilder();
        int cont = 0;
        if (emprestados.isEmpty()) {
            System.out.println("-- Impossivel visualizar lista de emprestados: vazia --");
        } else {
            System.out.println(" -- LISTA DE EMPRESTADOS -- \n");
            for (Biblioteca bibli : emprestados) {
                cont++;
                sb.append(" -- ITEM DE NUMERO -- #").append(cont).append("\n");
                sb.append("Titulo do produto: ").append(bibli.getTitulo() + "\n");
                sb.append("ID do produto: ").append(bibli.getID() + "\n");
                sb.append("Situação: ").append(bibli.getEmprestado() + "\n");
                sb.append("------------------------------------------------------------- \n");

            }
        }
        System.out.println(sb.toString());
    }

}
