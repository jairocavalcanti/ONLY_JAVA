package HERANÇA.Exercicio6;

public class Pessoa {
 
   public String nome;
   public int idade;
   public String sexo;

   
public void fazerAniversario(){
    this.idade ++;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

@Override
public String toString() {
    return "Pessoa [nome: " + nome + " // idade: " + idade + " // sexo: " + sexo + "]";
}


}
