package HERANÇA.Exercicio7;

public class Revistas extends Biblioteca {
    
    private String editora;
    private Integer numeroDeEdicao;
    private Integer idDoLivro;
   

    public Revistas(){

    }
   
    public Revistas(String titulo, Integer iD, boolean emprestado, String editora, Integer numeroDeEdicao,
            Integer idDoLivro) {
        super(titulo, iD, emprestado);
        this.editora = editora;
        this.numeroDeEdicao = numeroDeEdicao;
        this.idDoLivro = idDoLivro;
    }

    public Revistas(String editora, Integer numeroDeEdicao, Integer idDoLivro) {
        this.editora = editora;
        this.numeroDeEdicao = numeroDeEdicao;
        this.idDoLivro = idDoLivro;
    }


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public void setNumeroDeEdicao(Integer numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public Integer getIdDoLivro() {
        return idDoLivro;
    }

    public void setIdDoLivro(Integer idDoLivro) {
        this.idDoLivro = idDoLivro;
    }

}
