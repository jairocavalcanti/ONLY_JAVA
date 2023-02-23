package POLIMORFISMO.Exercicio1;

public class Principal {
   
    //Classes abstratas não podem ser instanciadas

    public static void main(String[] args) {
         
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();


  
       
        //Metodos de mesmo nome com retornos diferentes, polimorfismo
        m.emitirSom();
        r.locomover();
        p.locomover();
        a.locomover();
        c.locomover();
        k.locomover();
        j.locomover();
        j.setCorEscama("verde");
        t.locomover();
        g.emitirSom();
        e.fazerNinho();

   
    }

}
