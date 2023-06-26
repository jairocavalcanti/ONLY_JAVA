package POLIMORFISMO.Exercicio8;


/*Escreva um programa Java para criar uma classe base Animal 
(Animal Family) com um método chamado Sound(). 
Crie duas subclasses Bird e Cat. Substitua 
o método Sound() em cada subclasse para 
fazer um som específico para cada animal.*/
public class Principal {
    
    public static void main(String[] args) {
    Animal ani = new Gato("Gato", "Miau");
    ani.someemitido();

    Animal ani2 = new Ave("Pombo","Pruuuuff" );
    ani2.someemitido();

}
    
}
