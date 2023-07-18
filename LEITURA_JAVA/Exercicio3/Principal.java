package LEITURA_JAVA.Exercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    //ESTRUTURA RECOMENDADA PARA LEITURA DE ARQUIVOS DE TEXTO

public static void main(String[] args) {
    
    String path = "c:\\java\\in.txt";
   
    List<Produto> list = new ArrayList<Produto>();

    try(BufferedReader br = new BufferedReader(new FileReader(path))){
       
        //ler o arquivo até a quebra de linha e devolve uma string armazenando essa leitura
        String line = br.readLine();
        //variavel line recebendo readline novemente parea tentar ler segunda linha 
        line = br.readLine();
        //enquanto essa linha for diferente de nula o tratamento vem abaixo:
        while(line != null){
            
            //separar as strings do arquivo conforme os espaços entre elas em um vetor
            //funçao split
            //no caso abaixo os 'pedaços' serao recortados conforme a virgula
            String[] vect = line.split(","); 
            String name = vect[0];
            //vect na posiçao 1 esta em formato string e precisa ser convertido para double
            Double price = Double.parseDouble(vect[1]);
            Integer qte = Integer.parseInt(vect[2]);


            Produto prod = new Produto(name, price, qte);
            list.add(prod);

            line = br.readLine();
        } 
       
        System.out.println("PRODUCTS:");
        for(Produto p : list){
             System.out.println(p);
        }

    
    
    }
    catch(IOException e){
        System.out.println("Error:" + e.getMessage());
    }
  }
}
