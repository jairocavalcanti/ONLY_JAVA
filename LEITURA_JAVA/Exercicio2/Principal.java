package LEITURA_JAVA.Exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal2 {
    
    public static void main(String[] args) {
        
        String path = "c:\\java\\in.txt";
        
        //filereader para pegar a referencia da string de entrada que o arquivo irá ler
        FileReader fr = null;
        //BufferedReader gerencia a memoria usada para leitura
        BufferedReader br = null;
   
        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            
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
        finally{
            try{
               br.close();
               fr.close();
            }
            catch(IOException e){
                //imprimir na tela todo o stack trace dos erros
                e.printStackTrace();
            }
        }  
    }
}
