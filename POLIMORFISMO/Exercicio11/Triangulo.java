package POLIMORFISMO.Exercicio11;

public class Triangulo extends Shape{
    
    private Double comprimentodabase;
    private Double comprimentoaltura;
    


    public Triangulo(Double comprimentodabase, Double comprimentoaltura) {
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
        return comprimentoaltura*comprimentodabase/2;
     }
 
     public double calcularperimetro(){
         return comprimentodabase+(comprimentoaltura+comprimentoaltura); 
     }
    




}
