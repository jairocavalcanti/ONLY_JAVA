package VARIADOS.Exercicio1;

public class Info {

private static String nome;
private static Integer datanascimento; 
private static Double altura;


public static void infogeral() {
    Info inf = new Info();
    System.out.println("-----INFORMAÇÕES GERAIS DO INDIVIDUO-----");
    System.out.println("Nome:" + inf.getNome());
    System.out.println("Ano de nascimento:" + inf.getDatanascimento());
    System.out.println("Altura:" + inf.getAltura());
}

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    Info.nome = nome;
}
public Integer getDatanascimento() {
    return datanascimento;
}
public void setDatanascimento(Integer datanascimento) {
    Info.datanascimento = datanascimento;
}
public Double getAltura() {
    return altura;
}
public void setAltura(Double altura) {
    Info.altura = altura;
}
    
}
