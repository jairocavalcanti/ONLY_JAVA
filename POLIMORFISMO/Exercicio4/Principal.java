package POLIMORFISMO.Exercicio4;

//Programa para pratica de polimorfismo com uso de construtores


public class Principal {
    public static void main(String[] args) {
 
        Employee emp1 = new Manager("Jairo", "programador", 400, 100);
        System.out.println(emp1.calcularsalario()); 
 
        Employee emp2 = new Programmer("juju", "analista", 250, 300);
        System.out.println(emp2.calcularsalario());
    }
}
