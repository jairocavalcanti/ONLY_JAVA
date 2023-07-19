package HERANÇA.Exercicio6;

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


    @Override
    public String toString() {
        return "Professor [especialidade: " + especialidade + " // salario: " + salario + " // Nome: " + nome + " // Idade: " + idade + " // Sexo: " + sexo + "]";
    }

    


}
