package METODOS.Exercicio1;
import java.util.Scanner;

public class MenorNumero {

    public void menornumero(){
        Scanner scanner = new Scanner(System.in);
        
        Integer numero1;
        Integer numero2;
        Integer numero3; 
    
        System.out.println("----BEM VINDO AO MENOR NUMERO----");
        
        System.out.println("Insira o primeiro numero:");
        numero1 = scanner.nextInt();
    
        System.out.println("Insira o segundo numero:");
        numero2 = scanner.nextInt();
    
        System.out.println("Insira o terceiro numero:");
        numero3 = scanner.nextInt();
    
        System.out.println(" : --- : Numeros Inseridos : --- :");
        System.out.println("1:" + numero1);
        System.out.println("2:" + numero2);
        System.out.println("3:" + numero3);
    
        if(numero1<numero2 && numero1<numero3){
        System.out.println("Menor numero inserido:" + numero1);

        }else if(numero2<numero1 && numero2<numero3){
        System.out.println("Menor numero inserido:" + numero2);
        
        }else if(numero3<numero1 && numero3<numero2){
        System.out.println("Menor numero inserido:" + numero3);
        }else{
        System.out.println("XX -- NUMEROS DE MESMO VALOR INSERIDOS -- XX");
        } 


        scanner.close();
        }
    
}
