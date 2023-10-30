package ESTRUTURA_DE_REPETIÇÃO.Exercicio9;


/* Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50 */

public class Principal { 
    public static void main(String[] args) {
    
        System.out.println("Lista de numeros impares de 1 á 50: ");
        for(int i = 0; i < 50 ; i++){
            if(i % 2 == 0){
                System.out.println("-------");
            }else{
                System.out.println(i);
            }

        }

    }
    
}
