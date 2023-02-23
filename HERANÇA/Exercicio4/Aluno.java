package HERANÇA.Exercicio4;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void pagarmensalidade(){
        System.out.println("Pagando mensalidade de aluno:" + this.getNome() + " Curso:" + this.getCurso());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }





}
