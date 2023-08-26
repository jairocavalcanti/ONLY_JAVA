package TESTES.Teste1;

public class Idade {
    public static void idademe(){
        Info inf = new Info();
        System.out.println("-----IDADE DO INDIVIDUO-----");
        System.out.println("Ano de nascimento:" + inf.getDatanascimento());
        System.out.println("Idade do individuo em 2022:" + (2022 - inf.getDatanascimento()));
    }

    
    
}
