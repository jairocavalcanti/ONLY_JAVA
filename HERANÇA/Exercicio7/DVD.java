package HERANÇA.Exercicio7;

public class DVD extends Biblioteca {

    private String diretor;
    private Integer minutos;
    private Integer classificacaoIndicativa;

    public DVD() {

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

    public void mostrar_lista_de_dvds() {
        StringBuilder sb = new StringBuilder();
        int cont = 0;
        System.out.println("\n-- DIVISÃO DE DVDS --");
        for (Biblioteca bibli : listaBiblioteca) {
            cont++;
            if (bibli instanceof DVD) {
                DVD dvd = (DVD) bibli;
                sb.append("-- DVD DE NUMERO # ").append(cont).append("\n");
                sb.append("Diretor: ").append(dvd.getDiretor()).append("\n");
                sb.append("Minutos totais: ").append(dvd.getMinutos()).append("\n");
                sb.append("Classificação indicativa: ").append(dvd.getClassificacaoIndicativa()).append("\n");
                sb.append("Emprestado: ").append(dvd.getEmprestado()).append("\n");
                sb.append("ID: ").append(dvd.getID()).append("\n");
                sb.append("------------------------------------------------------------- \n");
            }
        }
        System.out.println(sb.toString());
    }

}
