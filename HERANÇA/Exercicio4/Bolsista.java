package HERANÇA.Exercicio4;

public class Bolsista extends Aluno {


    public void renovarbolsa(){
        System.out.println("Renovando bolsa de:" + nome);
    }
    
    @Override
    public void pagarmensalidade(){
       System.out.println(nome + " É bolsista! Pagamento facilitado" + " Curso em questao:" + this.getCurso());
    }

}
