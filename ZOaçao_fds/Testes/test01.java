package ZOaçao_fds.Testes;
import java.util.Scanner;


public class test01 {
   
    private static int count = 1;
    private String produto;
    private int idade;


    public void Produto01(){
       
        
        test01.count += 1;
        
    }


    //INTERESSANTE INTERESSANTE INTERESSANTE INTERESSANTE// 
    public void name1() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("insira idade:");
    idade = scanner.nextInt();  
    this.idade++;
    System.out.println(idade);
     
    

        scanner.close();
    }

public static void main(String[] args) {
test01 test = new test01();
test.name1();

}


}
