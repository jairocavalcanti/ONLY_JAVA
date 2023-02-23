package HERANÇA.Exercicio4;

//FALTAM CODIGOS AQUI, DEVER NAO PRONTO!!!!


public class Principal {
    public static void main(String[] args) {
    //Pessoa p1 = new Pessoa();
    
     Visitante v1 = new Visitante();
     v1.setNome("jairo");
     v1.setIdade(21);
     v1.setSexo("M");
     System.out.println(v1.toString()); 
     

     Aluno a1 = new Aluno();
     a1.setNome("Batiatus");
     a1.setMatricula(0000);
     a1.setCurso("dds");
     a1.setIdade(25);
     a1.setSexo("M");
     a1.pagarmensalidade();
   

     Bolsista b1 = new Bolsista();
     b1.setMatricula(2020);
     b1.setNome("Jairo");
     b1.setIdade(29);
     b1.setCurso("Ciencia da computaçao");
     b1.pagarmensalidade();
     b1.fazeraniversario();


     Professor p1 = new Professor();
     p1.setNome("Wanderlei");
     p1.setIdade(50);
     p1.setSexo("M");
     p1.setEspecialidade("Banco de dados");
     p1.fazeraniversario();
  
     
     Tecnico t1 = new Tecnico();
     t1.setNome("Igao");
     t1.setIdade(45);
     t1.setSexo("F");
     t1.fazeraniversario();
     t1.praticar();
    }
    
}
