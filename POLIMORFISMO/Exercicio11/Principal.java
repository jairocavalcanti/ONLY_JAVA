package POLIMORFISMO.Exercicio11;


/*
 *  Escreva um programa Java para criar uma classe Shape com os métodos getArea() e getPerimeter(). 
 * Crie três subclasses: Círculo, Retângulo e Triângulo. Substitua os métodos getArea() e getPerimeter() 
 * em cada subclasse para calcular e retornar a área e o perímetro das respectivas formas.
 */
public class Principal {
    public static void main(String[] args) {
    
        System.out.println("-------------------------------------------------------------------------------------------");

        Shape shap = new Triangulo(20.00, 30.00);
        System.out.println("Comprimento da base do triangulo:  " + shap.getComprimentodabase());
        System.out.println("Comprimento da altura do triangulo:  " + shap.getComprimentoaltura());
      
        System.out.println();

        System.out.println("Area do triangulo:  " + shap.calculararea()); 
        System.out.println("Perimetro do triangulo:  " + shap.calcularperimetro());

        System.out.println("-------------------------------------------------------------------------------------------");
     
        Shape shap2 = new Circulo(10.00);
        System.out.println("Raio do circulo: " + shap2.getRaio());

        System.out.println();

        System.out.println("Area do circulo: " + shap2.calculararea());
        System.out.println("Perimetro do circulo:  " + shap2.calcularperimetro());
  
        System.out.println("-------------------------------------------------------------------------------------------");

        Shape shap3 = new Retangulo(30.00, 40.00);
        System.out.println("Comprimento da base do retangulo:  " + shap3.getComprimentodabase());
        System.out.println("Comprimento da altura do retangulo:  " + shap3.getComprimentoaltura());

        System.out.println();

        System.out.println("Area do retangulo: " + shap3.calculararea());
        System.out.println("Perimetro do retangulo:  " + shap3.calcularperimetro());
  

    }
    
}
