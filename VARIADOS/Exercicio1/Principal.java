package VARIADOS.Exercicio1;
public class Principal {
/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.*/

public static void main(String[] args) {
    Info inf = new Info(); 
    inf.setNome("jairo");
    inf.setAltura(1.89);
    inf.setDatanascimento(1851);


    Info.infogeral();
    Idade.idademe();
    
}

}
