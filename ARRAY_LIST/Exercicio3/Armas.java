package ARRAY_LIST.Exercicio3;

public class Armas {
    
    String nome;
    String pais_de_origem;
    Double calibre;
   

    public Armas(String nome, String pais_de_origem, Double calibre) {
        this.nome = nome;
        this.pais_de_origem = pais_de_origem;
        this.calibre = calibre;
    }
   
   
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


    public Double getCalibre() {
        return calibre;
    }


    public void setCalibre(Double calibre) {
        this.calibre = calibre;
    }


}
