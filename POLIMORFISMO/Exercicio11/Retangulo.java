package POLIMORFISMO.Exercicio11;

public class Retangulo extends Shape {
    
    private Double comprimentodabase;
    private Double comprimentoaltura;
    
    public Retangulo(Double comprimentodabase, Double comprimentoaltura) {
        this.comprimentodabase = comprimentodabase;
        this.comprimentoaltura = comprimentoaltura;

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

    
    
    public Double calculararea(){
        return comprimentodabase*comprimentoaltura;
     }
 
     public double calcularperimetro(){
         return  2*(comprimentodabase+comprimentoaltura);
     }
 



}
