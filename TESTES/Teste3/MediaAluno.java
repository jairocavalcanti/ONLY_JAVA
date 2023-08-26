package TESTES.Teste3;
import java.util.Scanner;
/*Crie uma classe MediaAluno que contenha um atributo do tipo vetor de
inteiros com o nome de notas. Essa classe deve ter um método para adicionar
as notas nesse vetor (os valores que podem ser adicionados no vetor são os
inteiros entre 0 e 100, caso contrário imprime uma mensagem de erro e não
adiciona) e outro método que calcule a média de um aluno e imprima essa
média.  */


//inserindo dados no vetor

public class MediaAluno {
 Scanner scanner = new Scanner(System.in); 

 int vet = 5;
 int[] notas = new int[vet];
 
public void INSERIR_NOTAS(){

System.out.println("---BEM VINDO AS NOTAS---");

for(int i=0;i<vet;i++){
System.out.println("Insira a nota do aluno (0 á 100):");
notas[i] = scanner.nextInt();

if(notas[i]> 100){
System.out.println("Programa encerrado");
return;
      }
   }
}

//manipulando dados do vetor

public void calcularmedia(){
System.out.println("--NOTAS GERAIS--");

for(int i=0;i<vet;i++){
System.out.println("nota" + " " + (i+1) + ":" +  notas[i]);
}

System.out.println("Deseja calcular a media das notas do aluno?");
String resp = scanner.next();

if (resp.equals("sim") && notas[0]<100 && notas[1]<100 && notas[2]<100 && notas[3]<100 && notas[4]<100) {
System.out.println("--MEDIA--");
System.out.println(notas[0] + notas[1] + notas[2] + notas[3] + notas[4] / 5 );
}else{
System.out.println("Reiniciando o programa...");
encerra();
}  

  }

  public void encerra(){
   System.out.println("encerrado");
   return;
  }


}
