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


    public void adicionar_na_lista(Biblioteca item){

        listaBiblioteca.add(item);
    }

    public void mostrar_lista(){
        StringBuilder sb = new StringBuilder();
        for (Biblioteca bibli : listaBiblioteca) {
           
            if(bibli instanceof DVD){
               DVD dvd = (DVD) bibli;
               sb.append("-------------------------------------------------------------");
               sb.append("Titulo do produto: ").append(bibli.getTitulo() + "/ " + "\n");
               sb.append("ID do produto: ").append(bibli.getID() + "/ " + "\n");
               sb.append("Situação: ").append(bibli.getEmprestado() + "/ " + "\n");
               sb.append("Diretor: ").append(dvd.getDiretor() + "/ " + "\n");
               sb.append("Minutos_de_duração: ").append(dvd.getMinutos() + "/ " + "\n");
               sb.append("Minutos_de_duração: ").append(dvd.getClassificacaoIndicativa() + "/ " +"\n");
               sb.append("-------------------------------------------------------------");

               System.out.println(sb.toString()); 
            }
            
        }
    }
}
