package HERANÇA.Exercicio7;

public class DVD extends Biblioteca{
    
    private String diretor;
    private Integer minutos;
    private Integer classificacaoIndicativa;
    

    public DVD(){

    }
    
    public DVD(String titulo, Integer iD, boolean emprestado, String diretor, Integer minutos,
    Integer classificacaoIndicativa) {
        super(titulo, iD, emprestado);
        this.diretor = diretor;
        this.minutos = minutos;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public DVD(String diretor, Integer minutos, Integer classificacaoIndicativa) {
        this.diretor = diretor;
        this.minutos = minutos;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(Integer classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

   
}
