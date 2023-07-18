package POLIMORFISMO.Exercicio10;

public class Futebol extends Sports {
    
    private String instruçao;


    public Futebol(String instruçao) {
        super("Futebol");
        this.instruçao = instruçao;
    }

 
    
    public String instrução(){
        return instruçao;
    }


    
}
