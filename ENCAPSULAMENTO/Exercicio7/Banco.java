package ENCAPSULAMENTO.Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Contabancaria> contas = new ArrayList<>();

    public Banco(){
      
    }
    

    public void abrirconta(String numeroconta, Double saldo, String titular){
        for(Contabancaria c: contas){
            if(c.getNumeroconta().equals(numeroconta)){
                System.out.println("!!_Conta já registrada_!!");
                return;           
            }
        }

        Contabancaria novaConta = new Contabancaria(numeroconta, saldo, titular);
        contas.add(novaConta);
        System.out.println("Conta criada com sucesso.");

    }


    public void fecharConta(String numeroConta) {
        for (Contabancaria c : contas) {
            if (c.getNumeroconta().equals(numeroConta)) {
                contas.remove(c);
                System.out.println("Conta fechada com sucesso.");
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }


    public void depositar(String numeroconta, double valor){
          for (Contabancaria c : contas){
            if (c.getNumeroconta().equals(numeroconta)) {
                c.depositar(valor);
                return;
          }
        }
        System.out.println("Conta não encontrada");  
    }


    public void sacar(String numeroConta, double valor) {
        for (Contabancaria c : contas) {
            if (c.getNumeroconta().equals(numeroConta)) {
                c.sacar(valor);
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }

    
    public void consultarSaldo(String numeroConta) {
        for (Contabancaria c : contas) {
            if (c.getNumeroconta().equals(numeroConta)) {
                c.consultarsaldo();
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }


    public List<Contabancaria> getContas() {
        return contas;
    }


}
