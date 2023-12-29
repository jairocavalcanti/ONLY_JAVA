package MATRIZ.Exercicio8;
import java.util.Scanner;

 /*
 Programa para prática de operações matematicas básicas com matrizes 
 preenchidas pelo usuário 
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operações ops_2 = new Operações();
        boolean ops = false;

        System.out.println("Insira o numero de LINHAS da matriz_1: ");
        int linhas_1 = scanner.nextInt();

        System.out.println("Insira o numero de COLUNAS da matriz_1: ");
        int colunas_1 = scanner.nextInt();

        System.out.println("Insira o numero de LINHAS da matriz_2: ");
        int linhas_2 = scanner.nextInt();

        System.out.println("Insira o numero de COLUNAS da matriz_2: ");
        int colunas_2 = scanner.nextInt();

        int matriz_1[][] = new int[linhas_1][colunas_1];
        int matriz_2[][] = new int[linhas_2][colunas_2];
        int matriz_soma[][] = new int[linhas_1][colunas_2];

        ops_2.preenchers_matriz_1(scanner, linhas_1, colunas_1, matriz_1);
        ops_2.preencher_matriz_2(scanner, linhas_2, colunas_2, matriz_2);
        ops_2.mostrar_matriz_1(linhas_1, colunas_1, matriz_1);
        ops_2.mostrar_matriz_2(linhas_2, colunas_2, matriz_2);

        while(ops != true){
        System.out.println("Insira a operação que deseja realizar com as matrizes: 1 - SOMA // 2 - SUBTRAÇÃO // 3 - MULTIPLICAÇÃO // 0 - ENCERRAR");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println();
                System.out.println("Operação de SOMA selecionada! ");
                ops_2.somarmatrizes(linhas_1, colunas_1, linhas_2, colunas_2, matriz_1, matriz_2, matriz_soma);
                ops_2.resultado_soma(linhas_1, colunas_1, linhas_2, colunas_2, matriz_1, matriz_2, matriz_soma);

                break;
            
            case 2: 
                System.out.println("SUBTRAÇÃO !");     
                break;

            case 3:
                System.out.println("MULTIPLICAÇÃO !");
                break;
           
            case 0:
                System.out.println("Programa Encerrado...");
                return;    

            default:
                System.out.println("Insira uma opção válida !!");
                break;
        }
    }

        scanner.close();
    }
    
}
