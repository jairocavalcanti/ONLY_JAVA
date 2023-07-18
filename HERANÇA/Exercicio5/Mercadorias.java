package HERANÇA.Exercicio5;

public class Mercadorias {
  
   private String numerodeserie;
   private String nome;
   private String quantidade;


public String getNumerodeserie() {
    return numerodeserie;
}

public void setNumerodeserie(String numerodeserie) {
    this.numerodeserie = numerodeserie;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getQuantidade() {
    return quantidade;
}


public void setQuantidade(String quantidade) {
    this.quantidade = quantidade;
}


@Override
public String toString() {
    return "Mercadorias [numerodeserie = " + numerodeserie + ", nome = " + nome + ", quantidade = " + quantidade + "]";
} 



}
