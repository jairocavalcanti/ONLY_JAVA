package POLIMORFISMO.Exercicio4;

public class Manager extends Employee {

    private double baseSalary;
    private double bonus;
    
    
    public Manager(String nome, String funcao, double baseSalary, double bonus) {
        super(nome, funcao);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    public double calcularsalario(){
        return baseSalary + bonus;
    }

    }
    

