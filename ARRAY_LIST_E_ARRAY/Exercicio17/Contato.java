package Exercicio1;

public class Contato {
    
    private String nome;
    private int id;
    private Double idade;

    ListaContato lc = new ListaContato();

    public Contato(){

    }

    public Contato(String nome, int id, Double idade) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getIdade() {
        return idade;
    }
    public void setIdade(Double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
        
       sb.append("------------------------------------------ \n");
       sb.append("--- CONTATO DE ID :" + id  + "\n");
       sb.append("Nome  :" + nome + "\n");
       sb.append("Idade :" + idade + "\n"); 
       sb.append("------------------------------------------ \n");
       
    return sb.toString();
    }
    

}
