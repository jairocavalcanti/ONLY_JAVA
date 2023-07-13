package METODOS.Exercicio7;

public class Caractere {
    

    public static String caracteredomeio(String palavra){
      
        int position;
        int length;

        //par
        if(palavra.length() % 2 == 0)
        {
          position = palavra.length() / 2 - 1;
          length = 2;
        }
        //impar
        else
        {
          position = palavra.length() / 2;
          length = 1;
        }
                             //BeginIndex  //EndIndex 
        return palavra.substring(position, position + length);
    }
     
   


}
