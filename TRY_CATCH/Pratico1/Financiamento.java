package TRY_CATCH.Pratico1;

public class Financiamento {
    
    public Double valortotal;
    public Double entrada;
    public Integer parcelas;
   
    //sysout nao pode ser usado na classe de dominio
    //interação com tela é responsabilidade da view, do programa principal
    public Financiamento(Double valortotal, Double entrada, Integer parcelas) {
      

        if(entrada < valortotal*0.2){
           throw new RuntimeException("a entrada deve ser pelo menos 20% do valor total");
        }
        else if(parcelas < 6){
           throw new RuntimeException("O numero minimo de parcelas deve ser 6");
        }
      
        
        this.valortotal = valortotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    
    public double prestacao(){
        return (valortotal - entrada) / parcelas;
    }



}
