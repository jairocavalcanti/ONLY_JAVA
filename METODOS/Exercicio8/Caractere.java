package METODOS.Exercicio8;

public class Caractere {
    

    public static String caracteredomeio(String palavra){
      
        int position;
        int length;

        if(palavra.length() % 2 == 0)
        {
          position = palavra.length() / 2 - 1;
          length =2;
        }
        else
        {
          position = palavra.length() / 2;
          length = 1;
        }
        return palavra.substring(position, position + length);
    }
     
   


}
