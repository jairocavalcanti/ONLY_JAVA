package POLIMORFISMO.Exercicio7;

public class Principal {
    public static void main(String[] args) {
        
        Locadora loc = new Sextafeira13("Sexta feira 13", 30.00);
        Locadora loc2 = new Projeto_x("ProjetoX", 25.00);

        System.out.println();
        System.out.println("Preco de compra do filme sexta feira 13: " + loc.precodecompra()); 
        System.out.println(); 
        System.out.println("Preco de compra do filme projeto x: " + loc2.precodecompra());
        System.out.println("-----------------------------------------------------------------");
    }
    
}
