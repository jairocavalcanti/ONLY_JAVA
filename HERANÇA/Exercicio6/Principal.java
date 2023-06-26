package HERANÇA.Exercicio6;

public class Principal {

public static void main(String[] args) {
     
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
   

    p1.setNome("jairo");
    p2.setNome("julia"); 
    p3.setNome("Kbarni");
    p4.setNome("Ana Clara s2"); // <<<<< s2 demais pqp
    

    p1.setSexo("M");
    p2.setSexo("F");
    p3.setSexo("F");
    p4.setSexo("F");
    

    p1.setIdade(21);
    p2.setIdade(20);
    p3.setIdade(24);
    p4.setIdade(19);
     

    p2.setCurso("DDS");
    p3.setSalario(7000);
    p4.setSetor("estoque");
    
    
    
    //LINHAS ERRADAS//
    
    //p1.receberaumento(50.00f);
    //p2.mudarTrabalho();
    //p4.cancelarMatr();

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());
  
   }   
}
