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
        if (deposito > 0) {
            créditos += deposito;
            System.out.println("Depósito de " + deposito + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public boolean sacarcreditos(int saque){
        if(saque > 0 && créditos >= saque){
            créditos -= saque;
            System.out.println("Saque de " + saque + " feito com sucesso!");
            return true;
        }else{
            System.out.println("Saque nao realizado, saldo insuficiente ou valor invalido! ");
            return false;
        }

    }

    public void verificarcreditos(){
        System.out.println("Créditos restantes nesta conta: " + créditos);
    }



}
