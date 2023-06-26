package POLIMORFISMO.Exercicio2;

public abstract class Armas {
    
    private String nome;
    private Integer peso;
    private String classe;

    public abstract void atirar();
    public abstract void mostrarnome();
    public abstract void mostrarclasse();
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPeso() {
        return peso;
    }
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }

}
