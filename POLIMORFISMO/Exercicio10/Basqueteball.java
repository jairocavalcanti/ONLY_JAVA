package POLIMORFISMO.Exercicio10;

public class Basqueteball extends Sports {
    
    private String instruçao;

    public Basqueteball(String instruçao) {
        super("Basquete");
        this.instruçao = instruçao;
    }

    public String instrução(){
      return instruçao;
    }

}
