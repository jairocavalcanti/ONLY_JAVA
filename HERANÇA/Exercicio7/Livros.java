package HERANÇA.Exercicio7;

public class Livros extends Biblioteca {

    private String autor;
    private Integer numerosDePaginas;
    private String genero;

    public Livros() {

    }

    public Livros(String titulo, Integer iD, boolean emprestado, String autor, Integer numerosDePaginas,
            String genero) {
        super(titulo, iD, emprestado);
        this.autor = autor;
        this.numerosDePaginas = numerosDePaginas;
        this.genero = genero;
    }

    public Livros(String autor, Integer numeros_de_paginas, String genero) {
        this.autor = autor;
        this.numerosDePaginas = numeros_de_paginas;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeros_de_paginas() {
        return numerosDePaginas;
    }

    public void setNumeros_de_paginas(Integer numeros_de_paginas) {
        this.numerosDePaginas = numeros_de_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrar_lista_de_livros() {
        int cont = 0;
        for (Biblioteca bibli : listaBiblioteca) {
            cont++;
            if (bibli instanceof Livros) {
                Livros liv = (Livros) bibli;
                StringBuilder sb = new StringBuilder();
                sb.append("-- LIVRO DE NUMERO # ").append(cont).append("\n");
                sb.append("Autor: ").append(liv.getAutor()).append("\n");
                sb.append("Numeros de páginas do livro: ").append(liv.getNumeros_de_paginas()).append("\n");
                sb.append("Genero do livro: ").append(liv.getGenero()).append("\n");
                sb.append("ID: ").append(liv.getID()).append("\n");
                sb.append("------------------------------------------------------------- \n");
                System.out.println(sb.toString());
            }
        }
    }

}
