package ENCAPSULAMENTO.Exercicio7;

public class Contabancaria {
   
    private String numeroconta;
    private Double saldo;
    private String titular;
    
    
    public Contabancaria(String numeroconta, Double saldo, String titular) {
        this.numeroconta = numeroconta;
        this.saldo = saldo;
        this.titular = titular;
    }

    
    public Double depositar(double deposito){
        return saldo += deposito;
    }

    public Double sacar(double saque){
        return saldo -= saque;
    }
    
    public void consultarsaldo(){
        System.out.println("Saldo disponvel: " + saldo);
    }



    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

}
