package ARRAY_LIST_E_ARRAY.Exercicio1;


public class Consoles {
    
    String nome;
    String cor;
    String modelo;
    Integer numerodeserie;

  
    public Consoles(String nome, String cor, String modelo, Integer numerodeserie){
       
        this.nome = nome;
        this.cor = cor;
        this.modelo = modelo; 
        this.numerodeserie = numerodeserie;
    }
    
   
    public Integer getNumerodeserie() {
        return numerodeserie;
    }


    public void setNumerodeserie(Integer numerodeserie) {
        this.numerodeserie = numerodeserie;
    }
   
   
   
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCor() {
        return cor ;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Nome do console:" + nome + " // // Modelo:" + modelo; 
    }


  }
