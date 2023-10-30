package ESTRUTURA_DE_REPETIÇÃO.Exercicio3;
import java.util.Scanner;

/* 
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; 
*/

public class Principal { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int limite = 0;
      boolean nomecorreto = false;
      boolean idadecorreta = false;
      boolean salariocorreto = false;
      boolean sexocorreto = false;
      boolean estado_civil_correto = false;


      for(int i = 0; i< limite; i++){
        System.out.println("Insira um nome com mais de 3 caracteres: ");
        String nome = scanner.next();
        if(nome.length() > 3){
            nomecorreto = true;
        }else{
            nomecorreto = false;
        }

        System.out.println("Insira uma idade entre 0 e 150: ");
        int idade = scanner.nextInt();
        if(idade > 0 && idade <= 150){
            idadecorreta = true;
        }else{
            idadecorreta = false;
        }


        System.out.println("Insira um salario maior que zero: ");
        double salario = scanner.nextDouble();
        if(salario > 0){
           salariocorreto = true;
        }else{
            salariocorreto = false;
        }

        System.out.println("Insira o sexo: F - feminino // M - masculino");
        String sexo = scanner.next();
        if(sexo.toUpperCase().equals("f") || sexo.toUpperCase().equals("m")){
            sexocorreto = true;
        }else{
            sexocorreto = false;
        }

        //estado_civil_correto = "scvd".contains(ec.toLowerCase());
        System.out.println("Insira o estado civil: s , c , v , d");
        String ec = scanner.next();
        if(ec.toLowerCase().equals("s") || ec.toLowerCase().equals("c") || ec.toLowerCase().equals("v") || ec.toLowerCase().equals("d")){
            estado_civil_correto = true;
        }else{
            estado_civil_correto = false;
        }
     
        boolean dadoscorretos = nomecorreto && idadecorreta && salariocorreto && sexocorreto && estado_civil_correto;

        if(dadoscorretos){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salario: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado civil: " + ec);
            System.out.println("Dados inseridos corretamente !");
            break;
        }else{
            System.out.println("Um dos dados foi inserido corretamente, observe abaixo: ");
            if(!nomecorreto){
                System.out.println("Nome inserido incorretamente! " + nome);
            }if(!idadecorreta){
                System.out.println("Idade inserida incorretamente! " + idade);
            }if(!salariocorreto){
                System.out.println("Salario inserido incorretamente!" + salario);
            }if(!sexocorreto){
                System.out.println("Sexo inserido incorretamente! " + sexo);
            }if(!estado_civil_correto){
                System.out.println("Estado civil inserido incorretamente! " + ec);
            }
        }

    
    }

      scanner.close();
    }
    
}
