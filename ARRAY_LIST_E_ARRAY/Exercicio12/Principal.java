package ARRAY_LIST_E_ARRAY.Exercicio12;


//Escreva um programa Java para testar se uma matriz contém um valor específico

// SINTAXE DA MATRIZ
// int [][] matriz = new int [10][10];   

public class Principal {

    public static void main(String[] args) {
        
        int[] meuarray = {2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008};

        if(meuarray[0] == 2001){
            System.out.println("Tem 2001");
        }else{
            System.out.println("Nao tem 2001");
        }
    }
}
