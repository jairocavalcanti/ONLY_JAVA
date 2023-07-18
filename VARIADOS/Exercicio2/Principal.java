package VARIADOS.Exercicio2;
import java.util.Scanner;
public class Principal {
/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.*/

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Agenda agenda = new Agenda();

System.out.println("Deseja ativar agenda?");
String escolha = scanner.next();

do{
    
System.out.println("//---ESCOLHA SUA OPÇÃO NA AGENDA---// 1-Realizar cadastros // 2-Imprimir cadastros // 3-imprimir cadastro especifico // 4-imprimir posiçao de cadastro");
Integer opçoes = scanner.nextInt();
switch (opçoes) {
   
    case 1:
    System.out.println("--!!BEM VINDO A ALA DE CADASTROS!!--");
    agenda.criapessoa();

    break;
    
    case 2:
    agenda.mostrarcadastro();
    agenda.posiçao();
    
    break;

    default:
    System.out.println("Programa reinicializado");
    break;
    }
    
    }while(escolha.equals("sim"));  
  
  scanner.close();
  }
}
