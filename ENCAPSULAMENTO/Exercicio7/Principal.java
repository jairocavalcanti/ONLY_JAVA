package ENCAPSULAMENTO.Exercicio7;

import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
     
        Banco banco = new Banco();
        Locale.setDefault(Locale.US);

        banco.abrirconta("1709",1000.00, "Jairo");

        banco.depositar("1709", 200);
        banco.sacar("1709", 100);
        banco.consultarSaldo("1709");

        banco.fecharConta("1709");

       
        
    }
    
}
