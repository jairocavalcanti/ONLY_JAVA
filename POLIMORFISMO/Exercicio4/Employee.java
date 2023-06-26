package POLIMORFISMO.Exercicio4;

public class Employee {
    private String nome;
    private String funcao;
  
  
    public Employee(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getFuncao() {
        return funcao;
    }


    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double calcularsalario(){
        return 0.0;
    }
    


}
