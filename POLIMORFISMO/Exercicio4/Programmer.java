package POLIMORFISMO.Exercicio4;

public class Programmer extends Employee  {

    private double basesalary;
    private double bonus;
    

    public Programmer(String nome, String funcao, double basesalary, double bonus) {
        super(nome, funcao);
        this.basesalary = basesalary;
        this.bonus = bonus;
    }
    
    public double calcularsalario(){
       return basesalary + bonus;
    }

    


}
