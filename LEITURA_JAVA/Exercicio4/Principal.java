package LEITURA_JAVA.Exercicio4;

    
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    
    //ESTRUTURA RECOMENDADA PARA LEITURA DE ARQUIVOS DE TEXTO

public static void main(String[] args) {
    
    String path = "c:\\java\\in.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
        //ler o arquivo até a quebra de linha e devolve uma string armazenando essa leitura
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        } 
    }
    catch(IOException e){
        System.out.println("Error:" + e.getMessage());
    }
  }
}




