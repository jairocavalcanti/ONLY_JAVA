package POLIMORFISMO.Exercicio11;

public class Shape {

/*
 *  Escreva um programa Java para criar uma classe Shape com os métodos getArea() e getPerimeter(). 
 *  Crie três subclasses: Círculo, Retângulo e Triângulo. Substitua os métodos getArea() e getPerimeter() 
 *  em cada subclasse para calcular e retornar a área e o perímetro das respectivas formas.
 */


    private Double comprimentodabase;
    private Double comprimentoaltura;
    private Double raio;



    public Double calculararea(){
        return 0.0;
    }

    public double calcularperimetro(){
        return 0.0;
    }

    public Double getComprimentodabase() {
        return comprimentodabase;
    }

    public void setComprimentodabase(Double comprimentodabase) {
        this.comprimentodabase = comprimentodabase;
    }

    public Double getComprimentoaltura() {
        return comprimentoaltura;
    }

    public void setComprimentoaltura(Double comprimentoaltura) {
        this.comprimentoaltura = comprimentoaltura;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    
}
