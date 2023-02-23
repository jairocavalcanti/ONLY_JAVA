package HERANÇA.Exercicio1;

public class Professor extends Pessoa {
    private  String especialidade;
    private int salario; 

   
   
    public void receberaumento(float aumento){
        this.salario += aumento;
    }
   
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
