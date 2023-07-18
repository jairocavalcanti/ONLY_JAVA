package METODOS.Exercicio8;

public class Metodovogais {
    

    public void metodo(String palavra){
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
            
        
        for(int i =0; i< palavra.length(); i++){
            if(palavra.charAt(i) == 'a'){
                contadorA = 1;
            }if(palavra.charAt(i) == 'e'){
                 contadorE = 1;
            }if(palavra.charAt(i) == 'i'){
                contadorI = 1;
            }if(palavra.charAt(i) == 'o'){
                contadorO = 1;
            }if(palavra.charAt(i) == 'u'){
                contadorU = 1;
            }
        
        }

         int soma = contadorA + contadorE + contadorI + contadorO + contadorU;

         System.out.println("Numero de vogais na palavra inserida: " + soma);
        
    }

}
