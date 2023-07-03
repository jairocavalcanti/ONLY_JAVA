package METODOS.Exercicio6;

public class Media {
    
    private double numero1;
    private double numero2;
    private double numero3;
    
    
    public Media(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double media2(){
        return (numero1+numero2+numero3) /3;
    }
     

}
