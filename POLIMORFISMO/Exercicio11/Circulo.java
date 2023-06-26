package POLIMORFISMO.Exercicio11;

public class Circulo extends Shape {
    
    private Double pi = 3.14;
    private Double raio;


    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double calculararea(){
        return pi *(raio*raio);
    }

    public double calcularperimetro(){
       return 2 * pi *raio;
    }


}
