package ENCAPSULAMENTO.Exercicio8;

public class Conta {
    
    private String id;
    private String nome_do_jogador;
    private Integer créditos;
 
 
    public Conta(String id, String nome_do_jogador, Integer créditos) {
        this.id = id;
        this.nome_do_jogador = nome_do_jogador;
        this.créditos = créditos;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getNome_do_jogador() {
        return nome_do_jogador;
    }


    public void setNome_do_jogador(String nome_do_jogador) {
        this.nome_do_jogador = nome_do_jogador;
    }


    public Integer getCréditos() {
        return créditos;
    }


    public void setCréditos(Integer créditos) {
        this.créditos = créditos;
    }


    public void depositarcreditos(int deposito){
          créditos += deposito;
    }

    public void sacarcreditos(int saque){
        créditos -= saque;
    }

    public void verificarcreditos(){
        System.out.println("Créditos restantes nesta conta: " + créditos);
    }



}
