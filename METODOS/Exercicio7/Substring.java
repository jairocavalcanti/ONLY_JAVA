package METODOS.Exercicio7;

public class Substring {
    public static void main(String[] args) {
        String str = "Jairo";

        //'substring' possibilita a impressão de um caracter especifico de determinada String
        //Essa impressao acontecerá pela subtração dos caracteres de determinada String
       

        /*
          Exemplo: se a String possui 5 caracteres o e o numero posto no substring for = '1', 
          serão imprimidos os ultimos 4 caracteres da String
        */
         
        
        /*
         Codigos com a mesma finalidade, ambos imprimem as ultimas 4 letras da String, 
         atraves do começo de impressao pelo caracter de numero '1'
        */
        System.out.println("Ultimos 4 caracteres: " + str.substring(str.length() - 4));
        System.out.println("--- --- --- --- --- ---");
        System.out.println(str.substring(1));
    
        //BeginIndex: Indice inicial - de onde o contador ira começar para imprimir os caracteres
        //EndIndex: Indice final - onde o contador ira parar de percorrer os caracteres
        

        System.out.println("Caractere do meio da palavra: " + str.substring(2, 3));
        System.out.println("String completa: " + str.substring(0,5));
    
      }
    
}
