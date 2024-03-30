package HERANÇA.Exercicio7;

import java.util.ArrayList;

public class Biblioteca {

    private String titulo;
    private Integer ID;
    private boolean emprestado;
    

    private ArrayList<Biblioteca> listaBiblioteca = new ArrayList<>();


    public Biblioteca(){

    }
    
    public Biblioteca(String titulo, Integer iD, boolean emprestado) {
        this.titulo = titulo;
        ID = iD;
        this.emprestado = emprestado;
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


    public void adicionar_na_lista(DVD dvd){

        listaBiblioteca.add(dvd);
        
    }

    public void mostrar_lista(){
        StringBuilder sb = new StringBuilder();
        for (Biblioteca bibli : listaBiblioteca) {
            sb.append("Titulo do produto: ").append(bibli.getTitulo());
            sb.append("ID do produto: ").append(bibli.getID());
            sb.append("Situação: ").append(bibli.getEmprestado());
        }
    }
}
