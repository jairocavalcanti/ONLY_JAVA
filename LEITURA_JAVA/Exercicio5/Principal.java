package LEITURA_JAVA.Exercicio5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Principal {
    
    public static void main(String[] args) {

        System.out.println("---NOTA ARMAZENADA NO DISCO C DO COMPUTADOR---");

        String path = "c:\\java\\in2.txt";
        
        try (BufferedReader BR = new BufferedReader(new FileReader(path))){
            String linha = BR.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = BR.readLine();
            }
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
