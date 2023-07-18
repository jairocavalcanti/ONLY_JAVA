package POLIMORFISMO.Exercicio10;

public class Rugby extends Sports {
    
    private String instruçao;

    public Rugby(String instruçao) {
        super("Rugby");
        this.instruçao = instruçao;
    }


    public String instrução(){
        return instruçao;
    }

    

}
