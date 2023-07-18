package POLIMORFISMO.Exercicio6;


//pratica de polimorfismo com o uso do construtores 
public class Principal {
    public static void main(String[] args) {
        
       Softwares soft = new AppContabilidade("INSPIRON", 2.200, 150.00);
       System.out.println("Preço para aluguel por 2 meses: -- " + soft.aluguel()); 

    }
    
}
