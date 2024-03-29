package HERANÇA.Exercicio6;

public class Funcionario extends Pessoa {
  
    private String setor;
    private boolean trabalhando;


    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


    @Override
    public String toString() {
        return "Funcionario [setor: " + setor + " // trabalhando: " + trabalhando + " // Nome: " + nome + " // Idade: " + idade + " // Sexo: " + sexo + "]";
    }

    
    
}
