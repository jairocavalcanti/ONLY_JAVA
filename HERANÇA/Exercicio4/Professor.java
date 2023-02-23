package HERANÇA.Exercicio4;

public class Professor extends Pessoa{

    private String especialidade;
    private String salario;
    
    public void receberaumento(){
        System.out.println("Aumento salarial concedido");
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    
}
