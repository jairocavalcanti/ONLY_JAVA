package TRY_CATCH.Pratico1;

public class programaprincipal {

    //Regra de negocio 1: a entradatem de ser 20% do valor total do financiamento
    //Regra de negocio 2: o numero minimo de prestações é 6

    public static void main(String[] args) {
        
        double valortotal = 1000.0;
        double entrada = 300.0;
        int parcelas = 5;
       
        //tentar rodar
        try{
        Financiamento f = new Financiamento(valortotal, entrada, parcelas);
        System.out.println(f.prestacao());
        }
        //capturar a excessao e mostrar a mensagem dela
        catch(RuntimeException w){
            System.out.println(w.getMessage());
        }
    }
    
}
