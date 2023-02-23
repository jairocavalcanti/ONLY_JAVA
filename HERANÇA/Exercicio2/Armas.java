package HERANÇA.Exercicio2;

public class Armas {
    
    private String nome;
    private String pais_de_origem;
    private Integer calibre;
   
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais_de_origem() {
        return pais_de_origem;
    }
    public void setPais_de_origem(String pais_de_origem) {
        this.pais_de_origem = pais_de_origem;
    }
    public Integer getCalibre() {
        return calibre;
    }
    public void setCalibre(Integer calibre) {
        this.calibre = calibre;
    }

    @Override
    public String toString() {
       return  "Nome:" + "  " + nome + " /// " + "País de origem:" + "  " + pais_de_origem + " /// " + "Calibre:" + "  "+ calibre;
    } 

}
