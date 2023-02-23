package ZOaçao_fds.Zoa5;
import java.util.Scanner;


public class Principal {
 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

Integer numero1;
Integer numero2;

System.out.println("Insira um numero:");
numero1 = scanner.nextInt();

System.out.println("Insira o segundo numero:");
numero2 = scanner.nextInt();

System.out.println("Somar:" + (numero1 + numero2));

scanner.close();

}

    
}
